package com.boutique.ui.checkout;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for AddressPanel: Next is enabled only when all four fields are filled. */
public class AddressPanelTest {
    private final AtomicReference<String> nextValue = new AtomicReference<>();
    private final AtomicBoolean backClicked = new AtomicBoolean(false);

    private AddressPanel panel(String prefill) {
        return new AddressPanel(prefill, nextValue::set, () -> backClicked.set(true));
    }

    private void fill(AddressPanel p, String street, String city, String region, String postal) {
        List<JTextField> f = findAll(p, JTextField.class);
        f.get(0).setText(street);
        f.get(1).setText(city);
        f.get(2).setText(region);
        f.get(3).setText(postal);
    }

    @Test void hasFourFieldsAndNextDisabledAtStart() {
        AddressPanel p = panel(null);
        assertEquals(4, findAll(p, JTextField.class).size());
        assertFalse(button(p, "Next").isEnabled());
    }

    @Test void nextStaysDisabledWhenOneFieldMissing() {
        AddressPanel p = panel(null);
        fill(p, "Road 12", "Manama", "Capital", "");
        assertFalse(button(p, "Next").isEnabled());
    }

    @Test void nextStaysDisabledForBlankSpaces() {
        AddressPanel p = panel(null);
        fill(p, "  ", "  ", "  ", "  ");
        assertFalse(button(p, "Next").isEnabled());
    }

    @Test void nextEnabledWhenAllFieldsFilled() {
        AddressPanel p = panel(null);
        fill(p, "Road 12", "Manama", "Capital", "305");
        assertTrue(button(p, "Next").isEnabled());
    }

    @Test void nextSendsJoinedAddress() {
        AddressPanel p = panel(null);
        fill(p, "Road 12", "Manama", "Capital", "305");
        button(p, "Next").doClick();
        assertEquals("Road 12, Manama, Capital 305", nextValue.get());
    }

    @Test void backButtonCallsCallback() {
        button(panel(null), "Back").doClick();
        assertTrue(backClicked.get());
    }

    @Test void prefillGoesIntoStreetField() {
        AddressPanel p = panel("Old Street 5");
        assertEquals("Old Street 5", findAll(p, JTextField.class).get(0).getText());
        assertFalse(button(p, "Next").isEnabled());
    }
}