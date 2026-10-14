package com.boutique;

import com.boutique.util.DataStore;

/**
 * Entry point for the Boutique Management System.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize the data store (seeds default admin account)
        DataStore store = DataStore.getInstance();
        System.out.println("Boutique Management System started.");
        System.out.println("Users in store: " + store.getUsers().size());
    }
}