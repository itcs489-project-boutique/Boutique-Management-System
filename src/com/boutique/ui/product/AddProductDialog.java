package com.boutique.ui.product;

import com.boutique.enums.ProductCategory;
import com.boutique.model.Product;
import com.boutique.service.ProductService;
import com.boutique.util.Result;

import javax.swing.*;
import java.awt.*;

/**
 * Modal dialog for adding a new product.
 * Calls ProductService.addProduct() and reports success/failure inline.
 */
public class AddProductDialog extends JDialog {

    private final ProductService productService;
    private boolean productAdded = false;

    private final JTextField nameField;
    private final JComboBox<ProductCategory> categoryCombo;
    private final JTextArea descArea;
    private final JTextField priceField;
    private final JTextField qtyField;
    private final JLabel statusLabel;

    public AddProductDialog(Frame parent, ProductService productService) {
        super(parent, "Add New Product", true);
        this.productService = productService;

        setSize(420, 360);
        setLocationRelativeTo(parent);
        setResizable(false);

        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createEmptyBorder(16, 16, 8, 16));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(6, 6, 6, 6);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0;
        form.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1; gbc.weightx = 1;
        nameField = new JTextField();
        form.add(nameField, gbc);

        // Category
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0;
        form.add(new JLabel("Category:"), gbc);
        gbc.gridx = 1; gbc.weightx = 1;
        categoryCombo = new JComboBox<>(ProductCategory.values());
        form.add(categoryCombo, gbc);

        // Description
        gbc.gridx = 0; gbc.gridy = 2; gbc.weightx = 0; gbc.anchor = GridBagConstraints.NORTHWEST;
        form.add(new JLabel("Description:"), gbc);
        gbc.gridx = 1; gbc.weightx = 1; gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        descArea = new JTextArea(3, 20);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        form.add(new JScrollPane(descArea), gbc);
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;

        // Price
        gbc.gridx = 0; gbc.gridy = 3; gbc.weightx = 0;
        form.add(new JLabel("Price (BD):"), gbc);
        gbc.gridx = 1; gbc.weightx = 1;
        priceField = new JTextField();
        form.add(priceField, gbc);

        // Quantity
        gbc.gridx = 0; gbc.gridy = 4; gbc.weightx = 0;
        form.add(new JLabel("Stock Qty:"), gbc);
        gbc.gridx = 1; gbc.weightx = 1;
        qtyField = new JTextField();
        form.add(qtyField, gbc);

        // Status label
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        statusLabel = new JLabel(" ");
        statusLabel.setFont(statusLabel.getFont().deriveFont(Font.BOLD));
        form.add(statusLabel, gbc);

        // Buttons
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton saveBtn = new JButton("Save");
        JButton cancelBtn = new JButton("Cancel");
        btnPanel.add(saveBtn);
        btnPanel.add(cancelBtn);

        saveBtn.addActionListener(e -> handleSave());
        cancelBtn.addActionListener(e -> dispose());

        // Enter key on save
        getRootPane().setDefaultButton(saveBtn);

        setLayout(new BorderLayout());
        add(form, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
    }

    private void handleSave() {
        String name = nameField.getText().trim();
        ProductCategory category = (ProductCategory) categoryCombo.getSelectedItem();
        String desc = descArea.getText().trim();
        double price;
        int qty;

        try {
            price = Double.parseDouble(priceField.getText().trim());
        } catch (NumberFormatException e) {
            showError("Price must be a valid number.");
            return;
        }

        try {
            qty = Integer.parseInt(qtyField.getText().trim());
        } catch (NumberFormatException e) {
            showError("Stock quantity must be a whole number.");
            return;
        }

        Result<Product> result = productService.addProduct(name, category, desc, price, qty);
        if (result.isSuccess()) {
            productAdded = true;
            dispose();
        } else {
            showError(result.getErrorMessage());
        }
    }

    private void showError(String message) {
        statusLabel.setForeground(Color.RED);
        statusLabel.setText(message);
    }

    /** Returns true if a product was successfully added before the dialog closed. */
    public boolean isProductAdded() {
        return productAdded;
    }
}