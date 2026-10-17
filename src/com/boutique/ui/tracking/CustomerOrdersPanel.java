package com.boutique.ui.tracking;

import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.enums.OrderStatus;
import com.boutique.service.CustomerService;
import com.boutique.service.OrderService;
import com.boutique.service.ProductService;
import com.boutique.ui.order.OrderDetailPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.format.DateTimeFormatter;

/**
 * Presentation layer (FR5.1): a customer's orders with the current status of each.
 * The status column is coloured (green DELIVERED, amber SHIPPED, blue CONFIRMED...) and the
 * table refreshes every 10 seconds with a javax.swing.Timer.
 * Customers do not sign in to this system (only staff/admin/courier users exist), so the panel
 * is opened for one customer id and has a selector to look at another customer.
 * Orders still in CART (never checked out) are not shown.
 */
public class CustomerOrdersPanel extends JPanel {
    private final OrderService orders = new OrderService();
    private final CustomerService customers = new CustomerService();
    private final ProductService products = new ProductService();
    private final JComboBox<Customer> customerBox = new JComboBox<>();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"Order ID", "Date", "Total", "Status", "Delivery Address"}, 0) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    private final JTable table = new JTable(model);
    private final Timer refreshTimer = new Timer(10000, e -> refresh());

    /**
     * @param customerId the customer whose orders are shown first (may be null)
     */
    public CustomerOrdersPanel(String customerId) {
        setLayout(new BorderLayout(8, 8));
        setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        for (Customer c : customers.getAllCustomers()) customerBox.addItem(c);
        Customer first = customerId == null ? null : customers.getCustomerById(customerId);
        if (first != null) {
            for (int i = 0; i < customerBox.getItemCount(); i++) {
                if (customerBox.getItemAt(i).getCustomerId().equals(customerId)) customerBox.setSelectedIndex(i);
            }
        }
        customerBox.addActionListener(e -> refresh());

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        top.add(new JLabel("My Orders - customer:")); top.add(customerBox);
        JButton detail = new JButton("View Detail");
        detail.addActionListener(e -> showDetail());
        JButton refreshBtn = new JButton("Refresh");
        refreshBtn.addActionListener(e -> refresh());
        top.add(detail); top.add(refreshBtn);
        add(top, BorderLayout.NORTH);

        table.getColumnModel().getColumn(3).setCellRenderer(new StatusRenderer());
        add(new JScrollPane(table), BorderLayout.CENTER);
        refresh();
    }

    /** Starts the 10-second auto refresh when the panel is shown. */
    @Override public void addNotify() {
        super.addNotify();
        refreshTimer.start();
    }

    /** Stops the timer when the panel is removed so it does not keep running. */
    @Override public void removeNotify() {
        refreshTimer.stop();
        super.removeNotify();
    }

    /** Reloads the selected customer's orders (newest first), keeping the selected row. */
    private void refresh() {
        Customer customer = (Customer) customerBox.getSelectedItem();
        int selected = table.getSelectedRow();
        model.setRowCount(0);
        if (customer == null) return;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        orders.getOrdersByCustomer(customer.getCustomerId()).stream()
                .filter(o -> o.getStatus() != OrderStatus.CART)
                .sorted((a, b) -> b.getOrderDate().compareTo(a.getOrderDate()))
                .forEach(o -> model.addRow(new Object[]{o.getOrderId(), o.getOrderDate().format(f),
                        String.format("%.3f", orders.getOrderTotal(o.getOrderId())), o.getStatus(),
                        o.getDeliveryAddress() == null ? "-" : o.getDeliveryAddress()}));
        if (selected >= 0 && selected < model.getRowCount()) table.setRowSelectionInterval(selected, selected);
    }

    /** Shows items, prices, total, status and timestamps of the selected order (FR5.1). */
    private void showDetail() {
        int row = table.getSelectedRow();
        if (row < 0) { JOptionPane.showMessageDialog(this, "Select an order first"); return; }
        String id = (String) model.getValueAt(row, 0);
        orders.getOrderById(id).ifPresent(o -> JOptionPane.showMessageDialog(this,
                new OrderDetailPanel(o, orders, customers, products), "Order " + id, JOptionPane.PLAIN_MESSAGE));
    }

    /** Colours the status text so the state is visible at a glance. */
    private static class StatusRenderer extends DefaultTableCellRenderer {
        /** Picks the text colour from the status name. */
        @Override
        public Component getTableCellRendererComponent(JTable t, Object value, boolean sel, boolean focus, int r, int c) {
            Component comp = super.getTableCellRendererComponent(t, value, sel, focus, r, c);
            String s = String.valueOf(value);
            Color color = Color.DARK_GRAY;
            if (s.equals("DELIVERED")) color = new Color(0, 130, 0);
            else if (s.equals("SHIPPED")) color = new Color(210, 130, 0);
            else if (s.equals("CONFIRMED") || s.equals("ASSIGNED")) color = new Color(0, 90, 200);
            else if (s.equals("CANCELLED") || s.equals("PAYMENT_FAILED")) color = new Color(190, 0, 0);
            if (!sel) comp.setForeground(color);
            return comp;
        }
    }
}
