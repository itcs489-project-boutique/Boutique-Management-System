package com.boutique.data;

import com.boutique.enums.OrderStatus;
import com.boutique.model.Order;
import com.boutique.util.DataStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Data layer for orders: raw CRUD against DataStore, no business rules.
 * Dependencies: DataStore (singleton).
 */
public class OrderDAO {

    private List<Order> store() { return DataStore.getInstance().getOrders(); }

    /** Adds an order to the data store. */
    public void save(Order o) { store().add(o); }

    /** @return the order with this id, or empty if none exists */
    public Optional<Order> findById(String id) {
        return store().stream().filter(o -> o.getOrderId().equals(id)).findFirst();
    }

    /** @return all orders placed by the given customer */
    public List<Order> findByCustomerId(String customerId) {
        List<Order> out = new ArrayList<>();
        for (Order o : store()) if (o.getCustomerId().equals(customerId)) out.add(o);
        return out;
    }

    /** @return all orders currently in the given status */
    public List<Order> findByStatus(OrderStatus status) {
        List<Order> out = new ArrayList<>();
        for (Order o : store()) if (o.getStatus() == status) out.add(o);
        return out;
    }

    /** @return all orders assigned to the given courier */
    public List<Order> findByCourierId(String courierId) {
        List<Order> out = new ArrayList<>();
        for (Order o : store()) if (courierId != null && courierId.equals(o.getAssignedCourierId())) out.add(o);
        return out;
    }

    /** Replaces the stored order that has the same orderId. @return false if not found */
    public boolean update(Order o) {
        List<Order> list = store();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getOrderId().equals(o.getOrderId())) { list.set(i, o); return true; }
        }
        return false;
    }
}
