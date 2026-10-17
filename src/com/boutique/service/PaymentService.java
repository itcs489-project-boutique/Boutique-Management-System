package com.boutique.service;

/**
 * Business layer: simulates the bank that approves or declines a payment (FR4.4).
 * Rule (deterministic for testing): card numbers ending in 0000 are DECLINED,
 * every other card is APPROVED. A delay imitates the bank's response time.
 */
public class PaymentService {

    /** Outcome of a simulated payment. */
    public enum PaymentResult { APPROVED, DECLINED }

    private final long delayMillis;

    /** Standard service with the 3.5 second delay required by the project. */
    public PaymentService() { this(3500); }

    /** Service with a custom delay (tests use 0). */
    public PaymentService(long delayMillis) { this.delayMillis = delayMillis; }

    /**
     * Simulates the bank. Blocks the calling thread, so call it from a SwingWorker.
     * @param cardNumber the 16-digit card number
     * @return APPROVED, or DECLINED when the number ends in 0000
     */
    public PaymentResult process(String cardNumber) {
        try {
            Thread.sleep(delayMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return (cardNumber != null && cardNumber.endsWith("0000"))
                ? PaymentResult.DECLINED : PaymentResult.APPROVED;
    }
}
