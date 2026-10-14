package com.boutique.service;

import com.boutique.data.ProductDAO;
import com.boutique.model.Product;
import com.boutique.enums.ProductCategory;
import com.boutique.util.IdGenerator;
import com.boutique.util.Result;

import java.util.List;
import java.util.Optional;

/**
 * Business layer for product management.
 * Responsibilities: validation, ID generation, and delegation to ProductDAO.
 * All product rules live here — the DAO and UI layers contain none.
 */
public class ProductService {

    private final ProductDAO productDAO = new ProductDAO();

    /**
     * Adds a new product to the catalogue.
     * Validates: name not empty; price > 0; quantity >= 0; category not null.
     */
    public Result<Product> addProduct(String name, ProductCategory category,
                                      String desc, double price, int qty) {
        if (name == null || name.trim().isEmpty()) {
            return Result.failure("Product name cannot be empty.");
        }
        if (category == null) {
            return Result.failure("Product category is required.");
        }
        if (price <= 0) {
            return Result.failure("Price must be greater than zero.");
        }
        if (qty < 0) {
            return Result.failure("Stock quantity cannot be negative.");
        }

        String trimmedName = name.trim();
        boolean nameExists = productDAO.findAll().stream()
                .anyMatch(p -> p.getName().equalsIgnoreCase(trimmedName));
        if (nameExists) {
            return Result.failure("A product with this name already exists.");
        }

        String productId = IdGenerator.nextProductId();
        Product product = new Product(productId, trimmedName, category,
                                      desc == null ? "" : desc.trim(),
                                      price, qty);
        productDAO.save(product);
        return Result.success(product);
    }

    /**
     * Updates an existing product's details.
     * Preserves the product's current active/inactive status.
     */
    public Result<Product> updateProduct(String productId, String name, ProductCategory category,
                                         String desc, double price, int qty) {
        if (productId == null || productId.trim().isEmpty()) {
            return Result.failure("Product ID is required.");
        }
        Optional<Product> found = productDAO.findById(productId);
        if (found.isEmpty()) {
            return Result.failure("Product not found.");
        }
        if (name == null || name.trim().isEmpty()) {
            return Result.failure("Product name cannot be empty.");
        }
        if (category == null) {
            return Result.failure("Product category is required.");
        }
        if (price <= 0) {
            return Result.failure("Price must be greater than zero.");
        }
        if (qty < 0) {
            return Result.failure("Stock quantity cannot be negative.");
        }

        String trimmedName = name.trim();
        boolean nameConflict = productDAO.findAll().stream()
                .anyMatch(p -> p.getName().equalsIgnoreCase(trimmedName)
                        && !p.getProductId().equals(productId));
        if (nameConflict) {
            return Result.failure("Another product with this name already exists.");
        }

        Product updated = new Product(productId, trimmedName, category,
                                      desc == null ? "" : desc.trim(),
                                      price, qty);
        updated.setActive(found.get().isActive());

        productDAO.update(updated);
        return Result.success(updated);
    }

    /**
     * Soft-deletes a product (sets isActive = false).
     */
    public Result<Void> deleteProduct(String productId) {
        if (productId == null || productId.trim().isEmpty()) {
            return Result.failure("Product ID is required.");
        }
        if (productDAO.findById(productId).isEmpty()) {
            return Result.failure("Product not found.");
        }
        productDAO.deactivate(productId);
        return Result.success(null);
    }

    /**
     * Searches active products by any combination of name, category, and price range.
     * Pass null/empty name, null category, or 0/Double.MAX_VALUE for price to skip those filters.
     */
    public List<Product> searchProducts(String name, ProductCategory category,
                                        double minPrice, double maxPrice) {
        return productDAO.search(name, category, minPrice, maxPrice);
    }

    /** Returns all active products. */
    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }

    /** Finds a single active product by ID. */
    public Optional<Product> getProductById(String productId) {
        return productDAO.findById(productId);
    }

        /**
     * Reactivates a previously deactivated product.
     */
    public Result<Void> reactivateProduct(String productId) {
        if (productId == null || productId.trim().isEmpty()) {
            return Result.failure("Product ID is required.");
        }
        // findById only returns active products, so use DAO directly
        boolean found = productDAO.reactivate(productId);
        if (!found) {
            return Result.failure("Product not found.");
        }
        return Result.success(null);
    }

    /**
     * Permanently removes a product from the system.
     * TODO: Before deleting, verify no unfulfilled orders exist for this product.
     *       Block deletion if any orders are in status PENDING or IN_TRANSIT.
     *       This check should be added in Phase 5 integration (CP5.x) once
     *       OrderService is available.
     */
    public Result<Void> hardDeleteProduct(String productId) {
        if (productId == null || productId.trim().isEmpty()) {
            return Result.failure("Product ID is required.");
        }
        boolean removed = productDAO.hardDelete(productId);
        if (!removed) {
            return Result.failure("Product not found.");
        }
        return Result.success(null);
    }

        /** Returns all products including inactive ones. */
    public List<Product> getAllProductsIncludingInactive() {
        return productDAO.findAllIncludingInactive();
    }
}