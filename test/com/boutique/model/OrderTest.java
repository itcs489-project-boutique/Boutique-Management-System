package com.boutique.model;

import com.boutique.enums.OrderStatus;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for the Order model: defaults, setters and toString. */
public class OrderTest {

    @Test
    void newOrderStartsInCartWithDefaults() {
        Order o = new Order("ORD-0001", "CST-0001", null);

        assertEquals("ORD-0001", o.getOrderId());
        assertEquals("CST-0001", o.getCustomerId());
        assertEquals(OrderStatus.CART, o.getStatus());
        assertNotNull(o.getOrderDate());
        assertNull(o.getDeliveryAddress());
        assertNull(o.getTransactionDate());
        assertNull(o.getAssignedCourierId());
        assertNull(o.getProofImagePath());
    }

    @Test
    void settersUpdateFields() {
        Order o = new Order("ORD-0001", "CST-0001", null);
        LocalDateTime now = LocalDateTime.now();

        o.setStatus(OrderStatus.CONFIRMED);
        o.setDeliveryAddress("Manama");
        o.setTransactionDate(now);
        o.setAssignedCourierId("USR-0002");
        o.setProofImagePath("proof.png");

        assertEquals(OrderStatus.CONFIRMED, o.getStatus());
        assertEquals("Manama", o.getDeliveryAddress());
        assertEquals(now, o.getTransactionDate());
        assertEquals("USR-0002", o.getAssignedCourierId());
        assertEquals("proof.png", o.getProofImagePath());
    }

    @Test
    void toStringContainsIdCustomerAndStatus() {
        String s = new Order("ORD-0001", "CST-0001", null).toString();
        assertTrue(s.contains("ORD-0001"));
        assertTrue(s.contains("CST-0001"));
        assertTrue(s.contains("CART"));
    }
}