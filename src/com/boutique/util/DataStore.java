package com.boutique.util;

import com.boutique.model.User;
import com.boutique.model.Product;
import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.model.OrderItem;
import com.boutique.enums.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * In-memory singleton data store for the entire application.
 * All service classes read from and write to this shared instance.
 */
public class DataStore {

    private static DataStore instance;

    private final List<User>      users      = new ArrayList<>();
    private final List<Product>   products   = new ArrayList<>();
    private final List<Customer>  customers  = new ArrayList<>();
    private final List<Order>     orders     = new ArrayList<>();
    private final List<OrderItem> orderItems = new ArrayList<>();

    private DataStore() {
        seedData();
    }

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    // ── Accessors ──────────────────────────────────────────────────────────────
    public List<User>      getUsers()      { return users; }
    public List<Product>   getProducts()   { return products; }
    public List<Customer>  getCustomers()  { return customers; }
    public List<Order>     getOrders()     { return orders; }
    public List<OrderItem> getOrderItems() { return orderItems; }

    // ── Seed Data ──────────────────────────────────────────────────────────────
    private void seedData() {
        // Default admin account — password: "admin123"
        users.add(new User(
            IdGenerator.nextUserId(),
            "admin",
            PasswordUtil.hash("admin123"),
            "System Administrator",
            Role.ADMIN
        ));
    }

    /**
     * Clears every list and re-seeds the default admin.
     * Used by tests to start from a clean state.
     */
    public void reset() {
        users.clear();
        products.clear();
        customers.clear();
        orders.clear();
        orderItems.clear();
        seedData();
    }
}