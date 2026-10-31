package com.boutique.data;

import com.boutique.model.OrderItem;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for OrderItemDAO: save, find by order, update and delete by order. */
public class OrderItemDAOTest {
    private OrderItemDAO dao;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().getOrderItems().clear();
        dao = new OrderItemDAO();
    }

    @Test void saveAndFindByOrderId() {
        dao.save(new OrderItem("I1", "O1", "P1", 1, 10.0));
        dao.save(new OrderItem("I2", "O1", "P2", 2, 5.0));
        dao.save(new OrderItem("I3", "O2", "P1", 1, 10.0));

        assertEquals(2, dao.findByOrderId("O1").size());
        assertEquals(1, dao.findByOrderId("O2").size());
        assertTrue(dao.findByOrderId("O9").isEmpty());
    }

    @Test void updateReplacesLineWithSameItemId() {
        dao.save(new OrderItem("I1", "O1", "P1", 1, 10.0));

        assertTrue(dao.update(new OrderItem("I1", "O1", "P1", 5, 10.0)));
        assertEquals(5, dao.findByOrderId("O1").get(0).getQuantity());
    }

    @Test void updateUnknownItemReturnsFalse() {
        assertFalse(dao.update(new OrderItem("I9", "O1", "P1", 1, 10.0)));
    }

    @Test void deleteByOrderIdRemovesOnlyThatOrdersLines() {
        dao.save(new OrderItem("I1", "O1", "P1", 1, 10.0));
        dao.save(new OrderItem("I2", "O2", "P1", 1, 10.0));

        dao.deleteByOrderId("O1");

        assertTrue(dao.findByOrderId("O1").isEmpty());
        assertEquals(1, dao.findByOrderId("O2").size());
    }
}