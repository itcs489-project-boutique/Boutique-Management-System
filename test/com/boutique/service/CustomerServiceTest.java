
package com.boutique.service;

import com.boutique.data.CustomerDAO;
import com.boutique.model.Customer;
import com.boutique.util.DataStore;
import com.boutique.util.Result;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for CustomerService.
 * Tests customer registration, validation, updating,
 * searching, retrieving, and deactivation.
 */
public class CustomerServiceTest {

    private CustomerService service;
    private CustomerDAO customerDAO;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().getCustomers().clear();
        service = new CustomerService();
        customerDAO = new CustomerDAO();
    }

    // ---- Add customer

    @Test
    void addCustomerSuccessfully() {
        Result<Customer> result = service.addCustomer(
            "Sara Hasan", "sara@test.com", "33333333", "Bahrain"
        );

        assertTrue(result.isSuccess());
        assertNotNull(result.getValue().getCustomerId());
        assertEquals("Sara Hasan", result.getValue().getFullName());
        assertEquals(1, service.getAllCustomers().size());
    }

    @Test
    void addCustomerRejectsEmptyName() {
        assertFalse(service.addCustomer(
            "  ", "sara@test.com", "33333333", "Bahrain"
        ).isSuccess());
    }

    @Test
    void addCustomerRejectsInvalidEmail() {
        assertFalse(service.addCustomer(
            "Sara Hasan", "invalid-email", "33333333", "Bahrain"
        ).isSuccess());
    }

    @Test
    void addCustomerRejectsEmptyPhone() {
        assertFalse(service.addCustomer(
            "Sara Hasan", "sara@test.com", "  ", "Bahrain"
        ).isSuccess());
    }

    @Test
    void addCustomerRejectsDuplicateEmail() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        Result<Customer> result = service.addCustomer(
            "Ahmed Ali", "sara@test.com", "34444444", "Bahrain"
        );

        assertFalse(result.isSuccess());
        assertEquals(1, service.getAllCustomers().size());
    }

    // ---- Update customer

    @Test
    void updateCustomerSuccessfully() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        Result<Customer> result = service.updateCustomer(
            "CST-0001", "Sara Ahmed",
            "sara@test.com", "33333333", "Manama"
        );

        assertTrue(result.isSuccess());
        assertEquals("Sara Ahmed",
            service.getCustomerById("CST-0001").getFullName());
        assertEquals("Manama",
            service.getCustomerById("CST-0001").getAddress());
    }

    @Test
    void updateCustomerRejectsUnknownId() {
        assertFalse(service.updateCustomer(
            "CST-9999", "Sara Hasan",
            "sara@test.com", "33333333", "Bahrain"
        ).isSuccess());
    }

    @Test
    void updateCustomerRejectsEmptyName() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        assertFalse(service.updateCustomer(
            "CST-0001", "  ",
            "sara@test.com", "33333333", "Bahrain"
        ).isSuccess());
    }

    @Test
    void updateCustomerRejectsInvalidEmail() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        assertFalse(service.updateCustomer(
            "CST-0001", "Sara Hasan",
            "invalid-email", "33333333", "Bahrain"
        ).isSuccess());
    }

    @Test
    void updateCustomerRejectsDuplicateEmail() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");
        seedCustomer("CST-0002", "Ahmed Ali", "ahmed@test.com");

        assertFalse(service.updateCustomer(
            "CST-0002", "Ahmed Ali",
            "sara@test.com", "34444444", "Bahrain"
        ).isSuccess());
    }

    // ---- Deactivate customer

    @Test
    void deactivateCustomerSuccessfully() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        Result<Void> result = service.deactivateCustomer("CST-0001");

        assertTrue(result.isSuccess());
        assertFalse(customerDAO.findById("CST-0001").isActive());
    }

    @Test
    void deactivateUnknownCustomer() {
        assertFalse(
            service.deactivateCustomer("CST-9999").isSuccess()
        );
    }

    @Test
    void deactivateAlreadyInactiveCustomer() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");
        service.deactivateCustomer("CST-0001");

        assertFalse(
            service.deactivateCustomer("CST-0001").isSuccess()
        );
    }

    // ---- Search customers

    @Test
    void searchCustomersByName() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        assertEquals(1, service.searchCustomers("Sara").size());
        assertEquals(0, service.searchCustomers("Ahmed").size());
    }

    // ---- Get all customers

    @Test
    void getAllCustomersReturnsActiveOnly() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");
        seedCustomer("CST-0002", "Ahmed Ali", "ahmed@test.com");

        service.deactivateCustomer("CST-0002");

        assertEquals(1, service.getAllCustomers().size());
    }

    // ---- Get customer by ID

    @Test
    void getCustomerByIdSuccessfully() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");

        Customer result = service.getCustomerById("CST-0001");

        assertNotNull(result);
        assertEquals("Sara Hasan", result.getFullName());
    }

    @Test
    void getCustomerByIdNotFound() {
        assertNull(service.getCustomerById("CST-9999"));
    }

    @Test
    void getCustomerByIdRejectsInactiveCustomer() {
        seedCustomer("CST-0001", "Sara Hasan", "sara@test.com");
        service.deactivateCustomer("CST-0001");

        assertNull(service.getCustomerById("CST-0001"));
    }

    // ---- Helper method

    private Customer seedCustomer(String id, String name, String email) {
        Customer customer = new Customer(
            id, name, email, "33333333", "Bahrain"
        );

        customerDAO.save(customer);
        return customer;
    }
}
