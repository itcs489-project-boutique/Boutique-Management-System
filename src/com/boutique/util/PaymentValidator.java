package com.boutique.util;

import java.time.YearMonth;

/**
 * Utility layer: pure static validation for the mock payment form (FR4.3).
 * No Swing code, so it can be unit-tested on its own.
 */
public final class PaymentValidator {
    private PaymentValidator() { }

    /** @return true if the cardholder name is not empty */
    public static boolean validateCardholderName(String s) {
        return s != null && !s.trim().isEmpty();
    }

    /** @return true if the card number is exactly 16 digits */
    public static boolean validateCardNumber(String s) {
        return s != null && s.matches("\\d{16}");
    }

    /** @return true if expiry is MM/YY (month 01-12) and not in the past */
    public static boolean validateExpiry(String s) {
        if (s == null || !s.matches("(0[1-9]|1[0-2])/\\d{2}")) return false;
        int month = Integer.parseInt(s.substring(0, 2));
        int year = 2000 + Integer.parseInt(s.substring(3, 5));
        return !YearMonth.of(year, month).isBefore(YearMonth.now());
    }

    /** @return true if the CVV is exactly 3 digits */
    public static boolean validateCVV(String s) {
        return s != null && s.matches("\\d{3}");
    }
}
