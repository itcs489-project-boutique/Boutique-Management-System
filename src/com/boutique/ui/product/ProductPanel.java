package com.boutique.ui.product;

import com.boutique.enums.ProductCategory;
import com.boutique.model.Product;
import com.boutique.service.ProductService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * Main product management panel.
 * Displays a searchable table of products with Add, Edit, Deactivate, Reactivate, and Delete actions.
 */
public class ProductPanel extends JPanel {

    private final ProductService productService = new ProductService();

    private final ProductSearchPanel searchPanel;
    private final DefaultTableModel tableModel;
    private final JTable table;
    private final JLabel statusLabel;

    private final JButton editBtn;
    private final JButton deactivateBtn;
    private final JButton reactivateBtn;
    private final JButton deleteBtn;

    private static final String[] COLUMNS =
            {"ID", "Name", "Category", "Price (BD)", "Stock", "Active"};

    public ProductPanel() {
        setLayout(new BorderLayout(0, 0));

        // ── Search bar (NORTH) ──────────────────────────────────────────────
        searchPanel = new ProductSearchPanel(this::loadProducts);
        add(searchPanel, BorderLayout.NORTH);

        // ── Table (CENTER) ──────────────────────────────────────────────────
        tableModel = new DefaultTableModel(COLUMNS, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setMaxWidth(0); // hide ID column
        table.setRowHeight(24);

        // Update button states when selection changes
        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) updateButtonStates();
        });

        add(new JScrollPane(table), BorderLayout.CENTER);

        // ── Button bar (SOUTH) ──────────────────────────────────────────────

        JPanel southPanel = new JPanel(new WrapLayout(FlowLayout.LEFT, 8, 8));

        JButton addBtn    = new JButton("Add Product");
        editBtn       = new JButton("Edit");
        deactivateBtn = new JButton("Deactivate");
        reactivateBtn = new JButton("Reactivate");
        deleteBtn     = new JButton("Delete");

        deleteBtn.setForeground(new Color(180, 0, 0));

        statusLabel = new JLabel(" ");
        statusLabel.setFont(statusLabel.getFont().deriveFont(Font.BOLD));

        southPanel.add(addBtn);
        southPanel.add(editBtn);
        southPanel.add(deactivateBtn);
        southPanel.add(reactivateBtn);
        southPanel.add(deleteBtn);
        southPanel.add(statusLabel);

        add(southPanel, BorderLayout.SOUTH);

        // ── Actions ─────────────────────────────────────────────────────────
        addBtn.addActionListener(e -> handleAdd());
        editBtn.addActionListener(e -> handleEdit());
        deactivateBtn.addActionListener(e -> handleDeactivate());
        reactivateBtn.addActionListener(e -> handleReactivate());
        deleteBtn.addActionListener(e -> handleDelete());

        // ── Initial state ───────────────────────────────────────────────────
        updateButtonStates();
        loadProducts();
    }

    private void loadProducts() {
        tableModel.setRowCount(0);
        String name = searchPanel.getNameFilter();
        ProductCategory category = searchPanel.getCategoryFilter();
        double minPrice = searchPanel.getMinPrice();
        double maxPrice = searchPanel.getMaxPrice();
        boolean showInactive = searchPanel.isShowInactive();

        List<Product> products;
        if (showInactive) {
            // Search across all products including inactive
            products = productService.searchProducts(name, category, minPrice, maxPrice);
            // Also include inactive ones that match
            List<Product> inactive = productService.getAllProductsIncludingInactive().stream()
                    .filter(p -> !p.isActive())
                    .filter(p -> name.isEmpty() || p.getName().toLowerCase().contains(name.toLowerCase()))
                    .filter(p -> category == null || p.getCategory() == category)
                    .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                    .toList();
            products = new java.util.ArrayList<>(products);
            products.addAll(inactive);
        } else {
            products = productService.searchProducts(name, category, minPrice, maxPrice);
        }

        for (Product p : products) {
            tableModel.addRow(new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getCategory().name(),
                    String.format("%.3f", p.getPrice()),
                    p.getStockQuantity(),
                    p.isActive() ? "Yes" : "No"
            });
        }
        updateButtonStates();
        clearStatus();
    }

    private void updateButtonStates() {
        int row = table.getSelectedRow();
        if (row < 0) {
            editBtn.setEnabled(false);
            deactivateBtn.setEnabled(false);
            reactivateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
            return;
        }
        String activeVal = (String) tableModel.getValueAt(row, 5);
        boolean isActive = "Yes".equals(activeVal);
        editBtn.setEnabled(isActive);
        deactivateBtn.setEnabled(isActive);
        reactivateBtn.setEnabled(!isActive);
        deleteBtn.setEnabled(true);
    }

    private void handleAdd() {
        Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
        AddProductDialog dialog = new AddProductDialog(parent, productService);
        dialog.setVisible(true);
        if (dialog.isProductAdded()) {
            loadProducts();
            showSuccess("Product added successfully.");
        }
    }

    private void handleEdit() {
        int row = table.getSelectedRow();
        if (row < 0) { showError("Select a product to edit."); return; }
        String productId = (String) tableModel.getValueAt(row, 0);
        productService.getProductById(productId).ifPresentOrElse(product -> {
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            EditProductDialog dialog = new EditProductDialog(parent, productService, product);
            dialog.setVisible(true);
            if (dialog.isProductUpdated()) {
                loadProducts();
                showSuccess("Product updated successfully.");
            }
        }, () -> showError("Product not found. Please refresh."));
    }

    private void handleDeactivate() {
        int row = table.getSelectedRow();
        if (row < 0) { showError("Select a product to deactivate."); return; }
        String name = (String) tableModel.getValueAt(row, 1);
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Deactivate \"" + name + "\"? It can be reactivated later.",
                "Confirm Deactivate",
                JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        String productId = (String) tableModel.getValueAt(row, 0);
        var result = productService.deleteProduct(productId);
        if (result.isSuccess()) {
            searchPanel.setShowInactive(true);
            loadProducts();
            showSuccess("\"" + name + "\" deactivated.");
        } else {
            showError(result.getErrorMessage());
        }
    }

    private void handleReactivate() {
        int row = table.getSelectedRow();
        if (row < 0) { showError("Select a product to reactivate."); return; }
        String productId = (String) tableModel.getValueAt(row, 0);
        String name = (String) tableModel.getValueAt(row, 1);
        var result = productService.reactivateProduct(productId);
        if (result.isSuccess()) {
            loadProducts();
            showSuccess("\"" + name + "\" reactivated.");
        } else {
            showError(result.getErrorMessage());
        }
    }

    private void handleDelete() {
        int row = table.getSelectedRow();
        if (row < 0) { showError("Select a product to delete."); return; }
        String name = (String) tableModel.getValueAt(row, 1);
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Permanently delete \"" + name + "\"? This cannot be undone.\n" +
                "Note: deletion will be blocked in a future update if unfulfilled orders exist.",
                "Confirm Permanent Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (confirm != JOptionPane.YES_OPTION) return;
        String productId = (String) tableModel.getValueAt(row, 0);
        var result = productService.hardDeleteProduct(productId);
        if (result.isSuccess()) {
            loadProducts();
            showSuccess("\"" + name + "\" permanently deleted.");
        } else {
            showError(result.getErrorMessage());
        }
    }

    private void showSuccess(String msg) {
        statusLabel.setForeground(new Color(0, 140, 0));
        statusLabel.setText(msg);
    }

    private void showError(String msg) {
        statusLabel.setForeground(Color.RED);
        statusLabel.setText(msg);
    }

    private void clearStatus() {
        statusLabel.setText(" ");
    }


        private static class WrapLayout extends FlowLayout {
        public WrapLayout(int align, int hgap, int vgap) {
            super(align, hgap, vgap);
        }

        @Override
        public Dimension preferredLayoutSize(Container target) {
            return layoutSize(target, true);
        }

        @Override
        public Dimension minimumLayoutSize(Container target) {
            return layoutSize(target, false);
        }

        private Dimension layoutSize(Container target, boolean preferred) {
            synchronized (target.getTreeLock()) {
                int targetWidth = target.getSize().width;
                if (targetWidth == 0) targetWidth = Integer.MAX_VALUE;
                int hgap = getHgap();
                int vgap = getVgap();
                Insets insets = target.getInsets();
                int maxWidth = targetWidth - (insets.left + insets.right + hgap * 2);
                int x = 0, y = insets.top + vgap, rowHeight = 0;
                for (int i = 0; i < target.getComponentCount(); i++) {
                    Component c = target.getComponent(i);
                    if (!c.isVisible()) continue;
                    Dimension d = preferred ? c.getPreferredSize() : c.getMinimumSize();
                    if (x == 0 || x + d.width <= maxWidth) {
                        x += d.width + hgap;
                        rowHeight = Math.max(rowHeight, d.height);
                    } else {
                        y += rowHeight + vgap;
                        x = d.width + hgap;
                        rowHeight = d.height;
                    }
                }
                y += rowHeight + vgap + insets.bottom;
                return new Dimension(targetWidth, y);
            }
        }
    }
}