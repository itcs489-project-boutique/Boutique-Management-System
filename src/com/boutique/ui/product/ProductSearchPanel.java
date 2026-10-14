package com.boutique.ui.product;

import com.boutique.enums.ProductCategory;

import javax.swing.*;
import java.awt.*;

/**
 * Search/filter bar for the product list.
 * Uses WrapLayout so buttons never clip on resize.
 */
public class ProductSearchPanel extends JPanel {

    private final JTextField nameField;
    private final JComboBox<String> categoryCombo;
    private final JTextField minPriceField;
    private final JTextField maxPriceField;
    private final JCheckBox showInactiveBox;
    private final Runnable onSearch;

    public ProductSearchPanel(Runnable onSearch) {
        this.onSearch = onSearch;
        setLayout(new WrapLayout(FlowLayout.LEFT, 8, 8));
        setBorder(BorderFactory.createTitledBorder("Search / Filter"));

        add(new JLabel("Name:"));
        nameField = new JTextField(12);
        add(nameField);

        add(new JLabel("Category:"));
        categoryCombo = new JComboBox<>();
        categoryCombo.addItem("All");
        for (ProductCategory pc : ProductCategory.values()) {
            categoryCombo.addItem(pc.name());
        }
        add(categoryCombo);

        add(new JLabel("Min Price:"));
        minPriceField = new JTextField(6);
        add(minPriceField);

        add(new JLabel("Max Price:"));
        maxPriceField = new JTextField(6);
        add(maxPriceField);

        // Hidden checkbox — state tracked internally, toggled by button below
        showInactiveBox = new JCheckBox();
        showInactiveBox.setVisible(false);

        JButton showInactiveBtn = new JButton("Show Inactive");
        showInactiveBtn.addActionListener(e -> {
            showInactiveBox.setSelected(!showInactiveBox.isSelected());
            onSearch.run();
        });
        add(showInactiveBtn);

        JButton searchBtn = new JButton("Search");
        searchBtn.addActionListener(e -> onSearch.run());
        add(searchBtn);

        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> {
            nameField.setText("");
            categoryCombo.setSelectedIndex(0);
            minPriceField.setText("");
            maxPriceField.setText("");
            showInactiveBox.setSelected(false);
            onSearch.run();
        });
        add(clearBtn);
    }

    public String getNameFilter() {
        return nameField.getText().trim();
    }

    public ProductCategory getCategoryFilter() {
        String selected = (String) categoryCombo.getSelectedItem();
        if ("All".equals(selected)) return null;
        try {
            return ProductCategory.valueOf(selected);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public double getMinPrice() {
        try {
            return Double.parseDouble(minPriceField.getText().trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public double getMaxPrice() {
        try {
            return Double.parseDouble(maxPriceField.getText().trim());
        } catch (NumberFormatException e) {
            return Double.MAX_VALUE;
        }
    }

    public boolean isShowInactive() {
        return showInactiveBox.isSelected();
    }

    public void setShowInactive(boolean value) {
        showInactiveBox.setSelected(value);
    }

    // ── WrapLayout ───────────────────────────────────────────────────────────

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