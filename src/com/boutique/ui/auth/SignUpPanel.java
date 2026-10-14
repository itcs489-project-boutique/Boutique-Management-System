package com.boutique.ui.auth;

import com.boutique.enums.Role;
import com.boutique.model.User;
import com.boutique.service.AuthService;
import com.boutique.util.Result;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer — Authentication.
 * Responsibilities: form for creating a new user account; calls AuthService.signUp.
 *                   Embedded inside the admin area of MainFrame.
 * Dependencies: AuthService, Role, Result
 */
public class SignUpPanel extends JPanel {

    private final AuthService authService = new AuthService();

    private JTextField usernameField;
    private JTextField fullNameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JComboBox<Role> roleCombo;
    private JLabel statusLabel;

    public SignUpPanel() {
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        // ── Title ──
        JLabel title = new JLabel("Create New Account");
        title.setFont(new Font("SansSerif", Font.BOLD, 15));
        title.setBorder(BorderFactory.createEmptyBorder(12, 16, 8, 16));

        // ── Form ──
        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createEmptyBorder(8, 24, 8, 24));

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(5, 4, 5, 4);

        gc.gridx = 0; gc.gridy = 0; gc.weightx = 0;
        form.add(new JLabel("Full Name:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        fullNameField = new JTextField(20);
        form.add(fullNameField, gc);

        gc.gridx = 0; gc.gridy = 1; gc.weightx = 0;
        form.add(new JLabel("Username:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        usernameField = new JTextField(20);
        form.add(usernameField, gc);

        gc.gridx = 0; gc.gridy = 2; gc.weightx = 0;
        form.add(new JLabel("Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        passwordField = new JPasswordField(20);
        form.add(passwordField, gc);

        gc.gridx = 0; gc.gridy = 3; gc.weightx = 0;
        form.add(new JLabel("Confirm Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        confirmPasswordField = new JPasswordField(20);
        form.add(confirmPasswordField, gc);

        gc.gridx = 0; gc.gridy = 4; gc.weightx = 0;
        form.add(new JLabel("Role:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        roleCombo = new JComboBox<>(Role.values());
        form.add(roleCombo, gc);

        // ── Button ──
        gc.gridx = 1; gc.gridy = 5;
        gc.insets = new Insets(12, 4, 4, 4);
        JButton createButton = new JButton("Create Account");
        createButton.setBackground(new Color(40, 40, 80));
        createButton.setForeground(Color.WHITE);
        createButton.setFocusPainted(false);
        form.add(createButton, gc);

        // ── Status label ──
        gc.gridx = 0; gc.gridy = 6; gc.gridwidth = 2;
        gc.insets = new Insets(4, 4, 4, 4);
        statusLabel = new JLabel(" ");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        form.add(statusLabel, gc);

        add(title, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);

        // ── Actions ──
        createButton.addActionListener(e -> attemptSignUp());
    }

    private void attemptSignUp() {
        String fullName   = fullNameField.getText().trim();
        String username   = usernameField.getText().trim();
        String password   = new String(passwordField.getPassword());
        String confirm    = new String(confirmPasswordField.getPassword());
        Role   role       = (Role) roleCombo.getSelectedItem();

        // Client-side confirmation check before hitting the service
        if (!password.equals(confirm)) {
            showError("Passwords do not match.");
            return;
        }

        Result<User> result = authService.signUp(username, password, fullName, role);

        if (result.isSuccess()) {
            showSuccess("Account created for '" + result.getValue().getUsername() + "'.");
            clearFields();
        } else {
            showError(result.getErrorMessage());
        }
    }

    private void showError(String message) {
        statusLabel.setForeground(new Color(180, 0, 0));
        statusLabel.setText(message);
    }

    private void showSuccess(String message) {
        statusLabel.setForeground(new Color(0, 120, 0));
        statusLabel.setText(message);
    }

    private void clearFields() {
        fullNameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        roleCombo.setSelectedIndex(0);
    }
}