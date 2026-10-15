
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;

import com.boutique.model.Customer;
import com.boutique.service.CustomerService;
import com.boutique.util.Result;

/**
 * Presentation layer for editing customer information.
 *
 * This dialog displays the selected customer's existing
 * details and allows the user to modify the full name,
 * email address, phone number, and address.
 *
 * It communicates with CustomerService to validate
 * and save the updated customer information.
 */
public class EditCustomerDialog extends JDialog {

    // Input fields used to edit customer information.
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;

    // The customer selected for editing.
    private final Customer customer;

    // Indicates whether customer information was updated.
    private boolean customerUpdated = false;

    /**
     * Constructs the Edit Customer dialog.
     *
     * Creates a form containing the selected customer's
     * current information and a Save Changes button.
     *
     * @param parent the parent application window
     * @param customer the customer whose details will be edited
     */
    public EditCustomerDialog(JFrame parent, Customer customer) {

        super(parent, "Edit Customer", true);

        this.customer = customer;

        setSize(500, 350);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        // Create the dialog title.
        JLabel title = new JLabel(
            "Edit Customer",
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

        // Display the customer's current full name.
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 0;
        form.add(new JLabel("Full Name:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        nameField = new JTextField(customer.getFullName(), 20);
        form.add(nameField, gc);

        // Display the customer's current email address.
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 0;
        form.add(new JLabel("Email:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        emailField = new JTextField(customer.getEmail(), 20);
        form.add(emailField, gc);

        // Display the customer's current phone number.
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 0;
        form.add(new JLabel("Phone:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        phoneField = new JTextField(customer.getPhone(), 20);
        form.add(phoneField, gc);

        // Display the customer's current address.
        gc.gridx = 0;
        gc.gridy = 3;
        gc.weightx = 0;
        form.add(new JLabel("Address:"), gc);

        gc.gridx = 1;
        gc.weightx = 1;
        addressField = new JTextField(customer.getAddress(), 20);
        form.add(addressField, gc);

        add(form, BorderLayout.CENTER);

        // Create and style the Save Changes button.
        JButton saveButton = new JButton("Save Changes");
        saveButton.setBackground(new Color(40, 40, 80));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);

        // Save the updated information when clicked.
        saveButton.addActionListener(e -> saveChanges());

        add(saveButton, BorderLayout.SOUTH);
    }

    /**
     * Validates and saves the updated customer information.
     *
     * Sends the customer ID and edited fields to CustomerService.
     * If the update succeeds, displays a success message,
     * updates the customerUpdated flag, and closes the dialog.
     *
     * If validation fails, displays an error message
     * and allows the user to correct the information.
     */
    private void saveChanges() {

        CustomerService service = new CustomerService();

        // Send updated customer details to the business layer.
        Result<?> result = service.updateCustomer(
            customer.getCustomerId(),
            nameField.getText(),
            emailField.getText(),
            phoneField.getText(),
            addressField.getText()
        );

        if (result.isSuccess()) {

            JOptionPane.showMessageDialog(
                this,
                "Customer updated successfully!"
            );

            // Mark the update as successful.
            customerUpdated = true;

            // Close the dialog after updating.
            dispose();

        } else {

            // Display the validation error.
            JOptionPane.showMessageDialog(
                this,
                result.getErrorMessage()
            );
        }
    }

    /**
     * Checks whether the customer's details were updated.
     *
     * CustomerPanel uses this method to determine
     * whether the customer table should be refreshed.
     *
     * @return true if the customer was updated,
     *         otherwise false
     */
    public boolean isCustomerUpdated() {
        return customerUpdated;
    }
}
