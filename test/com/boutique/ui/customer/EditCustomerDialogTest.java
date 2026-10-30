
package com.boutique.ui.customer;

import com.boutique.model.Customer;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for EditCustomerDialog.
 * Tests dialog creation, existing customer data, and save button.
 */
public class EditCustomerDialogTest {

    // ---- Dialog creation

    @Test
    void dialogCanBeCreated() throws Exception {
        withDialog(dialog -> {
            assertEquals("Edit Customer", dialog.getTitle());
            assertTrue(dialog.isModal());
            assertEquals(500, dialog.getWidth());
            assertEquals(350, dialog.getHeight());
        });
    }

    // ---- Form fields

    @Test
    void dialogContainsFourInputFields() throws Exception {
        withDialog(dialog -> {
            assertEquals(4, findTextFields(dialog).size());
        });
    }

    @Test
    void dialogContainsCorrectLabels() throws Exception {
        withDialog(dialog -> {
            assertTrue(hasLabel(dialog, "Full Name:"));
            assertTrue(hasLabel(dialog, "Email:"));
            assertTrue(hasLabel(dialog, "Phone:"));
            assertTrue(hasLabel(dialog, "Address:"));
        });
    }

    // ---- Existing customer information

    @Test
    void nameFieldDisplaysExistingName() throws Exception {
        withDialog(dialog -> {
            List<JTextField> fields = findTextFields(dialog);
            assertEquals("Sara Hasan", fields.get(0).getText());
        });
    }

    @Test
    void emailFieldDisplaysExistingEmail() throws Exception {
        withDialog(dialog -> {
            List<JTextField> fields = findTextFields(dialog);
            assertEquals("sara@test.com", fields.get(1).getText());
        });
    }

    @Test
    void phoneAndAddressDisplayExistingValues() throws Exception {
        withDialog(dialog -> {
            List<JTextField> fields = findTextFields(dialog);
            assertEquals("33333333", fields.get(2).getText());
            assertEquals("Bahrain", fields.get(3).getText());
        });
    }

    // ---- Save button

    @Test
    void dialogContainsSaveChangesButton() throws Exception {
        withDialog(dialog -> {
            JButton button = findButton(dialog, "Save Changes");

            assertNotNull(button);
            assertTrue(button.isEnabled());
        });
    }

    // ---- Customer update status

    @Test
    void customerUpdatedIsInitiallyFalse() throws Exception {
        withDialog(dialog -> {
            assertFalse(dialog.isCustomerUpdated());
        });
    }

    // ---- Helper methods

    private Customer seedCustomer() {
        return new Customer(
            "CST-0001",
            "Sara Hasan",
            "sara@test.com",
            "33333333",
            "Bahrain"
        );
    }

    private void withDialog(
            java.util.function.Consumer<EditCustomerDialog> test)
            throws Exception {

        AtomicReference<Throwable> error = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            EditCustomerDialog dialog = null;

            try {
                dialog = new EditCustomerDialog(null, seedCustomer());
                test.accept(dialog);
            } catch (Throwable e) {
                error.set(e);
            } finally {
                if (dialog != null) {
                    dialog.dispose();
                }
            }
        });

        if (error.get() != null) {
            throw new AssertionError("Dialog test failed", error.get());
        }
    }

    private List<JTextField> findTextFields(Container container) {
        List<JTextField> fields = new ArrayList<>();

        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                fields.add((JTextField) component);
            }

            if (component instanceof Container) {
                fields.addAll(findTextFields((Container) component));
            }
        }

        return fields;
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

    private boolean hasLabel(Container container, String text) {
        for (Component component : container.getComponents()) {
            if (component instanceof JLabel) {
                if (text.equals(((JLabel) component).getText())) {
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
