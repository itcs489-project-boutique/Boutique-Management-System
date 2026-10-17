package com.boutique.ui.checkout;

import javax.swing.*;
import java.awt.*;

/**
 * Presentation layer, checkout step 3 (FR4.4): shown while the bank simulation runs.
 * Contains no interactive elements, so the customer cannot click anything.
 */
public class ProcessingPanel extends JPanel {
    /** Builds a centred spinner with the "Processing your payment..." message. */
    public ProcessingPanel() {
        setLayout(new GridBagLayout());
        JPanel box = new JPanel(new BorderLayout(0, 10));
        JProgressBar bar = new JProgressBar();
        bar.setIndeterminate(true);
        box.add(new JLabel("Processing your payment...", SwingConstants.CENTER), BorderLayout.NORTH);
        box.add(bar, BorderLayout.CENTER);
        add(box);
    }
}
