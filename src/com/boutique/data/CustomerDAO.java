
package com.boutique.data;

import com.boutique.model.Customer;
import com.boutique.util.DataStore;
import java.util.List;

/**
 * Handles customer data storage and retrieval.
 */
public class CustomerDAO {

    private final DataStore store = DataStore.getInstance();


    
    /**
     * Saves a new customer in the data store.
     */
    public void save(Customer customer) {
        store.getCustomers().add(customer);
    }

    
    /**
     * Finds a customer by their unique ID.
     */
    public Customer findById(String customerId) {
        for (Customer customer : store.getCustomers()) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }


    
    /**
     * Finds a customer by their email address.
     */
    public Customer findByEmail(String email) {
        for (Customer customer : store.getCustomers()) {
            if (customer.getEmail().equalsIgnoreCase(email)) {
                return customer;
            }
        }
        return null;
    }


    /**
     * Returns all active customers.
     */
    public List<Customer> findAll() {
        List<Customer> activeCustomers = new java.util.ArrayList<>();

        for (Customer customer : store.getCustomers()) {
            if (customer.isActive()) {
                activeCustomers.add(customer);
            }
        }

        return activeCustomers;
    }

    
    /**
     * Searches active customers by name, email, or phone.
     */
    public List<Customer> search(String keyword) {
        List<Customer> results = new java.util.ArrayList<>();

        if (keyword == null) {
            return results;
        }

        String searchText = keyword.toLowerCase();

        for (Customer customer : store.getCustomers()) {
            if (customer.isActive() &&
                (customer.getFullName().toLowerCase().contains(searchText) ||
                 customer.getEmail().toLowerCase().contains(searchText) ||
                 customer.getPhone().contains(keyword))) {

                results.add(customer);
            }
        }

        return results;
    }


    /**
     * Updates an existing customer's information.
     */
    public boolean update(Customer updatedCustomer) {
        Customer existingCustomer = findById(updatedCustomer.getCustomerId());

        if (existingCustomer == null) {
            return false;
        }

        existingCustomer.setFullName(updatedCustomer.getFullName());
        existingCustomer.setEmail(updatedCustomer.getEmail());
        existingCustomer.setPhone(updatedCustomer.getPhone());
        existingCustomer.setAddress(updatedCustomer.getAddress());

        return true;
    }

    /**
     * Deactivates a customer without deleting their data.
     */
    public boolean deactivate(String customerId) {
        Customer customer = findById(customerId);

        if (customer == null) {
            return false;
        }

        customer.setActive(false);
        return true;
    }

}

