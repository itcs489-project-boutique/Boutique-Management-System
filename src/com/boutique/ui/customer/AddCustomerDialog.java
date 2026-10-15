
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import com.boutique.service.CustomerService;
import com.boutique.util.Result;

public class AddCustomerDialog extends JDialog {

    private boolean customerAdded = false;

    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;

    public AddCustomerDialog(JFrame parent) {
        super(parent, "Add Customer", true);

        setSize(500, 350);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        JLabel title = new JLabel(
            "Add New Customer",
            SwingConstants.CENTER
        );

        title.setFont(new Font("SansSerif", Font.BOLD, 18));

        add(title, BorderLayout.NORTH);
        
        // Customer information form
        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(5, 4, 5, 4);

        // Full Name
        gc.gridx = 0; gc.gridy = 0; gc.weightx = 0;
        form.add(new JLabel("Full Name:"), gc);

        gc.gridx = 1; gc.weightx = 1;
        nameField = new JTextField(20);
        form.add(nameField, gc);

        // Email
        gc.gridx = 0; gc.gridy = 1; gc.weightx = 0;
        form.add(new JLabel("Email:"), gc);

        gc.gridx = 1; gc.weightx = 1;
        emailField = new JTextField(20);
        form.add(emailField, gc);

        // Phone
        gc.gridx = 0; gc.gridy = 2; gc.weightx = 0;
        form.add(new JLabel("Phone:"), gc);

        gc.gridx = 1; gc.weightx = 1;
        phoneField = new JTextField(20);
        form.add(phoneField, gc);

        // Address
        gc.gridx = 0; gc.gridy = 3; gc.weightx = 0;
        form.add(new JLabel("Address:"), gc);

        gc.gridx = 1; gc.weightx = 1;
        addressField = new JTextField(20);
        form.add(addressField, gc);

        add(form, BorderLayout.CENTER);

        
        // Save Customer button
        JButton saveButton = new JButton("Save Customer");
        saveButton.setBackground(new Color(40, 40, 80));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);

        saveButton.addActionListener(e -> {
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

                customerAdded = true;

                dispose();

            } else {
                JOptionPane.showMessageDialog(
                    this,
                    result.getErrorMessage()
                );
            }
        });

        add(saveButton, BorderLayout.SOUTH);


    }
    public boolean isCustomerAdded() {
        return customerAdded;
    }
}
