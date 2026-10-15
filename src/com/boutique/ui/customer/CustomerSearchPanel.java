
package com.boutique.ui.customer;

import javax.swing.*;
import java.awt.*;
import java.util.function.Consumer;

public class CustomerSearchPanel extends JPanel {

    private JTextField searchField;
    private JButton searchButton;
    private JButton showAllButton;
    private Consumer<String> onSearch;

    public CustomerSearchPanel(Consumer<String> onSearch) {
        this.onSearch = onSearch;
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel searchLabel = new JLabel("Search Customer:");

        searchField = new JTextField(20);

        searchButton = new JButton("Search");
        searchButton.setBackground(new Color(40, 40, 80));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchButton.addActionListener(e -> {
            this.onSearch.accept(searchField.getText().trim());
        });

        
        // Show All button
        showAllButton = new JButton("Show All");
        showAllButton.setBackground(new Color(40, 40, 80));
        showAllButton.setForeground(Color.WHITE);
        showAllButton.setFocusPainted(false);

        showAllButton.addActionListener(e -> {
            searchField.setText("");
            this.onSearch.accept("");
        });


        add(searchLabel);
        add(searchField);
        add(searchButton);
        add(showAllButton);
    }
}
