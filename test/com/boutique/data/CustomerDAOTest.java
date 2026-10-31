
package com.boutique.data;

import com.boutique.model.Customer;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for CustomerDAO.
 * Tests saving, finding, searching, updating, and deactivating customers.
 */
public class CustomerDAOTest {

    private CustomerDAO customerDAO;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().getCustomers().clear();
        customerDAO = new CustomerDAO();
    }

    // ---- Save customer

    @Test
    void testSaveCustomer() {
        Customer customer = seedCustomer("CST-0001", "Sara Hasan");

        assertEquals(1, customerDAO.findAll().size());
        assertEquals(customer, customerDAO.findById("CST-0001"));
    }

    @Test
    void testSaveMultipleCustomers() {
        seedCustomer("CST-0001", "Sara Hasan");
        seedCustomer("CST-0002", "Ahmed Ali");

        assertEquals(2, customerDAO.findAll().size());
    }

    // ---- Find customer by ID

    @Test
    void testFindById() {
        seedCustomer("CST-0001", "Sara Hasan");

        Customer result = customerDAO.findById("CST-0001");

        assertNotNull(result);
        assertEquals("Sara Hasan", result.getFullName());
    }

    @Test
    void testFindByIdNotFound() {
        assertNull(customerDAO.findById("CST-9999"));
    }

    // ---- Find customer by email

    @Test
    void testFindByEmail() {
        seedCustomer("CST-0001", "Sara Hasan");

        Customer result = customerDAO.findByEmail("sarahasan@test.com");

        assertNotNull(result);
        assertEquals("CST-0001", result.getCustomerId());
    }

    @Test
    void testFindByEmailIgnoreCase() {
        seedCustomer("CST-0001", "Sara Hasan");

        Customer result = customerDAO.findByEmail("SARAHASAN@TEST.COM");

        assertNotNull(result);
        assertEquals("CST-0001", result.getCustomerId());
    }

    @Test
    void testFindByEmailNotFound() {
        assertNull(customerDAO.findByEmail("unknown@test.com"));
    }

    // ---- Update customer

    @Test
    void testUpdateCustomer() {
        seedCustomer("CST-0001", "Sara Hasan");

        Customer updated = new Customer(
            "CST-0001", "Sara Ahmed",
            "sara@test.com", "33333333", "Bahrain"
        );

        boolean result = customerDAO.update(updated);

        assertTrue(result);
        assertEquals("Sara Ahmed",
            customerDAO.findById("CST-0001").getFullName());
    }

    @Test
    void testUpdateUnknownCustomer() {
        Customer customer = new Customer(
            "CST-9999", "Unknown Customer",
            "unknown@test.com", "33333333", "Bahrain"
        );

        assertFalse(customerDAO.update(customer));
    }

    // ---- Deactivate customer

    @Test
    void testDeactivateCustomer() {
        seedCustomer("CST-0001", "Sara Hasan");

        boolean result = customerDAO.deactivate("CST-0001");

        assertTrue(result);
        assertFalse(customerDAO.findById("CST-0001").isActive());
        assertEquals(0, customerDAO.findAll().size());
    }

    @Test
    void testDeactivateUnknownCustomer() {
        assertFalse(customerDAO.deactivate("CST-9999"));
    }

    // ---- Search customers

    @Test
    void testSearchCustomer() {
        seedCustomer("CST-0001", "Sara Hasan");

        assertEquals(1, customerDAO.search("Sara").size());
        assertEquals(1, customerDAO.search("sarahasan@test.com").size());
        assertEquals(0, customerDAO.search("Ahmed").size());
    }

    @Test
    void testSearchByPhone() {
        seedCustomer("CST-0001", "Sara Hasan");

        assertEquals(1, customerDAO.search("33333333").size());
    }

    @Test
    void testSearchUnknownCustomer() {
        seedCustomer("CST-0001", "Sara Hasan");

        assertTrue(customerDAO.search("Unknown").isEmpty());
    }

    // ---- Find all active customers

    @Test
    void testFindAllCustomers() {
        seedCustomer("CST-0001", "Sara Hasan");
        seedCustomer("CST-0002", "Ahmed Ali");

        assertEquals(2, customerDAO.findAll().size());
    }

    // ---- Helper method

    private Customer seedCustomer(String id, String name) {
        String email = name.toLowerCase().replace(" ", "") + "@test.com";

        Customer customer = new Customer(
            id, name, email, "33333333", "Bahrain"
        );

        customerDAO.save(customer);
        return customer;
    }
}
