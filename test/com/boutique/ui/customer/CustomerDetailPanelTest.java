
package com.boutique.ui.customer;

import com.boutique.model.Customer;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for CustomerDetailPanel.
 * Tests customer details, account status, and registration date.
 */
public class CustomerDetailPanelTest {

    // ---- Panel creation

    @Test
    void panelCanBeCreated() throws Exception {
        Customer customer = seedCustomer();
        CustomerDetailPanel panel = createPanel(customer);

        assertNotNull(panel);
        assertTrue(panel.getLayout() instanceof BoxLayout);
    }

    // ---- Customer information

    @Test
    void panelDisplaysCustomerId() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Customer ID: CST-0001"));
    }

    @Test
    void panelDisplaysCustomerName() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Full Name: Sara Hasan"));
    }

    @Test
    void panelDisplaysCustomerEmail() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Email: sara@test.com"));
    }

    @Test
    void panelDisplaysCustomerPhone() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Phone: 33333333"));
    }

    @Test
    void panelDisplaysCustomerAddress() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Address: Bahrain"));
    }

    // ---- Customer status

    @Test
    void panelDisplaysActiveStatus() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Status: Active"));
    }

    @Test
    void panelDisplaysInactiveStatus() throws Exception {
        Customer customer = seedCustomer();
        customer.setActive(false);

        CustomerDetailPanel panel = createPanel(customer);

        assertTrue(hasLabel(panel, "Status: Inactive"));
    }

    // ---- Registration date

    @Test
    void panelDisplaysRegistrationDate() throws Exception {
        Customer customer = seedCustomer();

        String expectedDate = customer.getRegistrationDate()
            .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        CustomerDetailPanel panel = createPanel(customer);

        assertTrue(hasLabel(panel, "Registration Date: " + expectedDate));
    }

    // ---- Order information

    @Test
    void panelDisplaysTotalOrders() throws Exception {
        CustomerDetailPanel panel = createPanel(seedCustomer());

        assertTrue(hasLabel(panel, "Total Orders: 0"));
    }

    // ---- Helper methods

    private Customer seedCustomer() {
        return new Customer(
            "CST-0001", "Sara Hasan",
            "sara@test.com", "33333333", "Bahrain"
        );
    }

    private CustomerDetailPanel createPanel(Customer customer)
            throws Exception {

        AtomicReference<CustomerDetailPanel> result =
            new AtomicReference<>();

        SwingUtilities.invokeAndWait(() ->
            result.set(new CustomerDetailPanel(customer))
        );

        return result.get();
    }

    private boolean hasLabel(Container container, String text) {
        for (Component component : container.getComponents()) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;

                if (text.equals(label.getText())) {
                    return true;
                }
            }

            if (component instanceof Container) {
                if (hasLabel((Container) component, text)) {
                    return true;
                }
            }
        }

        return false;
    }
}
