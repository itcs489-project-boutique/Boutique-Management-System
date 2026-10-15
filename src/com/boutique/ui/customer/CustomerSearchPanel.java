
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

/**
 * Presentation layer component for searching customers.
 *
 * This panel provides a search text field, a Search button,
 * and a Show All button.
 *
 * It sends the entered search keyword to CustomerPanel
 * through a Consumer callback, allowing the customer
 * table to display matching records.
 */
public class CustomerSearchPanel extends JPanel {

    // Text field used to enter the search keyword.
    private JTextField searchField;

    // Button used to search for matching customers.
    private JButton searchButton;

    // Button used to display all active customers.
    private JButton showAllButton;

    // Callback used to send search keywords to CustomerPanel.
    private Consumer<String> onSearch;

    /**
     * Constructs the customer search panel.
     *
     * Creates the search field and action buttons,
     * and connects them to the provided search callback.
     *
     * @param onSearch the callback that receives the search keyword
     */
    public CustomerSearchPanel(Consumer<String> onSearch) {

        this.onSearch = onSearch;

        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Create the search label and input field.
        JLabel searchLabel = new JLabel("Search Customer:");
        searchField = new JTextField(20);

        // Create and style the Search button.
        searchButton = new JButton("Search");
        styleButton(searchButton);

        // Search for customers when the button is clicked.
        searchButton.addActionListener(e -> searchCustomers());

        // Create and style the Show All button.
        showAllButton = new JButton("Show All");
        styleButton(showAllButton);

        // Reset the search and display all active customers.
        showAllButton.addActionListener(e -> showAllCustomers());

        // Add the components to the search panel.
        add(searchLabel);
        add(searchField);
        add(searchButton);
        add(showAllButton);
    }

    /**
     * Applies consistent styling to a search action button.
     *
     * @param button the button to be styled
     */
    private void styleButton(JButton button) {
        button.setBackground(new Color(40, 40, 80));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
    }

    /**
     * Sends the entered keyword to the customer table.
     *
     * Removes extra spaces before passing the keyword
     * to the callback for searching active customers.
     */
    private void searchCustomers() {

        String keyword = searchField.getText().trim();

        // Send the search keyword to CustomerPanel.
        onSearch.accept(keyword);
    }

    /**
     * Clears the search field and displays all active customers.
     *
     * Sends an empty keyword to CustomerPanel, which
     * retrieves and displays all active customer records.
     */
    private void showAllCustomers() {

        // Clear the previously entered search keyword.
        searchField.setText("");

        // An empty keyword returns all active customers.
        onSearch.accept("");
    }
}
