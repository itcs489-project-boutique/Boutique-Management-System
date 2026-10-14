package com.boutique.model;

import com.boutique.enums.ProductCategory;
import java.time.LocalDateTime;

/**
 * Represents a product available in the boutique.
 */
public class Product {
    private String productId;
    private String name;
    private ProductCategory category;
    private String description;
    private double price;
    private int stockQuantity;
    private boolean isActive;
    private LocalDateTime createdAt;

    public Product(String productId, String name, ProductCategory category,
                   String description, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.isActive = true;
        this.createdAt = LocalDateTime.now();
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public ProductCategory getCategory() { return category; }
    public void setCategory(ProductCategory category) { this.category = category; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Product{id='" + productId + "', name='" + name + "', category=" + category
                + ", price=" + price + ", stock=" + stockQuantity + "}";
    }
}