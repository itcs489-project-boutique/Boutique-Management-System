package com.boutique;

import com.boutique.ui.auth.LoginFrame;
import com.boutique.util.DataStore;

import javax.swing.*;

/**
 * Application entry point.
 * Initialises the DataStore and launches the login screen on the Swing EDT.
 */
public class Main {
    public static void main(String[] args) {
        // Initialise the singleton data store (seeds default admin)
        DataStore.getInstance();

        // Launch UI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
}