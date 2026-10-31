
package com.boutique.ui.customer;

import com.boutique.data.CustomerDAO;
import com.boutique.model.Customer;
import com.boutique.util.DataStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for CustomerPanel.
 * Tests the customer table, buttons, and displayed data.
 */
public class CustomerPanelTest {

    private CustomerDAO customerDAO;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().getCustomers().clear();
        customerDAO = new CustomerDAO();
    }

    // ---- Panel creation

    @Test
    void panelCanBeCreated() throws Exception {
        CustomerPanel panel = createPanel();

        assertNotNull(panel);
        assertTrue(panel.getLayout() instanceof BorderLayout);
    }

    // ---- Customer table

    @Test
    void tableHasCorrectColumns() throws Exception {
        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);

        TableModel model = table.getModel();

        assertEquals(6, model.getColumnCount());
        assertEquals("Customer ID", model.getColumnName(0));
        assertEquals("Full Name", model.getColumnName(1));
        assertEquals("Email", model.getColumnName(2));
        assertEquals("Phone", model.getColumnName(3));
        assertEquals("Address", model.getColumnName(4));
        assertEquals("Status", model.getColumnName(5));
    }

    @Test
    void tableIsReadOnly() throws Exception {
        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);
        assertFalse(table.getModel().isCellEditable(0, 0));
    }

    @Test
    void tableAllowsSingleSelection() throws Exception {
        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);
        assertEquals(
            ListSelectionModel.SINGLE_SELECTION,
            table.getSelectionModel().getSelectionMode()
        );
    }

    // ---- Display customers

    @Test
    void tableDisplaysSavedCustomer() throws Exception {
        seedCustomer("CST-0001", "Sara Hasan");

        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);
        assertEquals(1, table.getRowCount());
        assertEquals("CST-0001", table.getValueAt(0, 0));
        assertEquals("Sara Hasan", table.getValueAt(0, 1));
        assertEquals("Active", table.getValueAt(0, 5));
    }

    @Test
    void tableDoesNotDisplayInactiveCustomer() throws Exception {
        Customer customer = seedCustomer("CST-0001", "Sara Hasan");
        customerDAO.deactivate(customer.getCustomerId());

        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);
        assertEquals(0, table.getRowCount());
    }

    @Test
    void emptyCustomerListShowsEmptyTable() throws Exception {
        CustomerPanel panel = createPanel();
        JTable table = findTable(panel);

        assertNotNull(table);
        assertEquals(0, table.getRowCount());
    }

    // ---- Action buttons

    @Test
    void panelContainsCustomerButtons() throws Exception {
        CustomerPanel panel = createPanel();

        assertNotNull(findButton(panel, "Add Customer"));
        assertNotNull(findButton(panel, "Edit Customer"));
        assertNotNull(findButton(panel, "Deactivate Customer"));
    }

    // ---- Helper methods

    private Customer seedCustomer(String id, String name) {
        Customer customer = new Customer(
            id, name, "sara@test.com", "33333333", "Bahrain"
        );

        customerDAO.save(customer);
        return customer;
    }

    private CustomerPanel createPanel() throws Exception {
        AtomicReference<CustomerPanel> result = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() ->
            result.set(new CustomerPanel())
        );

        return result.get();
    }

    private JTable findTable(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTable) {
                return (JTable) component;
            }

            if (component instanceof Container) {
                JTable found = findTable((Container) component);

                if (found != null) {
                    return found;
                }
            }
        }

        return null;
    }

    private JButton findButton(Container container, String text) {
        for (Component component : container.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;

                if (text.equals(button.getText())) {
                    return button;
                }
            }

            if (component instanceof Container) {
                JButton found = findButton((Container) component, text);

                if (found != null) {
                    return found;
                }
            }
        }

        return null;
    }
}
