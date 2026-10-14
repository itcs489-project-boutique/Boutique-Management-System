package com.boutique.model;

/**
 * Represents a single line item within an order.
 */
public class OrderItem {
    private String itemId;
    private String orderId;
    private String productId;
    private int quantity;
    private double unitPrice;

    public OrderItem(String itemId, String orderId, String productId,
                     int quantity, double unitPrice) {
        this.itemId = itemId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getItemId() { return itemId; }
    public String getOrderId() { return orderId; }
    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getSubtotal() { return quantity * unitPrice; }

    @Override
    public String toString() {
        return "OrderItem{productId='" + productId + "', qty=" + quantity
                + ", unitPrice=" + unitPrice + ", subtotal=" + getSubtotal() + "}";
    }
}