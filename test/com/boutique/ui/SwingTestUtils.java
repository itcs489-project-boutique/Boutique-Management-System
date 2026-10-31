package com.boutique.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/** Small helpers for finding Swing components inside a container during tests. */
public final class SwingTestUtils {
    private SwingTestUtils() {}

    public static <T extends Component> List<T> findAll(Container root, Class<T> type) {
        List<T> out = new ArrayList<>();
        for (Component c : root.getComponents()) {
            if (type.isInstance(c)) out.add(type.cast(c));
            if (c instanceof Container) out.addAll(findAll((Container) c, type));
        }
        return out;
    }

    public static JButton button(Container root, String text) {
        for (JButton b : findAll(root, JButton.class)) if (text.equals(b.getText())) return b;
        return null;
    }

    public static boolean hasLabel(Container root, String text) {
        for (JLabel l : findAll(root, JLabel.class)) if (text.equals(l.getText())) return true;
        return false;
    }
}