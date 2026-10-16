
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

import com.boutique.service.CustomerService;
import com.boutique.model.Customer;
import com.boutique.util.Result;

/**
 * Presentation layer for customer management.
 *
 * This panel provides a graphical user interface (GUI)
 * for adding, editing, searching, viewing, and
 * deactivating customers.
 *
 * It communicates with CustomerService to perform
 * customer-related business operations.
 */
public class CustomerPanel extends JPanel {

    // Table used to display customer information.
    private JTable customerTable;

    // Table model used to manage customer rows and columns.
    private DefaultTableModel tableModel;

    /**
     * Constructs the customer management panel.
     *
     * Initializes the action buttons, search component,
     * customer table, and double-click event.
     * It also loads all active customers when opened.
     */
    public CustomerPanel() {

        setLayout(new BorderLayout());

        // Create the main panel title.
        JLabel title = new JLabel(
            "Manage Customers",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        // Create the panel containing customer action buttons.
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBorder(
            BorderFactory.createEmptyBorder(15, 20, 15, 20)
        );

        // Button for registering a new customer.
        JButton addButton = new JButton("Add Customer");
        styleButton(addButton);
        addButton.addActionListener(e -> openAddCustomerDialog());
        buttonPanel.add(addButton);

        // Button for editing an existing customer.
        JButton editButton = new JButton("Edit Customer");
        styleButton(editButton);
        editButton.addActionListener(e -> openEditCustomerDialog());
        buttonPanel.add(editButton);

        // Button for deactivating an existing customer.
        JButton deactivateButton = new JButton("Deactivate Customer");
        styleButton(deactivateButton);
        deactivateButton.addActionListener(
            e -> deactivateSelectedCustomer()
        );
        buttonPanel.add(deactivateButton);

        // Search component for filtering customers by keyword.
        CustomerSearchPanel searchPanel = new CustomerSearchPanel(keyword -> {

            // Remove previous search results.
            tableModel.setRowCount(0);

            CustomerService service = new CustomerService();

            // Display customers matching the search keyword.
            for (Customer customer : service.searchCustomers(keyword)) {
                addCustomerToTable(customer);
            }
        });

        JPanel searchRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchRow.add(searchPanel);

        // Define the columns displayed in the customer table.
        String[] columns = {
            "Customer ID",
            "Full Name",
            "Email",
            "Phone",
            "Address",
            "Status"
        };

        // Create a read-only table model.
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        customerTable = new JTable(tableModel);
        customerTable.setRowHeight(25);

        // Allow selecting only one customer at a time.
        customerTable.setSelectionMode(
            ListSelectionModel.SINGLE_SELECTION
        );

        // Open customer details when a table row is double-clicked.
        customerTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    openCustomerDetails();
                }
            }
        });

        JScrollPane tableScroll = new JScrollPane(customerTable);

        // Organize the action buttons and search bar.
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        searchRow.setAlignmentX(Component.LEFT_ALIGNMENT);

        topPanel.add(buttonPanel);
        topPanel.add(searchRow);

        // Create the main customer management layout.
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(tableScroll, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        // Load customer records when the panel is created.
        loadCustomers();
    }

    /**
     * Applies consistent colors and styling to action buttons.
     *
     * @param button the button to be styled
     */
    private void styleButton(JButton button) {
        button.setBackground(new Color(40, 40, 80));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
    }

    /**
     * Adds a customer's information as a new table row.
     *
     * @param customer the customer to display
     */
    private void addCustomerToTable(Customer customer) {
        tableModel.addRow(new Object[]{
            customer.getCustomerId(),
            customer.getFullName(),
            customer.getEmail(),
            customer.getPhone(),
            customer.getAddress(),
            customer.isActive() ? "Active" : "Inactive"
        });
    }

    /**
     * Retrieves all active customers from CustomerService
     * and refreshes the customer table.
     */
    private void loadCustomers() {

        // Clear previously displayed customers.
        tableModel.setRowCount(0);

        CustomerService service = new CustomerService();

        for (Customer customer : service.getAllCustomers()) {
            addCustomerToTable(customer);
        }
    }

    /**
     * Retrieves the customer selected in the table.
     *
     * Displays an error message if no customer is selected
     * or if the selected customer cannot be found.
     *
     * @return the selected customer, or null if unavailable
     */
    private Customer getSelectedCustomer() {

        int selectedRow = customerTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                this,
                "Please select a customer first!"
            );
            return null;
        }

        // Convert the selected row to its table model index.
        int modelRow = customerTable.convertRowIndexToModel(selectedRow);

        // Read the unique customer ID from the first column.
        String customerId = tableModel
            .getValueAt(modelRow, 0)
            .toString();

        CustomerService service = new CustomerService();
        Customer customer = service.getCustomerById(customerId);

        if (customer == null) {
            JOptionPane.showMessageDialog(
                this,
                "Customer not found!"
            );
        }

        return customer;
    }

    /**
     * Opens the dialog for adding a new customer.
     *
     * Refreshes the customer table if registration
     * is completed successfully.
     */
    private void openAddCustomerDialog() {

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

        AddCustomerDialog dialog = new AddCustomerDialog(parent);
        dialog.setVisible(true);

        if (dialog.isCustomerAdded()) {
            loadCustomers();
        }
    }

    /**
     * Opens the dialog for editing the selected customer.
     *
     * Refreshes the customer table after a successful update.
     */
    private void openEditCustomerDialog() {

        Customer customer = getSelectedCustomer();

        if (customer == null) {
            return;
        }

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

        EditCustomerDialog dialog = new EditCustomerDialog(parent, customer);
        dialog.setVisible(true);

        if (dialog.isCustomerUpdated()) {
            loadCustomers();
        }
    }

    /**
     * Displays detailed information about the selected customer.
     *
     * Opens CustomerDetailPanel inside a modal dialog
     * when the user double-clicks a customer row.
     */
    private void openCustomerDetails() {

        Customer customer = getSelectedCustomer();

        if (customer == null) {
            return;
        }

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

        JDialog dialog = new JDialog(
            parent,
            "Customer Details",
            true
        );

        dialog.setContentPane(new CustomerDetailPanel(customer));
        dialog.setSize(450, 350);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    /**
     * Deactivates the selected customer after user confirmation.
     *
     * Calls CustomerService to perform a soft delete
     * and refreshes the table after successful deactivation.
     * Displays an error message if the operation fails.
     */
    private void deactivateSelectedCustomer() {

        Customer customer = getSelectedCustomer();

        if (customer == null) {
            return;
        }

        // Ask the user to confirm customer deactivation.
        int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to deactivate this customer?",
            "Confirm Deactivation",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        CustomerService service = new CustomerService();

        Result<Void> result = service.deactivateCustomer(
            customer.getCustomerId()
        );

        if (result.isSuccess()) {
            JOptionPane.showMessageDialog(
                this,
                "Customer deactivated successfully!"
            );

            // Refresh the table to exclude inactive customers.
            loadCustomers();
        } else {
            JOptionPane.showMessageDialog(
                this,
                result.getErrorMessage()
            );
        }
    }
}
