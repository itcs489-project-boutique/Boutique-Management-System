package com.boutique.data;

import com.boutique.model.OrderItem;
import com.boutique.util.DataStore;
import java.util.ArrayList;
import java.util.List;

/**
 * Data layer for order lines: raw CRUD against DataStore, no business rules.
 * Dependencies: DataStore (singleton).
 */
public class OrderItemDAO {

    private List<OrderItem> store() { return DataStore.getInstance().getOrderItems(); }

    /** Adds an order line to the data store. */
    public void save(OrderItem item) { store().add(item); }

    /** @return every line that belongs to the given order */
    public List<OrderItem> findByOrderId(String orderId) {
        List<OrderItem> out = new ArrayList<>();
        for (OrderItem i : store()) if (i.getOrderId().equals(orderId)) out.add(i);
        return out;
    }

    /** Replaces the stored line that has the same itemId. @return false if not found */
    public boolean update(OrderItem item) {
        List<OrderItem> list = store();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getItemId().equals(item.getItemId())) { list.set(i, item); return true; }
        }
        return false;
    }

    /** Removes every line of the given order. */
    public void deleteByOrderId(String orderId) {
        store().removeIf(i -> i.getOrderId().equals(orderId));
    }
}
