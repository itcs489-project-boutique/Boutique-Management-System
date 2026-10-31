package com.boutique.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for the OrderItem model: getters, subtotal and quantity change. */
public class OrderItemTest {

    @Test
    void gettersReturnConstructorValues() {
        OrderItem i = new OrderItem("ITM-0001", "ORD-0001", "PRD-0001", 2, 50.0);

        assertEquals("ITM-0001", i.getItemId());
        assertEquals("ORD-0001", i.getOrderId());
        assertEquals("PRD-0001", i.getProductId());
        assertEquals(2, i.getQuantity());
        assertEquals(50.0, i.getUnitPrice(), 0.001);
    }

    @Test
    void subtotalIsQuantityTimesUnitPrice() {
        assertEquals(100.0, new OrderItem("I", "O", "P", 2, 50.0).getSubtotal(), 0.001);
    }

    @Test
    void changingQuantityChangesSubtotal() {
        OrderItem i = new OrderItem("I", "O", "P", 1, 20.0);
        i.setQuantity(4);
        assertEquals(4, i.getQuantity());
        assertEquals(80.0, i.getSubtotal(), 0.001);
    }

    @Test
    void toStringContainsProductAndQuantity() {
        String s = new OrderItem("I", "O", "PRD-0001", 3, 10.0).toString();
        assertTrue(s.contains("PRD-0001"));
        assertTrue(s.contains("qty=3"));
    }
}