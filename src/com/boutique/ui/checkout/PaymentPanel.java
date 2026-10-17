package com.boutique.ui.checkout;

import com.boutique.util.PaymentValidator;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.function.Consumer;

/**
 * Presentation layer, checkout step 2 (FR4.3): mock payment form with real-time validation.
 * Each field gets a green/red border while typing; Pay stays disabled until all four pass.
 * Dependencies: PaymentValidator (pure validation logic).
 */
public class PaymentPanel extends JPanel {
    private static final Color OK = new Color(0, 150, 0);
    private static final Color BAD = new Color(200, 0, 0);
    private final JTextField name = new JTextField(20);
    private final JTextField card = new JTextField(20);
    private final JTextField expiry = new JTextField(6);
    private final JTextField cvv = new JTextField(4);
    private final JButton pay = new JButton("Pay");

    /**
     * @param total orderTotal shown prominently at the top
     * @param onPay called with the card number when Pay is pressed
     */
    public PaymentPanel(double total, Consumer<String> onPay) {
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(4, 6, 4, 6); g.anchor = GridBagConstraints.WEST;
        JLabel totalLabel = new JLabel(String.format("Amount to pay: %.3f", total));
        totalLabel.setFont(totalLabel.getFont().deriveFont(Font.BOLD, 18f));
        g.gridx = 0; g.gridy = 0; g.gridwidth = 2; add(totalLabel, g); g.gridwidth = 1;

        String[] labels = {"Cardholder name", "Card number (16 digits)", "Expiry (MM/YY)", "CVV (3 digits)"};
        JTextField[] fields = {name, card, expiry, cvv};
        DocumentListener dl = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { validateAll(); }
            public void removeUpdate(DocumentEvent e) { validateAll(); }
            public void changedUpdate(DocumentEvent e) { validateAll(); }
        };
        for (int i = 0; i < labels.length; i++) {
            g.gridx = 0; g.gridy = i + 1; add(new JLabel(labels[i] + ":"), g);
            g.gridx = 1; add(fields[i], g);
            fields[i].getDocument().addDocumentListener(dl);
        }
        pay.addActionListener(e -> onPay.accept(card.getText().trim()));
        g.gridx = 0; g.gridy = 5; g.gridwidth = 2; add(pay, g);
        validateAll();
    }

    /** Clears every field (used by "Try Again" after a decline). */
    public void reset() {
        name.setText(""); card.setText(""); expiry.setText(""); cvv.setText("");
        validateAll();
    }

    /** Re-checks all four fields, colours their borders and enables Pay only if all pass. */
    private void validateAll() {
        boolean a = mark(name, PaymentValidator.validateCardholderName(name.getText()));
        boolean b = mark(card, PaymentValidator.validateCardNumber(card.getText().trim()));
        boolean c = mark(expiry, PaymentValidator.validateExpiry(expiry.getText().trim()));
        boolean d = mark(cvv, PaymentValidator.validateCVV(cvv.getText().trim()));
        pay.setEnabled(a && b && c && d);
    }

    /** Paints the field border green or red; stays neutral while the field is empty. */
    private boolean mark(JTextField f, boolean valid) {
        if (f.getText().isEmpty()) f.setBorder(UIManager.getBorder("TextField.border"));
        else f.setBorder(BorderFactory.createLineBorder(valid ? OK : BAD, 2));
        return valid;
    }
}
