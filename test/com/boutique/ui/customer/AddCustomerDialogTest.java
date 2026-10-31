
package com.boutique.ui.customer;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for AddCustomerDialog.
 * Tests the dialog layout, input fields, and save button.
 */
public class AddCustomerDialogTest {

    // ---- Dialog creation

    @Test
    void dialogCanBeCreated() throws Exception {
        withDialog(dialog -> {
            assertEquals("Add Customer", dialog.getTitle());
            assertTrue(dialog.isModal());
            assertEquals(500, dialog.getWidth());
            assertEquals(350, dialog.getHeight());
        });
    }

    // ---- Form fields

    @Test
    void dialogContainsFourInputFields() throws Exception {
        withDialog(dialog -> {
            List<JTextField> fields = findTextFields(dialog);

            assertEquals(4, fields.size());
        });
    }

    @Test
    void inputFieldsAreInitiallyEmpty() throws Exception {
        withDialog(dialog -> {
            List<JTextField> fields = findTextFields(dialog);

            assertEquals(4, fields.size());

            for (JTextField field : fields) {
                assertEquals("", field.getText());
            }
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

    // ---- Save button

    @Test
    void dialogContainsSaveButton() throws Exception {
        withDialog(dialog -> {
            JButton button = findButton(dialog, "Save Customer");

            assertNotNull(button);
            assertTrue(button.isEnabled());
        });
    }

    // ---- Customer added status

    @Test
    void customerAddedIsInitiallyFalse() throws Exception {
        withDialog(dialog ->
            assertFalse(dialog.isCustomerAdded())
        );
    }

    // ---- Helper methods

    private void withDialog(java.util.function.Consumer<AddCustomerDialog> test)
            throws Exception {

        AtomicReference<Throwable> error = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            AddCustomerDialog dialog = null;

            try {
                dialog = new AddCustomerDialog(null);
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
