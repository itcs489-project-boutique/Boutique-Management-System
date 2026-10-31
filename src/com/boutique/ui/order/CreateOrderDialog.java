package com.boutique.ui.order;

import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.model.OrderItem;
import com.boutique.model.Product;
import com.boutique.service.CustomerService;
import com.boutique.service.OrderService;
import com.boutique.service.PaymentService;
import com.boutique.service.PaymentService.PaymentResult;
import com.boutique.service.ProductService;
import com.boutique.ui.MainFrame;
import com.boutique.ui.checkout.AddressPanel;
import com.boutique.ui.checkout.PaymentPanel;
import com.boutique.ui.checkout.PaymentResultPanel;
import com.boutique.ui.checkout.ProcessingPanel;
import com.boutique.ui.tracking.CustomerOrdersPanel;
import com.boutique.util.Result;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Presentation layer for FR3.1-FR3.3 and the whole checkout flow (FR4).
 * Screens (CardLayout): order builder -> address -> payment -> processing -> result.
 * Calls OrderService for the order and ProductService/CustomerService only to list
 * products and customers (the one allowed cross-service UI call).
 * The payment runs in a SwingWorker so the 3.5 s bank delay never freezes the UI thread,
 * and the dialog cannot be closed while the payment is processing.
 */
public class CreateOrderDialog extends JDialog {
    private final OrderService orders = new OrderService();
    private final ProductService products = new ProductService();
    private final CustomerService customers = new CustomerService();
    private final PaymentService payments = new PaymentService();

    private final CardLayout cards = new CardLayout();
    private final JPanel root = new JPanel(cards);
    /** Remembers the panel currently registered under each card name (see showScreen). */
    private final Map<String, Component> screens = new HashMap<>();
    private final JTextField customerSearch = new JTextField(10);
    private final JButton customerSearchButton = new JButton("Find");
    private final JComboBox<Customer> customerBox = new JComboBox<>();
    private final DefaultTableModel productModel = new DefaultTableModel(
            new String[]{"ID", "Name", "Price", "Stock"}, 0) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    private final DefaultTableModel cartModel = new DefaultTableModel(
            new String[]{"Product", "Unit price", "Qty", "Subtotal"}, 0) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    private final JTable productTable = new JTable(productModel);
    private final JSpinner qty = new JSpinner(new SpinnerNumberModel(1, 1, 999, 1));
    private final JLabel totalLabel = new JLabel("Total: 0.000");
    private final JTextField search = new JTextField(10);
    private PaymentPanel paymentPanel;
    private Order current;
    private boolean processing = false;

    /** Builds the dialog and loads customers and products. */
    public CreateOrderDialog(Frame owner) {
        super(owner, "Create Order", true);
        root.add(buildOrderScreen(), "order");
        setContentPane(root);
        setSize(820, 520);
        setLocationRelativeTo(owner);

        // The window can be closed normally, but never while the bank simulation runs.
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override public void windowClosing(WindowEvent e) {
                if (!processing) dispose();
            }
        });
        loadCustomers("");
        loadProducts();
    }

    /**
     * Shows a screen under the given card name. Any older panel registered under the
     * same name is removed first, so retries (Try Again / Back) never stack stale panels.
     */
    private void showScreen(String name, Component panel) {
        Component old = screens.put(name, panel);
        if (old != null) root.remove(old);
        root.add(panel, name);
        cards.show(root, name);
    }

    /** Screen 1: find a customer, search products, add them, see the running total. */
    private JPanel buildOrderScreen() {
        JPanel p = new JPanel(new BorderLayout(8, 8));
        p.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        top.add(new JLabel("Customer search:")); top.add(customerSearch);
        customerSearchButton.addActionListener(e -> loadCustomers(customerSearch.getText().trim()));
        top.add(customerSearchButton);
        top.add(new JLabel("Customer:")); top.add(customerBox);
        top.add(new JLabel("Product search:")); top.add(search);
        JButton find = new JButton("Search");
        find.addActionListener(e -> loadProducts());
        top.add(find);
        p.add(top, BorderLayout.NORTH);

        JPanel mid = new JPanel(new GridLayout(1, 2, 8, 0));
        mid.add(new JScrollPane(productTable));
        mid.add(new JScrollPane(new JTable(cartModel)));
        p.add(mid, BorderLayout.CENTER);

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottom.add(new JLabel("Qty:")); bottom.add(qty);
        JButton add = new JButton("Add to Order");
        add.addActionListener(e -> addSelectedProduct());
        JButton checkout = new JButton("Checkout");
        checkout.addActionListener(e -> startCheckout());
        bottom.add(add); bottom.add(totalLabel); bottom.add(checkout);
        p.add(bottom, BorderLayout.SOUTH);
        return p;
    }

    /** Fills the customer combo box: all active customers, or those matching the keyword. */
    private void loadCustomers(String keyword) {
        customerBox.removeAllItems();
        List<Customer> list = keyword.isEmpty() ? customers.getAllCustomers() : customers.searchCustomers(keyword);
        for (Customer c : list) customerBox.addItem(c);
    }

    /** Fills the product table using the product search text. */
    private void loadProducts() {
        productModel.setRowCount(0);
        List<Product> list = products.searchProducts(search.getText().trim(), null, 0, Double.MAX_VALUE);
        for (Product p : list) {
            productModel.addRow(new Object[]{p.getProductId(), p.getName(), p.getPrice(), p.getStockQuantity()});
        }
    }

    /** FR3.1 + FR3.2: creates the order on first add, then adds the selected product. */
    private void addSelectedProduct() {
        Customer customer = (Customer) customerBox.getSelectedItem();
        int row = productTable.getSelectedRow();
        if (customer == null) { error("Select a customer first"); return; }
        if (row < 0) { error("Select a product first"); return; }
        if (current == null) {
            Result<Order> created = orders.createOrder(customer.getCustomerId());
            if (!created.isSuccess()) { error(created.getErrorMessage()); return; }
            current = created.getValue();
            customerBox.setEnabled(false);               // the order belongs to one customer
            customerSearch.setEnabled(false);
            customerSearchButton.setEnabled(false);
        }
        String productId = (String) productModel.getValueAt(row, 0);
        Result<OrderItem> r = orders.addItemToOrder(current.getOrderId(), productId, (Integer) qty.getValue());
        if (!r.isSuccess()) { error(r.getErrorMessage()); return; }
        refreshCart();
        loadProducts();                                   // keep the displayed stock in sync
    }

    /** FR3.3: redraws the cart lines and the running total from OrderService. */
    private void refreshCart() {
        cartModel.setRowCount(0);
        for (OrderItem i : orders.getOrderItems(current.getOrderId())) {
            cartModel.addRow(new Object[]{productName(i), String.format("%.3f", i.getUnitPrice()),
                    i.getQuantity(), String.format("%.3f", i.getSubtotal())});
        }
        totalLabel.setText(String.format("Total: %.3f", orders.getOrderTotal(current.getOrderId())));
    }

    /**
     * @return the product name of a line (also for deactivated products),
     *         or its id if the product no longer exists
     */
    private String productName(OrderItem i) {
        return products.getAllProductsIncludingInactive().stream()
                .filter(p -> p.getProductId().equals(i.getProductId()))
                .map(Product::getName)
                .findFirst()
                .orElse(i.getProductId());
    }

    /** @return one text line per order item plus the total, used in summaries */
    private String itemsText(String orderId) {
        StringBuilder sb = new StringBuilder();
        for (OrderItem i : orders.getOrderItems(orderId)) {
            sb.append(String.format("%s  x%d  @ %.3f = %.3f%n",
                    productName(i), i.getQuantity(), i.getUnitPrice(), i.getSubtotal()));
        }
        sb.append(String.format("%nTotal: %.3f", orders.getOrderTotal(orderId)));
        return sb.toString();
    }

    /**
     * FR4.1: shows the full order summary first; if the customer confirms,
     * CART -> PENDING and the address screen opens. Cancel keeps the cart editable.
     */
    private void startCheckout() {
        if (current == null || orders.getOrderItems(current.getOrderId()).isEmpty()) {
            error("Add at least one product first");
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, itemsText(current.getOrderId()),
                "Order summary - continue to checkout?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (choice != JOptionPane.OK_OPTION) return;      // customer goes back to edit the cart

        Result<Order> r = orders.initiateCheckout(current.getOrderId());
        if (!r.isSuccess()) { error(r.getErrorMessage()); return; }
        Customer c = customers.getCustomerById(current.getCustomerId());   // null if not found
        showScreen("address",
                new AddressPanel(c == null ? "" : c.getAddress(), this::saveAddress, this::backToCart));
    }

    /** Back from address: order returns to CART so items can be edited again (FR4.1). */
    private void backToCart() {
        orders.returnToCart(current.getOrderId());
        cards.show(root, "order");
    }

    /** FR4.2: saves the address on the order, then shows the payment form. */
    private void saveAddress(String address) {
        Result<Order> r = orders.setDeliveryAddress(current.getOrderId(), address);
        if (!r.isSuccess()) { error(r.getErrorMessage()); return; }
        paymentPanel = new PaymentPanel(orders.getOrderTotal(current.getOrderId()), this::pay);
        showScreen("payment", paymentPanel);
    }

    /** FR4.4: runs the bank simulation in a SwingWorker and shows the processing screen. */
    private void pay(String cardNumber) {
        processing = true;                                // blocks closing the window
        showScreen("processing", new ProcessingPanel());
        new SwingWorker<PaymentResult, Void>() {
            @Override protected PaymentResult doInBackground() { return payments.process(cardNumber); }
            @Override protected void done() {
                processing = false;
                try { showResult(get()); } catch (Exception ex) { error("Payment failed: " + ex.getMessage()); }
            }
        }.execute();
    }

    /** FR4.5 + FR3.4: approved confirms the order; declined marks it failed and offers retry. */
    private void showResult(PaymentResult result) {
        String id = current.getOrderId();
        if (result == PaymentResult.APPROVED) {
            Result<Order> r = orders.confirmOrder(id);
            if (!r.isSuccess()) { error(r.getErrorMessage()); cards.show(root, "payment"); return; }
            showScreen("result",
                    PaymentResultPanel.approved(r.getValue(), itemsText(id), this::trackOrder, this::dispose));
        } else {
            orders.markPaymentFailed(id);
            showScreen("result", PaymentResultPanel.declined(() -> {
                orders.retryCheckout(id);               // PAYMENT_FAILED -> PENDING
                paymentPanel.reset();
                cards.show(root, "payment");
            }));
        }
    }

    /** "Track Order": closes the dialog and shows the customer's orders in the main window. */
    private void trackOrder() {
        String customerId = current.getCustomerId();
        Window owner = getOwner();
        dispose();
        if (owner instanceof MainFrame) {
            ((MainFrame) owner).showPanel(new CustomerOrdersPanel(customerId));
        }
    }

    /** Shows an error message dialog. */
    private void error(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}