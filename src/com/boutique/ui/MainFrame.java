package com.boutique.ui;

import com.boutique.enums.Role;
import com.boutique.model.Session;
import com.boutique.service.AuthService;
import com.boutique.ui.auth.ChangePasswordPanel;
import com.boutique.ui.auth.LoginFrame;
import com.boutique.ui.auth.SignUpPanel;
import com.boutique.ui.product.ProductPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer — Root application window shown after successful login.
 * Responsibilities: sidebar navigation filtered by role; content area that swaps panels;
 *                   sign-out action returning to LoginFrame.
 * Dependencies: Session, AuthService, role-specific panels (added per checkpoint)
 */
public class MainFrame extends JFrame {

    private final AuthService authService = new AuthService();

    private JPanel contentArea;
    private JPanel sidebar;

    public MainFrame() {
        setTitle("Boutique Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel root = new JPanel(new BorderLayout());

        // ── Top bar ──
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(new Color(40, 40, 80));
        topBar.setBorder(BorderFactory.createEmptyBorder(10, 16, 10, 16));

        JLabel appTitle = new JLabel("Boutique Management System");
        appTitle.setFont(new Font("SansSerif", Font.BOLD, 14));
        appTitle.setForeground(Color.WHITE);

        String userName = Session.getCurrentUser() != null
            ? Session.getCurrentUser().getFullName()
            : "Unknown";
        JLabel userLabel = new JLabel("Signed in as: " + userName);
        userLabel.setForeground(new Color(200, 200, 220));
        userLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));

        topBar.add(appTitle, BorderLayout.WEST);
        topBar.add(userLabel, BorderLayout.EAST);

        // ── Sidebar ──
        sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(55, 55, 95));
        sidebar.setPreferredSize(new Dimension(180, 0));
        sidebar.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));

        buildSidebar();

        // ── Content area ──
        contentArea = new JPanel(new BorderLayout());
        contentArea.setBackground(Color.WHITE);

        // Default landing panel
        JLabel welcome = new JLabel("Welcome, " + userName + "!", SwingConstants.CENTER);
        welcome.setFont(new Font("SansSerif", Font.PLAIN, 16));
        contentArea.add(welcome, BorderLayout.CENTER);

        root.add(topBar, BorderLayout.NORTH);
        root.add(sidebar, BorderLayout.WEST);
        root.add(contentArea, BorderLayout.CENTER);

        setContentPane(root);
    }

    /**
     * Builds sidebar nav items based on the current user's role.
     * Called once on init. Future checkpoints add their nav items here.
     */
    private void buildSidebar() {
        Role role = Session.getCurrentUser() != null
            ? Session.getCurrentUser().getRole()
            : null;

        // Abdulaziz: Products nav
        addNavItem("Products", () -> showPanel(new ProductPanel()));

        // ── Member 2: Customers nav (added at CP2.6) ──
        // placeholder — will be wired in CP2.6

        // ── Member 3: Orders nav (added at CP2.9) ──
        // placeholder — will be wired in CP2.9

        // ── Admin-only: User Management ──
        if (role == Role.ADMIN) {
            addNavItem("User Management", () -> showPanel(new SignUpPanel()));
        }

        // ── All roles: Change Password ──
        addNavItem("Change Password", () -> showPanel(new ChangePasswordPanel()));

        // ── Spacer pushes Sign Out to bottom ──
        sidebar.add(Box.createVerticalGlue());

        // ── Sign Out ──
        addNavItem("Sign Out", this::signOut);
    }

    /**
     * Creates a styled sidebar button and wires its action.
     * @param label  Button text
     * @param action Runnable to invoke on click
     */
    private void addNavItem(String label, Runnable action) {
        JButton btn = new JButton(label);
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        btn.setBackground(new Color(55, 55, 95));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setFont(new Font("SansSerif", Font.PLAIN, 13));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.addActionListener(e -> action.run());
        sidebar.add(btn);
    }

    /**
     * Swaps the content area to display the given panel.
     * Called by nav items and by future member panels.
     * @param panel The panel to display
     */
    public void showPanel(JPanel panel) {
        contentArea.removeAll();
        contentArea.add(panel, BorderLayout.CENTER);
        contentArea.revalidate();
        contentArea.repaint();
    }

    /**
     * Signs the current user out, disposes this frame, and returns to LoginFrame.
     */
    private void signOut() {
        authService.signOut();
        new LoginFrame().setVisible(true);
        dispose();
    }
}