package com.boutique.ui.checkout;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for ProcessingPanel: spinner and message, nothing clickable (FR4.4). */
public class ProcessingPanelTest {

    @Test void showsProcessingMessage() {
        assertTrue(hasLabel(new ProcessingPanel(), "Processing your payment..."));
    }

    @Test void showsIndeterminateProgressBar() {
        var bars = findAll(new ProcessingPanel(), JProgressBar.class);
        assertEquals(1, bars.size());
        assertTrue(bars.get(0).isIndeterminate());
    }

    @Test void containsNoButtons() {
        assertTrue(findAll(new ProcessingPanel(), JButton.class).isEmpty());
    }
}