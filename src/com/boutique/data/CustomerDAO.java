
package com.boutique.data;

import com.boutique.model.Customer;
import com.boutique.util.DataStore;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object (DAO) for customer management.
 *
 * This class represents the data layer.
 * It handles storing, retrieving, searching,
 * updating, and deactivating customer records.
 */
public class CustomerDAO {

    // Shared in-memory storage for application data.
    private final DataStore store = DataStore.getInstance();

    /**
     * Saves a new customer in the data store.
     *
     * @param customer the customer to be saved
     */
    public void save(Customer customer) {
        store.getCustomers().add(customer);
    }

    /**
     * Finds a customer using their unique customer ID.
     *
     * @param customerId the ID of the customer
     * @return the matching customer, or null if not found
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
     * Finds a customer using their email address.
     * Email comparison is case-insensitive.
     *
     * @param email the customer's email address
     * @return the matching customer, or null if not found
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
     * Retrieves all active customers.
     * Inactive customers are excluded from the list.
     *
     * @return a list of active customers
     */
    public List<Customer> findAll() {

        List<Customer> activeCustomers = new ArrayList<>();

        for (Customer customer : store.getCustomers()) {
            if (customer.isActive()) {
                activeCustomers.add(customer);
            }
        }

        return activeCustomers;
    }

    /**
     * Searches active customers by customer ID,
     * full name, email address, or phone number.
     *
     * The search is case-insensitive for text fields.
     * Inactive customers are excluded from results.
     *
     * @param keyword the text entered by the user
     * @return a list of matching active customers
     */
    public List<Customer> search(String keyword) {

        List<Customer> results = new ArrayList<>();

        if (keyword == null) {
            return results;
        }

        String searchText = keyword.trim().toLowerCase();

        for (Customer customer : store.getCustomers()) {

            if (customer.isActive() &&
                (customer.getCustomerId().toLowerCase().contains(searchText) ||
                 customer.getFullName().toLowerCase().contains(searchText) ||
                 customer.getEmail().toLowerCase().contains(searchText) ||
                 customer.getPhone().contains(searchText))) {

                results.add(customer);
            }
        }

        return results;
    }

    /**
     * Updates an existing customer's information.
     *
     * The customer is identified using their ID.
     * Only name, email, phone, and address are updated.
     *
     * @param updatedCustomer the customer containing updated details
     * @return true if updated successfully, otherwise false
     */
    public boolean update(Customer updatedCustomer) {

        Customer existingCustomer =
                findById(updatedCustomer.getCustomerId());

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
     * Deactivates a customer without permanently deleting their data.
     *
     * This operation performs a soft delete by setting
     * the customer's active status to false.
     *
     * @param customerId the ID of the customer to deactivate
     * @return true if deactivated successfully, otherwise false
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
