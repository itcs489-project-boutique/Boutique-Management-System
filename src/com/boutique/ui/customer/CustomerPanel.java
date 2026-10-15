
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import com.boutique.service.CustomerService;
import javax.swing.table.DefaultTableModel;
import com.boutique.model.Customer;

public class CustomerPanel extends JPanel {

    private JTable customerTable;
    private DefaultTableModel tableModel;


    public CustomerPanel() {
        setLayout(new BorderLayout());

        JLabel title = new JLabel(
            "Manage Customers",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 22));

        add(title, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBorder(
            BorderFactory.createEmptyBorder(15, 20, 15, 20)
        );


        // Add Customer button
        JButton addButton = new JButton("Add Customer");
        addButton.setBackground(new Color(40, 40, 80));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);

        addButton.addActionListener(e -> openAddCustomerDialog());
            
        buttonPanel.add(addButton);

        
        // Edit Customer button
        JButton editButton = new JButton("Edit Customer");
        editButton.setBackground(new Color(40, 40, 80));
        editButton.setForeground(Color.WHITE);
        editButton.setFocusPainted(false);

        editButton.addActionListener(e -> openEditCustomerDialog());

        buttonPanel.add(editButton);

        
        // Deactivate Customer button
        JButton deactivateButton = new JButton("Deactivate Customer");
        deactivateButton.setBackground(new Color(40, 40, 80));
        deactivateButton.setForeground(Color.WHITE);
        deactivateButton.setFocusPainted(false);

        deactivateButton.addActionListener(e -> deactivateSelectedCustomer());

        buttonPanel.add(deactivateButton);

        
        // Search Customer
        CustomerSearchPanel searchPanel = new CustomerSearchPanel(keyword -> {
            tableModel.setRowCount(0);

            CustomerService service = new CustomerService();

            for (Customer customer : service.searchCustomers(keyword)) {
                tableModel.addRow(new Object[]{
                    customer.getCustomerId(),
                    customer.getFullName(),
                    customer.getEmail(),
                    customer.getPhone(),
                    customer.getAddress()
                });
            }
        });

        // Search panel in a separate row
        JPanel searchRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchRow.add(searchPanel);


        
        // Customers table
        String[] columns = {"Customer ID", "Full Name", "Email", "Phone", "Address"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
             }
        };
        
        customerTable = new JTable(tableModel);

        JScrollPane tableScroll = new JScrollPane(customerTable);

        
        // Top section: buttons and search
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        searchRow.setAlignmentX(Component.LEFT_ALIGNMENT);

        topPanel.add(buttonPanel);
        topPanel.add(searchRow);

        // Main layout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(tableScroll, BorderLayout.CENTER);


        add(mainPanel, BorderLayout.CENTER);

        loadCustomers();



    }
    
    // Load customers into the table
    private void loadCustomers() {
        tableModel.setRowCount(0);

        CustomerService service = new CustomerService();

        for (Customer customer : service.getAllCustomers()) {
            tableModel.addRow(new Object[]{
                customer.getCustomerId(),
                customer.getFullName(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getAddress()
            });
        }
    }

    
    // Open the Add Customer dialog
    private void openAddCustomerDialog() {
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

        AddCustomerDialog dialog = new AddCustomerDialog(parent);
        dialog.setVisible(true);

        if (dialog.isCustomerAdded()) {
            loadCustomers();
        }
    }

    
    // Open the Edit Customer dialog
    private void openEditCustomerDialog() {

        int selectedRow = customerTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                this,
                "Please select a customer first!"
            );
            return;
        }

        int modelRow = customerTable.convertRowIndexToModel(selectedRow);

        String customerId = tableModel.getValueAt(modelRow, 0).toString();

        CustomerService service = new CustomerService();
        Customer customer = service.getCustomerById(customerId);

        if (customer == null) {
            JOptionPane.showMessageDialog(
                this,
                "Customer not found!"
            );
            return;
        }

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);

        EditCustomerDialog dialog = new EditCustomerDialog(parent, customer);
        dialog.setVisible(true);

        if (dialog.isCustomerUpdated()) {
            loadCustomers();
        }
    }


    // Deactivate selected customer
    private void deactivateSelectedCustomer() {

        int selectedRow = customerTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                this,
                "Please select a customer first!"
            );
            return;
        }

        int modelRow = customerTable.convertRowIndexToModel(selectedRow);

        String customerId = tableModel.getValueAt(modelRow, 0).toString();

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

        com.boutique.util.Result<Void> result =
            service.deactivateCustomer(customerId);

        if (result.isSuccess()) {
            JOptionPane.showMessageDialog(
                this,
                "Customer deactivated successfully!"
            );

            loadCustomers();

        } else {
            JOptionPane.showMessageDialog(
                this,
                result.getErrorMessage()
            );
        }
    }


}
