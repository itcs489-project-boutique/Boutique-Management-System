package com.boutique.ui.checkout;

import com.boutique.model.Order;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for PaymentResultPanel: approved and declined views. */
public class PaymentResultPanelTest {

    @Test void approvedViewShowsTitleSummaryAndButtons() {
        Order o = new Order("ORD-0001", "C1", "Manama");
        PaymentResultPanel p = PaymentResultPanel.approved(o, "Dress x1", () -> {}, () -> {});

        assertTrue(hasLabel(p, "Payment approved - order confirmed"));
        String summary = findAll(p, JTextArea.class).get(0).getText();
        assertTrue(summary.contains("ORD-0001"));
        assertTrue(summary.contains("Manama"));
        assertTrue(summary.contains("Dress x1"));
        assertNotNull(button(p, "Track Order"));
        assertNotNull(button(p, "Close"));
    }

    @Test void approvedButtonsCallTheirCallbacks() {
        AtomicBoolean tracked = new AtomicBoolean(), closed = new AtomicBoolean();
        PaymentResultPanel p = PaymentResultPanel.approved(
                new Order("ORD-0001", "C1", "Manama"), "", () -> tracked.set(true), () -> closed.set(true));

        button(p, "Track Order").doClick();
        button(p, "Close").doClick();

        assertTrue(tracked.get());
        assertTrue(closed.get());
    }

    @Test void declinedViewShowsMessageAndRetryButton() {
        AtomicBoolean retried = new AtomicBoolean();
        PaymentResultPanel p = PaymentResultPanel.declined(() -> retried.set(true));

        assertTrue(hasLabel(p, "Payment declined"));
        button(p, "Try Again").doClick();
        assertTrue(retried.get());
    }
}