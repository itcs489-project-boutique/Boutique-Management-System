package com.boutique.model;

import com.boutique.enums.OrderStatus;
import java.time.LocalDateTime;

/**
 * Represents a customer order in the boutique system.
 */
public class Order {
    private String orderId;
    private String customerId;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private String deliveryAddress;
    private LocalDateTime transactionDate;
    private String assignedCourierId;
    private String proofImagePath;

    public Order(String orderId, String customerId, String deliveryAddress) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.deliveryAddress = deliveryAddress;
        this.orderDate = LocalDateTime.now();
        this.status = OrderStatus.CART;
    }

    public String getOrderId() { return orderId; }
    public String getCustomerId() { return customerId; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }
    public LocalDateTime getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }
    public String getAssignedCourierId() { return assignedCourierId; }
    public void setAssignedCourierId(String assignedCourierId) { this.assignedCourierId = assignedCourierId; }
    public String getProofImagePath() { return proofImagePath; }
    public void setProofImagePath(String proofImagePath) { this.proofImagePath = proofImagePath; }

    @Override
    public String toString() {
        return "Order{id='" + orderId + "', customerId='" + customerId + "', status=" + status + "}";
    }
}