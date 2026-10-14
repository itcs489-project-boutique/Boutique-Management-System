package com.boutique.enums;

/**
 * Represents the lifecycle states of an order in the system.
 */
public enum OrderStatus {
    CART,
    PENDING,
    CONFIRMED,
    ASSIGNED,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    PAYMENT_FAILED
}