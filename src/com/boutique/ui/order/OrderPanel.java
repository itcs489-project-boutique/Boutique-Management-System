package com.boutique.ui.order;

import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.service.CustomerService;
import com.boutique.service.OrderService;
import com.boutique.service.ProductService;
import com.boutique.util.Result;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Presentation layer (FR3.5 / FR5.2): staff queue of CONFIRMED orders, oldest first.
 * Buttons: New Order (opens CreateOrderDialog), View Detail, Cancel Order, Refresh.
 * Register in MainFrame with:  // --- Member 3: Orders ---
 */
public class OrderPanel extends JPanel {
    private final OrderService orders = new OrderService();
    private final CustomerService customers = new CustomerService();
    private final ProductService products = new ProductService();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"Order ID", "Customer", "Delivery Address", "Total", "Date", "Status"}, 0) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    private final JTable table = new JTable(model);

    /** Builds the queue table and its buttons, then loads the data. */
    public OrderPanel() {
        setLayout(new BorderLayout(8, 8));
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton create = new JButton("New Order");
        create.addActionListener(e -> {
            new CreateOrderDialog((Frame) SwingUtilities.getWindowAncestor(this)).setVisible(true);
            refresh();
        });
        JButton detail = new JButton("View Detail");
        detail.addActionListener(e -> showDetail());
        JButton cancel = new JButton("Cancel Order");
        cancel.addActionListener(e -> cancelSelected());
        JButton refresh = new JButton("Refresh");
        refresh.addActionListener(e -> refresh());
        buttons.add(create); buttons.add(detail); buttons.add(cancel); buttons.add(refresh);
        add(buttons, BorderLayout.NORTH);
        refresh();
    }

    /** Reloads the CONFIRMED orders from OrderService. */
    public void refresh() {
        model.setRowCount(0);
        List<Order> list = orders.getConfirmedOrders();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        for (Order o : list) {
            Customer found = customers.getCustomerById(o.getCustomerId());   // null if inactive/unknown
            String name = found != null ? found.getFullName() : o.getCustomerId();
            model.addRow(new Object[]{o.getOrderId(), name, o.getDeliveryAddress(),
                    String.format("%.3f", orders.getOrderTotal(o.getOrderId())),
                    o.getOrderDate().format(f), o.getStatus()});
        }
    }

    /** Returns the order id of the selected row, or null (and warns) if none selected. */
    private String selectedId() {
        int row = table.getSelectedRow();
        if (row < 0) { JOptionPane.showMessageDialog(this, "Select an order first"); return null; }
        return (String) model.getValueAt(row, 0);
    }

    /** FR3.5: shows the detail panel of the selected order in a dialog. */
    private void showDetail() {
        String id = selectedId();
        if (id == null) return;
        orders.getOrderById(id).ifPresent(o -> JOptionPane.showMessageDialog(this,
                new OrderDetailPanel(o, orders, customers, products), "Order " + id, JOptionPane.PLAIN_MESSAGE));
    }

    /** FR3.6: cancels the selected order after confirmation; stock is restored by the service. */
    private void cancelSelected() {
        String id = selectedId();
        if (id == null) return;
        if (JOptionPane.showConfirmDialog(this, "Cancel order " + id + "?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        Result<Order> r = orders.cancelOrder(id);
        if (!r.isSuccess()) JOptionPane.showMessageDialog(this, r.getErrorMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        refresh();
    }
}
