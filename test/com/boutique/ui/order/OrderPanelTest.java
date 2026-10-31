package com.boutique.ui.order;

import com.boutique.data.CustomerDAO;
import com.boutique.data.ProductDAO;
import com.boutique.enums.ProductCategory;
import com.boutique.model.Customer;
import com.boutique.model.Product;
import com.boutique.service.OrderService;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import javax.swing.table.TableModel;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for OrderPanel (FR3.5/FR5.2): queue of CONFIRMED orders and its buttons. */
public class OrderPanelTest {
    private final OrderService orders = new OrderService();

    @BeforeEach
    void setUp() {
        DataStore ds = DataStore.getInstance();
        ds.getOrders().clear(); ds.getOrderItems().clear(); ds.getProducts().clear(); ds.getCustomers().clear();
        new CustomerDAO().save(new Customer("C1", "Sara Hasan", "sara@test.com", "33333333", "Manama"));
        new ProductDAO().save(new Product("P1", "Silk Dress", ProductCategory.DRESS, "desc", 50.0, 10));
    }

    private String confirmedOrder() {
        String id = orders.createOrder("C1").getValue().getOrderId();
        orders.addItemToOrder(id, "P1", 1);
        orders.initiateCheckout(id);
        orders.setDeliveryAddress(id, "Road 1, Manama");
        orders.confirmOrder(id);
        return id;
    }

    private JTable table(OrderPanel p) { return findAll(p, JTable.class).get(0); }

    @Test void tableHasSixColumns() {
        TableModel m = table(new OrderPanel()).getModel();
        assertEquals(6, m.getColumnCount());
        assertEquals("Order ID", m.getColumnName(0));
        assertEquals("Customer", m.getColumnName(1));
        assertEquals("Delivery Address", m.getColumnName(2));
        assertEquals("Total", m.getColumnName(3));
        assertEquals("Date", m.getColumnName(4));
        assertEquals("Status", m.getColumnName(5));
    }

    @Test void tableIsReadOnly() {
        assertFalse(table(new OrderPanel()).getModel().isCellEditable(0, 0));
    }

    @Test void emptyQueueShowsNoRows() {
        assertEquals(0, table(new OrderPanel()).getRowCount());
    }

    @Test void showsOnlyConfirmedOrders() {
        String confirmed = confirmedOrder();
        orders.createOrder("C1");                       // stays in CART, must not appear

        JTable t = table(new OrderPanel());

        assertEquals(1, t.getRowCount());
        assertEquals(confirmed, t.getValueAt(0, 0));
        assertEquals("Sara Hasan", t.getValueAt(0, 1));
        assertEquals("CONFIRMED", t.getValueAt(0, 5).toString());
    }

    @Test void refreshLoadsNewOrders() {
        OrderPanel p = new OrderPanel();
        assertEquals(0, table(p).getRowCount());
        confirmedOrder();
        p.refresh();
        assertEquals(1, table(p).getRowCount());
    }

    @Test void panelContainsAllButtons() {
        OrderPanel p = new OrderPanel();
        assertNotNull(button(p, "New Order"));
        assertNotNull(button(p, "View Detail"));
        assertNotNull(button(p, "Cancel Order"));
        assertNotNull(button(p, "Refresh"));
    }
}