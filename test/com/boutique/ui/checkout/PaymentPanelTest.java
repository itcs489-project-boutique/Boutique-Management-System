package com.boutique.ui.checkout;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.time.YearMonth;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for PaymentPanel: real-time validation and the Pay button. */
public class PaymentPanelTest {
    private final AtomicReference<String> paid = new AtomicReference<>();

    private PaymentPanel panel() { return new PaymentPanel(12.5, paid::set); }

    private String futureExpiry() {
        YearMonth n = YearMonth.now().plusMonths(1);
        return String.format("%02d/%02d", n.getMonthValue(), n.getYear() % 100);
    }

    /** Field order: cardholder name, card number, expiry, CVV. */
    private void fill(PaymentPanel p, String name, String card, String exp, String cvv) {
        List<JTextField> f = findAll(p, JTextField.class);
        f.get(0).setText(name);
        f.get(1).setText(card);
        f.get(2).setText(exp);
        f.get(3).setText(cvv);
    }

    @Test void showsAmountAndHasFourFields() {
        PaymentPanel p = panel();
        assertTrue(hasLabel(p, String.format("Amount to pay: %.3f", 12.5)));
        assertEquals(4, findAll(p, JTextField.class).size());
    }

    @Test void payDisabledAtStart() {
        assertFalse(button(panel(), "Pay").isEnabled());
    }

    @Test void payEnabledWithValidDetails() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234567812345678", futureExpiry(), "123");
        assertTrue(button(p, "Pay").isEnabled());
    }

    @Test void payDisabledWithShortCardNumber() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234", futureExpiry(), "123");
        assertFalse(button(p, "Pay").isEnabled());
    }

    @Test void payDisabledWithExpiredCard() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234567812345678", "01/20", "123");
        assertFalse(button(p, "Pay").isEnabled());
    }

    @Test void payDisabledWithBadCvv() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234567812345678", futureExpiry(), "12");
        assertFalse(button(p, "Pay").isEnabled());
    }

    @Test void payPassesCardNumberToCallback() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234567812345678", futureExpiry(), "123");
        button(p, "Pay").doClick();
        assertEquals("1234567812345678", paid.get());
    }

    @Test void resetClearsFieldsAndDisablesPay() {
        PaymentPanel p = panel();
        fill(p, "Ali Hassan", "1234567812345678", futureExpiry(), "123");
        p.reset();
        for (JTextField f : findAll(p, JTextField.class)) assertEquals("", f.getText());
        assertFalse(button(p, "Pay").isEnabled());
    }
}