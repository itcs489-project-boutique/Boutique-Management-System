package com.boutique.service;

import com.boutique.service.PaymentService.PaymentResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** JUnit tests for the simulated bank (FR4.4). Delay is 0 so tests run instantly. */
class PaymentServiceTest {
    private final PaymentService service = new PaymentService(0);

    @Test void cardEndingIn0000IsDeclined() {
        assertEquals(PaymentResult.DECLINED, service.process("1234567812340000"));
    }

    @Test void otherCardsAreApproved() {
        assertEquals(PaymentResult.APPROVED, service.process("1234567812345678"));
    }
}
