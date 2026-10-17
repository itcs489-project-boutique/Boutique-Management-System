package com.boutique.util;

import org.junit.jupiter.api.Test;
import java.time.YearMonth;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for PaymentValidator (FR4.3) - runs without any UI. */
class PaymentValidatorTest {

    @Test void cardholderNameMustNotBeEmpty() {
        assertTrue(PaymentValidator.validateCardholderName("Ali Hassan"));
        assertFalse(PaymentValidator.validateCardholderName("   "));
        assertFalse(PaymentValidator.validateCardholderName(null));
    }

    @Test void cardNumberMustBe16Digits() {
        assertTrue(PaymentValidator.validateCardNumber("1234567812345678"));
        assertFalse(PaymentValidator.validateCardNumber("123456781234567"));     // 15 digits
        assertFalse(PaymentValidator.validateCardNumber("12345678123456789"));   // 17 digits
        assertFalse(PaymentValidator.validateCardNumber("1234abcd12345678"));    // letters
    }

    @Test void expiryMustBeFutureAndWellFormed() {
        YearMonth next = YearMonth.now().plusMonths(1);
        String future = String.format("%02d/%02d", next.getMonthValue(), next.getYear() % 100);
        assertTrue(PaymentValidator.validateExpiry(future));
        assertFalse(PaymentValidator.validateExpiry("01/20"));   // past
        assertFalse(PaymentValidator.validateExpiry("13/40"));   // bad month
        assertFalse(PaymentValidator.validateExpiry("1/40"));    // bad format
    }

    @Test void cvvMustBe3Digits() {
        assertTrue(PaymentValidator.validateCVV("123"));
        assertFalse(PaymentValidator.validateCVV("1234"));
        assertFalse(PaymentValidator.validateCVV("12a"));
    }
}
