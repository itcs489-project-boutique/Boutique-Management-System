
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;

import com.boutique.model.Customer;

/**
 * Presentation layer for displaying customer details.
 *
 * This panel shows the selected customer's information,
 * including ID, name, email, phone, address,
 * account status, and registration date.
 *
 * The total number of orders is temporarily displayed
 * as zero until the Order module is integrated.
 */
public class CustomerDetailPanel extends JPanel {

    /**
     * Constructs a panel displaying the selected customer's details.
     *
     * @param customer the customer whose information will be displayed
     */
    public CustomerDetailPanel(Customer customer) {

        // Arrange customer details vertically.
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Add spacing around the panel.
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create and style the panel title.
        JLabel titleLabel = new JLabel("Customer Details");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(titleLabel);
        add(Box.createVerticalStrut(20));

        // Display the customer's unique ID.
        add(new JLabel("Customer ID: " + customer.getCustomerId()));
        add(Box.createVerticalStrut(10));

        // Display the customer's full name.
        add(new JLabel("Full Name: " + customer.getFullName()));
        add(Box.createVerticalStrut(10));

        // Display the customer's email address.
        add(new JLabel("Email: " + customer.getEmail()));
        add(Box.createVerticalStrut(10));

        // Display the customer's phone number.
        add(new JLabel("Phone: " + customer.getPhone()));
        add(Box.createVerticalStrut(10));

        // Display the customer's address.
        add(new JLabel("Address: " + customer.getAddress()));
        add(Box.createVerticalStrut(10));

        // Display whether the customer account is active or inactive.
        String status = customer.isActive() ? "Active" : "Inactive";
        add(new JLabel("Status: " + status));
        add(Box.createVerticalStrut(10));

        // Format the registration date for easier reading.
        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String registrationDate =
                customer.getRegistrationDate().format(dateFormatter);

        add(new JLabel("Registration Date: " + registrationDate));
        add(Box.createVerticalStrut(10));

        // Placeholder until Member 3's Order module is integrated.
        add(new JLabel("Total Orders: 0"));
    }
}
