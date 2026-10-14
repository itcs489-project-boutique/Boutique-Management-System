package com.boutique.ui.auth;

import com.boutique.service.AuthService;
import com.boutique.util.Result;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer — Authentication.
 * Responsibilities: form for changing the signed-in user's password;
 *                   calls AuthService.changePassword.
 * Dependencies: AuthService, Result
 */
public class ChangePasswordPanel extends JPanel {

    private final AuthService authService = new AuthService();

    private JPasswordField currentPasswordField;
    private JPasswordField newPasswordField;
    private JPasswordField confirmPasswordField;
    private JLabel statusLabel;

    public ChangePasswordPanel() {
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        JLabel title = new JLabel("Change Password");
        title.setFont(new Font("SansSerif", Font.BOLD, 15));
        title.setBorder(BorderFactory.createEmptyBorder(12, 16, 8, 16));

        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createEmptyBorder(8, 24, 8, 24));

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(5, 4, 5, 4);

        gc.gridx = 0; gc.gridy = 0; gc.weightx = 0;
        form.add(new JLabel("Current Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        currentPasswordField = new JPasswordField(20);
        form.add(currentPasswordField, gc);

        gc.gridx = 0; gc.gridy = 1; gc.weightx = 0;
        form.add(new JLabel("New Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        newPasswordField = new JPasswordField(20);
        form.add(newPasswordField, gc);

        gc.gridx = 0; gc.gridy = 2; gc.weightx = 0;
        form.add(new JLabel("Confirm New Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        confirmPasswordField = new JPasswordField(20);
        form.add(confirmPasswordField, gc);

        gc.gridx = 1; gc.gridy = 3;
        gc.insets = new Insets(12, 4, 4, 4);
        JButton changeButton = new JButton("Change Password");
        changeButton.setBackground(new Color(40, 40, 80));
        changeButton.setForeground(Color.WHITE);
        changeButton.setFocusPainted(false);
        form.add(changeButton, gc);

        gc.gridx = 0; gc.gridy = 4; gc.gridwidth = 2;
        gc.insets = new Insets(4, 4, 4, 4);
        statusLabel = new JLabel(" ");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        form.add(statusLabel, gc);

        add(title, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);

        changeButton.addActionListener(e -> attemptChange());
    }

    private void attemptChange() {
        String current = new String(currentPasswordField.getPassword());
        String newPw   = new String(newPasswordField.getPassword());
        String confirm = new String(confirmPasswordField.getPassword());

        Result<Void> result = authService.changePassword(current, newPw, confirm);

        if (result.isSuccess()) {
            statusLabel.setForeground(new Color(0, 120, 0));
            statusLabel.setText("Password changed successfully.");
            currentPasswordField.setText("");
            newPasswordField.setText("");
            confirmPasswordField.setText("");
        } else {
            statusLabel.setForeground(new Color(180, 0, 0));
            statusLabel.setText(result.getErrorMessage());
        }
    }
}