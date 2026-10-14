package com.boutique.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Generates unique IDs for each entity type in the system.
 * Uses a simple incrementing counter prefixed by entity type.
 */
public class IdGenerator {
    private static final AtomicInteger userCounter     = new AtomicInteger(1);
    private static final AtomicInteger productCounter  = new AtomicInteger(1);
    private static final AtomicInteger customerCounter = new AtomicInteger(1);
    private static final AtomicInteger orderCounter    = new AtomicInteger(1);
    private static final AtomicInteger itemCounter     = new AtomicInteger(1);

    private IdGenerator() {}

    public static String nextUserId()     { return String.format("USR-%04d", userCounter.getAndIncrement()); }
    public static String nextProductId()  { return String.format("PRD-%04d", productCounter.getAndIncrement()); }
    public static String nextCustomerId() { return String.format("CST-%04d", customerCounter.getAndIncrement()); }
    public static String nextOrderId()    { return String.format("ORD-%04d", orderCounter.getAndIncrement()); }
    public static String nextItemId()     { return String.format("ITM-%04d", itemCounter.getAndIncrement()); }
}