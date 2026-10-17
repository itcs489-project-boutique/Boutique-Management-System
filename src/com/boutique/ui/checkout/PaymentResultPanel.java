package com.boutique.ui.checkout;

import com.boutique.model.Order;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer, checkout step 4 (FR4.5): APPROVED confirmation or DECLINED message.
 * Dependencies: Order model only (display).
 */
public class PaymentResultPanel extends JPanel {

    /**
     * Builds the approved view: order id, item summary and the Track Order / Close buttons.
     * @param order       the confirmed order
     * @param itemsText   one line per item plus the total
     * @param onTrack     called when Track Order is pressed
     * @param onClose     called when Close is pressed
     */
    public static PaymentResultPanel approved(Order order, String itemsText, Runnable onTrack, Runnable onClose) {
        PaymentResultPanel p = new PaymentResultPanel();
        JLabel title = new JLabel("Payment approved - order confirmed", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        title.setForeground(new Color(0, 130, 0));
        JTextArea summary = new JTextArea(String.format(
                "Order ID: %s%nStatus: %s%nDelivery address: %s%n%n%s",
                order.getOrderId(), order.getStatus(), order.getDeliveryAddress(), itemsText));
        summary.setEditable(false); summary.setOpaque(false);
        JButton track = new JButton("Track Order");
        track.addActionListener(e -> onTrack.run());
        JButton close = new JButton("Close");
        close.addActionListener(e -> onClose.run());
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttons.add(track); buttons.add(close);
        p.add(title, BorderLayout.NORTH); p.add(summary, BorderLayout.CENTER); p.add(buttons, BorderLayout.SOUTH);
        return p;
    }

    /** Builds the declined view: clear reason and a Try Again button. */
    public static PaymentResultPanel declined(Runnable onRetry) {
        PaymentResultPanel p = new PaymentResultPanel();
        JLabel title = new JLabel("Payment declined", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        title.setForeground(new Color(190, 0, 0));
        JLabel why = new JLabel("The bank declined this card. Please try different card details.", SwingConstants.CENTER);
        JButton retry = new JButton("Try Again");
        retry.addActionListener(e -> onRetry.run());
        p.add(title, BorderLayout.NORTH); p.add(why, BorderLayout.CENTER); p.add(retry, BorderLayout.SOUTH);
        return p;
    }

    /** Private: panels are created through approved() or declined() only. */
    private PaymentResultPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
}
