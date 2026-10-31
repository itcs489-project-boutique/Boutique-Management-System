
package com.boutique.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for Customer model.
 * Tests customer information, updates, active status,
 * registration date, and string representation.
 */
public class CustomerTest {

    // ---- Customer creation

    @Test
    void createCustomerSuccessfully() {
        Customer customer = new Customer(
            "CST-0001", "Sara Hasan",
            "sara@test.com", "33333333", "Bahrain"
        );

        assertEquals("CST-0001", customer.getCustomerId());
        assertEquals("Sara Hasan", customer.getFullName());
        assertEquals("sara@test.com", customer.getEmail());
        assertEquals("33333333", customer.getPhone());
        assertEquals("Bahrain", customer.getAddress());
    }

    // ---- Default customer status

    @Test
    void newCustomerIsActive() {
        Customer customer = seedCustomer();

        assertTrue(customer.isActive());
    }

    // ---- Update customer information

    @Test
    void updateCustomerName() {
        Customer customer = seedCustomer();

        customer.setFullName("Sara Ahmed");

        assertEquals("Sara Ahmed", customer.getFullName());
    }

    @Test
    void updateCustomerEmail() {
        Customer customer = seedCustomer();

        customer.setEmail("new@test.com");

        assertEquals("new@test.com", customer.getEmail());
    }

    @Test
    void updateCustomerPhone() {
        Customer customer = seedCustomer();

        customer.setPhone("34444444");

        assertEquals("34444444", customer.getPhone());
    }

    @Test
    void updateCustomerAddress() {
        Customer customer = seedCustomer();

        customer.setAddress("Manama");

        assertEquals("Manama", customer.getAddress());
    }

    // ---- Customer active status

    @Test
    void deactivateCustomer() {
        Customer customer = seedCustomer();

        customer.setActive(false);

        assertFalse(customer.isActive());
    }

    @Test
    void reactivateCustomer() {
        Customer customer = seedCustomer();

        customer.setActive(false);
        customer.setActive(true);

        assertTrue(customer.isActive());
    }

    // ---- Registration date

    @Test
    void registrationDateIsCreated() {
        Customer customer = seedCustomer();

        assertNotNull(customer.getRegistrationDate());
    }

    // ---- String representation

    @Test
    void customerToStringContainsInformation() {
        Customer customer = seedCustomer();

        String result = customer.toString();

        assertTrue(result.contains("CST-0001"));
        assertTrue(result.contains("Sara Hasan"));
        assertTrue(result.contains("sara@test.com"));
    }

    // ---- Helper method

    private Customer seedCustomer() {
        return new Customer(
            "CST-0001", "Sara Hasan",
            "sara@test.com", "33333333", "Bahrain"
        );
    }
}
