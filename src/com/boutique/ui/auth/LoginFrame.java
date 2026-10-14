package com.boutique.ui.auth;

import com.boutique.model.User;
import com.boutique.service.AuthService;
import com.boutique.util.Result;
import com.boutique.ui.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer — Authentication.
 * Responsibilities: displays the sign-in form; calls AuthService.signIn;
 *                   on success opens MainFrame and disposes itself.
 * Dependencies: AuthService, Result, MainFrame
 */
public class LoginFrame extends JFrame {

    private final AuthService authService = new AuthService();

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel errorLabel;
    private JButton signInButton;

    public LoginFrame() {
        setTitle("Boutique Management — Sign In");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
    }

    private void initComponents() {
        JPanel root = new JPanel(new BorderLayout(0, 0));
        root.setBackground(new Color(245, 245, 245));

        // ── Header ──
        JPanel header = new JPanel(new FlowLayout(FlowLayout.CENTER));
        header.setBackground(new Color(40, 40, 80));
        header.setBorder(BorderFactory.createEmptyBorder(16, 0, 16, 0));
        JLabel title = new JLabel("Boutique Management System");
        title.setFont(new Font("SansSerif", Font.BOLD, 16));
        title.setForeground(Color.WHITE);
        header.add(title);

        // ── Form ──
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(new Color(245, 245, 245));
        form.setBorder(BorderFactory.createEmptyBorder(24, 40, 8, 40));

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(6, 4, 6, 4);

        // Username
        gc.gridx = 0; gc.gridy = 0; gc.weightx = 0;
        form.add(new JLabel("Username:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        usernameField = new JTextField(18);
        form.add(usernameField, gc);

        // Password
        gc.gridx = 0; gc.gridy = 1; gc.weightx = 0;
        form.add(new JLabel("Password:"), gc);
        gc.gridx = 1; gc.weightx = 1;
        passwordField = new JPasswordField(18);
        form.add(passwordField, gc);

        // Sign In button
        gc.gridx = 1; gc.gridy = 2; gc.weightx = 1;
        gc.insets = new Insets(14, 4, 4, 4);
        signInButton = new JButton("Sign In");
        signInButton.setBackground(new Color(40, 40, 80));
        signInButton.setForeground(Color.WHITE);
        signInButton.setFocusPainted(false);
        form.add(signInButton, gc);

        // Error label
        gc.gridx = 0; gc.gridy = 3; gc.gridwidth = 2;
        gc.insets = new Insets(4, 4, 4, 4);
        errorLabel = new JLabel(" ");
        errorLabel.setForeground(new Color(180, 0, 0));
        errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        form.add(errorLabel, gc);

        root.add(header, BorderLayout.NORTH);
        root.add(form, BorderLayout.CENTER);

        setContentPane(root);

        // ── Actions ──
        signInButton.addActionListener(e -> attemptSignIn());
        // Allow Enter key on password field
        passwordField.addActionListener(e -> attemptSignIn());
        // Also allow Enter on username field to move focus to password
        usernameField.addActionListener(e -> passwordField.requestFocus());
    }

    private void attemptSignIn() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        signInButton.setEnabled(false);
        errorLabel.setText(" ");

        Result<User> result = authService.signIn(username, password);

        if (result.isSuccess()) {
            // Open main application window
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            dispose();
        } else {
            errorLabel.setText(result.getErrorMessage());
            passwordField.setText("");
            signInButton.setEnabled(true);
        }
    }
}