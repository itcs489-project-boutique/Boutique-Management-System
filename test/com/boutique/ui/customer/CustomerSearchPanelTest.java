
package com.boutique.ui.customer;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for CustomerSearchPanel.
 * Tests the search field, buttons, and search callback.
 */
public class CustomerSearchPanelTest {

    // ---- Panel creation

    @Test
    void panelCanBeCreated() throws Exception {
        CustomerSearchPanel panel = createPanel(keyword -> {});

        assertNotNull(panel);
        assertTrue(panel.getLayout() instanceof FlowLayout);
    }

    // ---- Search components

    @Test
    void panelContainsSearchField() throws Exception {
        CustomerSearchPanel panel = createPanel(keyword -> {});

        assertNotNull(findTextField(panel));
    }

    @Test
    void panelContainsSearchButton() throws Exception {
        CustomerSearchPanel panel = createPanel(keyword -> {});

        assertNotNull(findButton(panel, "Search"));
    }

    @Test
    void panelContainsShowAllButton() throws Exception {
        CustomerSearchPanel panel = createPanel(keyword -> {});

        assertNotNull(findButton(panel, "Show All"));
    }

    // ---- Search functionality

    @Test
    void searchButtonSendsKeyword() throws Exception {
        AtomicReference<String> received = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            CustomerSearchPanel panel = new CustomerSearchPanel(received::set);

            findTextField(panel).setText("Sara");
            findButton(panel, "Search").doClick();
        });

        assertEquals("Sara", received.get());
    }

    @Test
    void searchButtonRemovesExtraSpaces() throws Exception {
        AtomicReference<String> received = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            CustomerSearchPanel panel = new CustomerSearchPanel(received::set);

            findTextField(panel).setText("  Sara Hasan  ");
            findButton(panel, "Search").doClick();
        });

        assertEquals("Sara Hasan", received.get());
    }

    @Test
    void emptySearchSendsEmptyKeyword() throws Exception {
        AtomicReference<String> received = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            CustomerSearchPanel panel = new CustomerSearchPanel(received::set);

            findTextField(panel).setText("   ");
            findButton(panel, "Search").doClick();
        });

        assertEquals("", received.get());
    }

    // ---- Show All functionality

    @Test
    void showAllClearsSearchField() throws Exception {
        AtomicReference<String> received = new AtomicReference<>();

        SwingUtilities.invokeAndWait(() -> {
            CustomerSearchPanel panel = new CustomerSearchPanel(received::set);

            JTextField field = findTextField(panel);
            field.setText("Sara");

            findButton(panel, "Show All").doClick();

            assertEquals("", field.getText());
        });

        assertEquals("", received.get());
    }

    // ---- Helper methods

    private CustomerSearchPanel createPanel(
            java.util.function.Consumer<String> callback) throws Exception {

        AtomicReference<CustomerSearchPanel> result =
            new AtomicReference<>();

        SwingUtilities.invokeAndWait(() ->
            result.set(new CustomerSearchPanel(callback))
        );

        return result.get();
    }

    private JTextField findTextField(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                return (JTextField) component;
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
        }
        return null;
    }
}
