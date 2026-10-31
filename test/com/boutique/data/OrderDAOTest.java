package com.boutique.data;

import com.boutique.enums.OrderStatus;
import com.boutique.model.Order;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for OrderDAO: save, find (id/customer/status/courier) and update. */
public class OrderDAOTest {
    private OrderDAO dao;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().getOrders().clear();
        dao = new OrderDAO();
    }

    private Order seed(String id, String customerId) {
        Order o = new Order(id, customerId, "Manama");
        dao.save(o);
        return o;
    }

    @Test void saveAndFindById() {
        Order o = seed("ORD-0001", "C1");
        assertTrue(dao.findById("ORD-0001").isPresent());
        assertSame(o, dao.findById("ORD-0001").get());
    }

    @Test void findByIdUnknownReturnsEmpty() {
        assertTrue(dao.findById("ORD-9999").isEmpty());
    }

    @Test void findByCustomerIdReturnsOnlyThatCustomer() {
        seed("ORD-0001", "C1");
        seed("ORD-0002", "C1");
        seed("ORD-0003", "C2");
        assertEquals(2, dao.findByCustomerId("C1").size());
        assertEquals(0, dao.findByCustomerId("C9").size());
    }

    @Test void findByStatusFiltersCorrectly() {
        seed("ORD-0001", "C1").setStatus(OrderStatus.CONFIRMED);
        seed("ORD-0002", "C1");
        assertEquals(1, dao.findByStatus(OrderStatus.CONFIRMED).size());
        assertEquals(1, dao.findByStatus(OrderStatus.CART).size());
        assertEquals(0, dao.findByStatus(OrderStatus.DELIVERED).size());
    }

    @Test void findByCourierIdMatchesAssignedCourier() {
        seed("ORD-0001", "C1").setAssignedCourierId("USR-2");
        seed("ORD-0002", "C1");
        assertEquals(1, dao.findByCourierId("USR-2").size());
        assertEquals(0, dao.findByCourierId(null).size());
    }

    @Test void updateReplacesExistingOrder() {
        seed("ORD-0001", "C1");
        Order replacement = new Order("ORD-0001", "C1", "Manama");
        replacement.setStatus(OrderStatus.CONFIRMED);

        assertTrue(dao.update(replacement));
        assertEquals(OrderStatus.CONFIRMED, dao.findById("ORD-0001").get().getStatus());
    }

    @Test void updateUnknownOrderReturnsFalse() {
        assertFalse(dao.update(new Order("ORD-9999", "C1", "Manama")));
    }
}