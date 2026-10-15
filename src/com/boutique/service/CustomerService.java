
package com.boutique.service;

import com.boutique.data.CustomerDAO;
import com.boutique.model.Customer;
import com.boutique.util.IdGenerator;
import com.boutique.util.Result;

import java.util.List;

/**
 * Business layer for customer management.
 * Handles validation, ID generation, and customer operations.
 */
public class CustomerService {

    private final CustomerDAO customerDAO = new CustomerDAO();

    
    /**
     * Registers a new customer after validating their details.
     */
    public Result<Customer> addCustomer(String fullName, String email,
                                        String phone, String address) {

        if (fullName == null || fullName.trim().isEmpty()) {
            return Result.failure("Customer name cannot be empty.");
        }

        if (email == null || !email.trim().matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            return Result.failure("Invalid email address.");
        }

        if (phone == null || phone.trim().isEmpty()) {
            return Result.failure("Phone number cannot be empty.");
        }

        String trimmedEmail = email.trim();

        if (customerDAO.findByEmail(trimmedEmail) != null) {
            return Result.failure("Email already exists.");
        }

        String customerId = IdGenerator.nextCustomerId();

        Customer customer = new Customer(
                customerId,
                fullName.trim(),
                trimmedEmail,
                phone.trim(),
                address == null ? "" : address.trim()
        );

        customerDAO.save(customer);

        return Result.success(customer);
    }



    
    /**
     * Updates an existing customer's details after validation.
     */
    public Result<Customer> updateCustomer(String customerId, String fullName,
                                           String email, String phone, String address) {

        if (customerId == null || customerId.trim().isEmpty()) {
            return Result.failure("Customer ID is required.");
        }

        Customer existing = customerDAO.findById(customerId);

        if (existing == null) {
            return Result.failure("Customer not found.");
        }

        if (fullName == null || fullName.trim().isEmpty()) {
            return Result.failure("Customer name cannot be empty.");
        }

        if (email == null || !email.trim().matches("^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            return Result.failure("Invalid email address.");
        }

        if (phone == null || phone.trim().isEmpty()) {
            return Result.failure("Phone number cannot be empty.");
        }

        String trimmedEmail = email.trim();
        Customer emailOwner = customerDAO.findByEmail(trimmedEmail);

        if (emailOwner != null && !emailOwner.getCustomerId().equals(customerId)) {
            return Result.failure("Email already exists.");
        }

        Customer updated = new Customer(
                customerId,
                fullName.trim(),
                trimmedEmail,
                phone.trim(),
                address == null ? "" : address.trim()
        );

        customerDAO.update(updated);

        return Result.success(existing);
    }


    /**
     * Deactivates an existing customer without deleting their data.
     */
    public Result<Void> deactivateCustomer(String customerId) {

        if (customerId == null || customerId.trim().isEmpty()) {
            return Result.failure("Customer ID is required.");
        }

        Customer customer = customerDAO.findById(customerId);

        if (customer == null) {
            return Result.failure("Customer not found.");
        }

        if (!customer.isActive()) {
            return Result.failure("Customer is already inactive.");
        }

        customerDAO.deactivate(customerId);

        return Result.success(null);
    }


    
    /**
     * Searches active customers by name, email, or phone.
     */
    public List<Customer> searchCustomers(String keyword) {
        return customerDAO.search(keyword);
    }

    
    /**
     * Returns all active customers.
     */
    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    
    /**
     * Finds an active customer by their unique ID.
     */
    public Customer getCustomerById(String customerId) {
        Customer customer = customerDAO.findById(customerId);

        if (customer != null && customer.isActive()) {
            return customer;
        }

        return null;
    }

}
