
package com.boutique.service;

import com.boutique.data.CustomerDAO;
import com.boutique.model.Customer;
import com.boutique.util.IdGenerator;
import com.boutique.util.Result;

import java.util.List;

/**
 * Business layer for customer management.
 *
 * This class handles customer registration, validation,
 * updating customer information, searching, retrieving,
 * and deactivating customer accounts.
 *
 * It communicates with CustomerDAO to access stored data.
 */
public class CustomerService {

    // Data access object used for customer operations.
    private final CustomerDAO customerDAO = new CustomerDAO();

    /**
     * Registers a new customer after validating the input.
     *
     * The method checks required fields, email format,
     * and duplicate email addresses before saving.
     *
     * @param fullName the customer's full name
     * @param email the customer's email address
     * @param phone the customer's phone number
     * @param address the customer's address
     * @return a successful result containing the new customer,
     *         or a failure result with an error message
     */
    public Result<Customer> addCustomer(
            String fullName,
            String email,
            String phone,
            String address) {

        if (fullName == null || fullName.trim().isEmpty()) {
            return Result.failure("Customer name cannot be empty.");
        }

        if (email == null ||
                !email.trim().matches(
                    "^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            return Result.failure("Invalid email address.");
        }

        if (phone == null || phone.trim().isEmpty()) {
            return Result.failure("Phone number cannot be empty.");
        }

        String trimmedEmail = email.trim();

        // Prevent registering customers with duplicate emails.
        if (customerDAO.findByEmail(trimmedEmail) != null) {
            return Result.failure("Email already exists.");
        }

        // Generate a unique customer ID.
        String customerId = IdGenerator.nextCustomerId();

        Customer customer = new Customer(
                customerId,
                fullName.trim(),
                trimmedEmail,
                phone.trim(),
                address == null ? "" : address.trim()
        );

        // Save the validated customer.
        customerDAO.save(customer);

        return Result.success(customer);
    }

    /**
     * Updates an existing customer's personal information.
     *
     * The method validates the customer ID, required fields,
     * email format, and email uniqueness before updating.
     *
     * @param customerId the ID of the customer to update
     * @param fullName the updated full name
     * @param email the updated email address
     * @param phone the updated phone number
     * @param address the updated address
     * @return a successful result containing the customer,
     *         or a failure result with an error message
     */
    public Result<Customer> updateCustomer(
            String customerId,
            String fullName,
            String email,
            String phone,
            String address) {

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

        if (email == null ||
                !email.trim().matches(
                    "^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
            return Result.failure("Invalid email address.");
        }

        if (phone == null || phone.trim().isEmpty()) {
            return Result.failure("Phone number cannot be empty.");
        }

        String trimmedEmail = email.trim();

        // Check whether another customer owns this email.
        Customer emailOwner = customerDAO.findByEmail(trimmedEmail);

        if (emailOwner != null &&
                !emailOwner.getCustomerId().equals(customerId)) {
            return Result.failure("Email already exists.");
        }

        Customer updated = new Customer(
                customerId,
                fullName.trim(),
                trimmedEmail,
                phone.trim(),
                address == null ? "" : address.trim()
        );

        // Update the existing customer record.
        boolean updatedSuccessfully = customerDAO.update(updated);

        if (!updatedSuccessfully) {
            return Result.failure("Customer could not be updated.");
        }

        return Result.success(existing);
    }

    /**
     * Deactivates an existing customer without deleting their data.
     *
     * The method verifies that the customer exists and is active.
     * Deactivation is performed by changing the active status.
     *
     * @param customerId the ID of the customer to deactivate
     * @return a successful result if deactivated,
     *         or a failure result with an error message
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

        // Soft delete: mark the customer as inactive.
        boolean deactivated = customerDAO.deactivate(customerId);

        if (!deactivated) {
            return Result.failure("Customer could not be deactivated.");
        }

        return Result.success(null);
    }

    /**
     * Searches active customers using a keyword.
     *
     * Search supports customer ID, full name, email,
     * and phone number through CustomerDAO.
     *
     * @param keyword the search text entered by the user
     * @return a list of matching active customers
     */
    public List<Customer> searchCustomers(String keyword) {
        return customerDAO.search(keyword);
    }

    /**
     * Retrieves all active customers.
     *
     * @return a list of active customers
     */
    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    /**
     * Retrieves an active customer using their unique ID.
     *
     * Inactive customers are not returned.
     *
     * @param customerId the customer's unique ID
     * @return the active customer, or null if not found
     */
    public Customer getCustomerById(String customerId) {

        Customer customer = customerDAO.findById(customerId);

        if (customer != null && customer.isActive()) {
            return customer;
        }

        return null;
    }
}
