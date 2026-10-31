package com.boutique.ui.order;

import com.boutique.data.CustomerDAO;
import com.boutique.data.ProductDAO;
import com.boutique.enums.ProductCategory;
import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.model.Product;
import com.boutique.service.CustomerService;
import com.boutique.service.OrderService;
import com.boutique.service.ProductService;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for OrderDetailPanel (FR3.5): header, line items and total. */
public class OrderDetailPanelTest {
    private final OrderService orders = new OrderService();
    private String orderId;

    @BeforeEach
    void setUp() {
        DataStore ds = DataStore.getInstance();
        ds.getOrders().clear(); ds.getOrderItems().clear(); ds.getProducts().clear(); ds.getCustomers().clear();
        new CustomerDAO().save(new Customer("C1", "Sara Hasan", "sara@test.com", "33333333", "Manama"));
        new ProductDAO().save(new Product("P1", "Silk Dress", ProductCategory.DRESS, "desc", 50.0, 10));
        orderId = orders.createOrder("C1").getValue().getOrderId();
        orders.addItemToOrder(orderId, "P1", 2);
    }

    private OrderDetailPanel panel() {
        Order o = orders.getOrderById(orderId).get();
        return new OrderDetailPanel(o, orders, new CustomerService(), new ProductService());
    }

    @Test void headerShowsOrderCustomerAndStatus() {
        String header = findAll(panel(), JTextArea.class).get(0).getText();
        assertTrue(header.contains(orderId));
        assertTrue(header.contains("Sara Hasan"));
        assertTrue(header.contains("CART"));
    }

    @Test void missingDatesAndAddressShowDash() {
        String header = findAll(panel(), JTextArea.class).get(0).getText();
        assertTrue(header.contains("Transaction date: -"));
        assertTrue(header.contains("Delivery address: -"));
    }

    @Test void tableListsLineItem() {
        JTable t = findAll(panel(), JTable.class).get(0);
        assertEquals(1, t.getRowCount());
        assertEquals("Silk Dress", t.getValueAt(0, 0));
        assertEquals(2, t.getValueAt(0, 2));
    }

    @Test void totalLabelShowsGrandTotal() {
        assertTrue(hasLabel(panel(), String.format("Total: %.3f", 100.0)));
    }

    @Test void inactiveCustomerFallsBackToCustomerId() {
        new CustomerDAO().deactivate("C1");
        String header = findAll(panel(), JTextArea.class).get(0).getText();
        assertTrue(header.contains("Customer: C1"));
    }
}