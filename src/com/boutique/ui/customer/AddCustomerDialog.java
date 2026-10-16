
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;

import com.boutique.service.CustomerService;
import com.boutique.util.Result;

/**
 * Presentation layer for registering new customers.
 *
 * This dialog provides a form for entering customer
 * information, including full name, email, phone,
 * and address.
 *
 * It communicates with CustomerService to validate
 * and save the new customer.
 */
public class AddCustomerDialog extends JDialog {

    // Indicates whether a customer was added successfully.
    private boolean customerAdded = false;

    // Input fields for customer information.
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;

    /**
     * Constructs the Add Customer dialog.
     *
     * Creates the customer registration form and
     * a Save Customer button.
     *
     * @param parent the parent application window
     */
    public AddCustomerDialog(JFrame parent) {

        super(parent, "Add Customer", true);

        setSize(500, 350);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        // Create the dialog title.
        JLabel title = new JLabel(
            "Add New Customer",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Create the form using GridBagLayout.
        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(
            BorderFactory.createEmptyBorder(15, 20, 15, 20)
        );

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(5, 4, 5, 4);

        // Full Name field.
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0;
        form.add(new JLabel("Full Name:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        nameField = new JTextField(20);
        form.add(nameField, gc);

        // Email field.
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 0;
        form.add(new JLabel("Email:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        emailField = new JTextField(20);
        form.add(emailField, gc);

        // Phone field.
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 0;
        form.add(new JLabel("Phone:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        phoneField = new JTextField(20);
        form.add(phoneField, gc);

        // Address field.
        gc.gridx = 0;
        gc.gridy = 3;
        gc.weightx = 0;
        form.add(new JLabel("Address:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        addressField = new JTextField(20);
        form.add(addressField, gc);

        add(form, BorderLayout.CENTER);

        // Create and style the Save Customer button.
        JButton saveButton = new JButton("Save Customer");
        saveButton.setBackground(new Color(40, 40, 80));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);

        // Save the customer when the button is clicked.
        saveButton.addActionListener(e -> saveCustomer());

        add(saveButton, BorderLayout.SOUTH);
    }

    /**
     * Validates and saves the entered customer information.
     *
     * Sends the form data to CustomerService.
     * If registration succeeds, displays a success message,
     * updates the customerAdded flag, and closes the dialog.
     *
     * If registration fails, displays the error message
     * and keeps the dialog open for correction.
     */
    private void saveCustomer() {

        CustomerService service = new CustomerService();

        Result<?> result = service.addCustomer(
            nameField.getText(),
            emailField.getText(),
            phoneField.getText(),
            addressField.getText()
        );

        if (result.isSuccess()) {

            JOptionPane.showMessageDialog(
                this,
                "Customer added successfully!"
            );

            // Mark the registration as successful.
            customerAdded = true;

            // Close the dialog after saving.
            dispose();

        } else {

            // Display the validation error to the user.
            JOptionPane.showMessageDialog(
                this,
                result.getErrorMessage()
            );
        }
    }

    /**
     * Checks whether a new customer was saved successfully.
     *
     * CustomerPanel uses this method to determine
     * whether the customer table should be refreshed.
     *
     * @return true if a customer was added, otherwise false
     */
    public boolean isCustomerAdded() {
        return customerAdded;
    }
}
