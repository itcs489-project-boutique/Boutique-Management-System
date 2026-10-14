package com.boutique.data;

import com.boutique.enums.ProductCategory;
import com.boutique.model.Product;
import com.boutique.util.DataStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Data Access Object (DAO) layer for Product entities.
 * Responsibilities: raw CRUD operations against the DataStore's product list.
 *                   No business logic — no validation, no price checks, no role checks.
 * Dependencies: DataStore (singleton), Product (model)
 */
public class ProductDAO {

    private final DataStore store = DataStore.getInstance();

    /**
     * Saves a new Product to the DataStore.
     * Does not check for duplicates — that is the Service layer's responsibility.
     * @param product The Product to save (must already have productId set)
     */
    public void save(Product product) {
        store.getProducts().add(product);
    }

    /**
     * Finds an active or inactive Product by its unique productId.
     * @param productId The productId to search for (e.g. "PRD-0001")
     * @return An Optional containing the Product if found, or empty if not
     */
    public Optional<Product> findById(String productId) {
        return store.getProducts().stream()
            .filter(p -> p.getProductId().equals(productId))
            .findFirst();
    }

    /**
     * Returns all active products (isActive = true).
     * Used for display in the product table and for order item selection.
     * @return A new List containing all active Product objects
     */
    public List<Product> findAll() {
        return store.getProducts().stream()
            .filter(Product::isActive)
            .collect(Collectors.toList());
    }

    /**
     * Returns all products including inactive (soft-deleted) ones.
     * Used by admin views that need to see the full catalogue.
     * @return A new List containing all Product objects regardless of status
     */
    public List<Product> findAllIncludingInactive() {
        return new ArrayList<>(store.getProducts());
    }

    /**
     * Searches active products by name (partial, case-insensitive),
     * category, and price range. Any parameter can be null/0 to skip that filter.
     * @param name     Partial name to match (null or blank = match all)
     * @param category Category to filter by (null = match all)
     * @param minPrice Minimum price inclusive (0 = no lower bound)
     * @param maxPrice Maximum price inclusive (0 = no upper bound)
     * @return A List of matching active products
     */
    public List<Product> search(String name, ProductCategory category,
                                double minPrice, double maxPrice) {
        return store.getProducts().stream()
            .filter(Product::isActive)
            .filter(p -> name == null || name.isBlank()
                || p.getName().toLowerCase().contains(name.toLowerCase()))
            .filter(p -> category == null || p.getCategory() == category)
            .filter(p -> minPrice <= 0 || p.getPrice() >= minPrice)
            .filter(p -> maxPrice <= 0 || p.getPrice() <= maxPrice)
            .collect(Collectors.toList());
    }

    /**
     * Replaces an existing Product in the DataStore with the updated version.
     * Matches by productId.
     * @param updatedProduct The Product with new field values
     * @return true if a matching product was found and replaced; false otherwise
     */
    public boolean update(Product updatedProduct) {
        List<Product> products = store.getProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(updatedProduct.getProductId())) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    /**
     * Soft-deletes a product by setting its isActive flag to false.
     * The product remains in the DataStore so past order items still reference it.
     * @param productId The productId to deactivate
     * @return true if the product was found and deactivated; false if not found
     */
    public boolean deactivate(String productId) {
        Optional<Product> found = findById(productId);
        if (found.isPresent()) {
            found.get().setActive(false);
            return true;
        }
        return false;
    }

        /**
     * Reactivates a soft-deleted product (sets isActive = true).
     * @return true if the product was found and reactivated
     */
    public boolean reactivate(String productId) {
        List<Product> products = DataStore.getInstance().getProducts();
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                p.setActive(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Permanently removes a product from the DataStore.
     * Caller is responsible for checking order constraints before calling this.
     * @return true if the product was found and removed
     */
    public boolean hardDelete(String productId) {
        return DataStore.getInstance().getProducts()
                .removeIf(p -> p.getProductId().equals(productId));
    }
    
}