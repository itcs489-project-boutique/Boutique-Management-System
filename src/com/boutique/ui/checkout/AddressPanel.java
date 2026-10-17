package com.boutique.ui.checkout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.function.Consumer;

/**
 * Presentation layer, checkout step 1 (FR4.2): confirm the delivery address.
 * Next is enabled only when street, city, region and postal code are all filled.
 * Dependencies: none (the caller passes callbacks and saves the address via OrderService).
 */
public class AddressPanel extends JPanel {
    private final JTextField street = new JTextField(22);
    private final JTextField city = new JTextField(22);
    private final JTextField region = new JTextField(22);
    private final JTextField postal = new JTextField(22);
    private final JButton next = new JButton("Next");

    /**
     * @param prefill address already on file for the customer (may be null)
     * @param onNext  called with the joined address when Next is pressed
     * @param onBack  called when Back is pressed
     */
    public AddressPanel(String prefill, Consumer<String> onNext, Runnable onBack) {
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(4, 6, 4, 6); g.anchor = GridBagConstraints.WEST;
        if (prefill != null) street.setText(prefill);
        String[] labels = {"Street", "City", "Region", "Postal code"};
        JTextField[] fields = {street, city, region, postal};
        DocumentListener dl = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { refresh(); }
            public void removeUpdate(DocumentEvent e) { refresh(); }
            public void changedUpdate(DocumentEvent e) { refresh(); }
        };
        g.gridx = 0; g.gridy = 0; g.gridwidth = 2; add(new JLabel("Delivery address"), g); g.gridwidth = 1;
        for (int i = 0; i < labels.length; i++) {
            g.gridx = 0; g.gridy = i + 1; add(new JLabel(labels[i] + ":"), g);
            g.gridx = 1; add(fields[i], g);
            fields[i].getDocument().addDocumentListener(dl);
        }
        JButton back = new JButton("Back");
        back.addActionListener(e -> onBack.run());
        next.addActionListener(e -> onNext.accept(
                street.getText().trim() + ", " + city.getText().trim() + ", "
                        + region.getText().trim() + " " + postal.getText().trim()));
        JPanel buttons = new JPanel(); buttons.add(back); buttons.add(next);
        g.gridx = 0; g.gridy = 5; g.gridwidth = 2; add(buttons, g);
        refresh();
    }

    /** Enables Next only when every field has text. */
    private void refresh() {
        next.setEnabled(!street.getText().isBlank() && !city.getText().isBlank()
                && !region.getText().isBlank() && !postal.getText().isBlank());
    }
}
