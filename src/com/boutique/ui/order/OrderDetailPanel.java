package com.boutique.ui.order;

import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.model.OrderItem;
import com.boutique.model.Product;
import com.boutique.service.CustomerService;
import com.boutique.service.OrderService;
import com.boutique.service.ProductService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Presentation layer (FR3.5): full detail of one order - customer, status, dates,
 * line items with unit price and subtotal, and the grand total.
 * Dependencies: OrderService, CustomerService, ProductService (read-only).
 */
public class OrderDetailPanel extends JPanel {

    /** Builds the detail view for the given order. */
    public OrderDetailPanel(Order order, OrderService orders, CustomerService customers, ProductService products) {
        setLayout(new BorderLayout(8, 8));
        // CustomerService returns null for unknown/inactive customers, so fall back to the id
        Customer found = customers.getCustomerById(order.getCustomerId());
        String customer = found != null ? found.getFullName() : order.getCustomerId();
        JTextArea header = new JTextArea(String.format(
                "Order: %s%nCustomer: %s%nStatus: %s%nOrder date: %s%nTransaction date: %s%nDelivery address: %s",
                order.getOrderId(), customer, order.getStatus(), order.getOrderDate(),
                order.getTransactionDate() == null ? "-" : order.getTransactionDate(),
                order.getDeliveryAddress() == null ? "-" : order.getDeliveryAddress()));
        header.setEditable(false); header.setOpaque(false);
        add(header, BorderLayout.NORTH);

        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Product", "Unit price", "Qty", "Subtotal"}, 0) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        for (OrderItem i : orders.getOrderItems(order.getOrderId())) {
            // Include deactivated products so old orders still show the product name
            String name = products.getAllProductsIncludingInactive().stream()
                    .filter(p -> p.getProductId().equals(i.getProductId()))
                    .map(Product::getName)
                    .findFirst()
                    .orElse(i.getProductId());
            model.addRow(new Object[]{name, String.format("%.3f", i.getUnitPrice()), i.getQuantity(),
                    String.format("%.3f", i.getSubtotal())});
        }
        add(new JScrollPane(new JTable(model)), BorderLayout.CENTER);
        add(new JLabel(String.format("Total: %.3f", orders.getOrderTotal(order.getOrderId())),
                SwingConstants.RIGHT), BorderLayout.SOUTH);
        setPreferredSize(new Dimension(520, 320));
    }
}