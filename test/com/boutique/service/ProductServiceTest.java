package com.boutique.service;

import com.boutique.enums.ProductCategory;
import com.boutique.model.Product;
import com.boutique.util.DataStore;
import com.boutique.util.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().reset();
        productService = new ProductService();
    }

    @Test
    void addProduct_validInput_returnsSuccess() {
        Result<Product> result = productService.addProduct(
                "Test Dress", ProductCategory.DRESS, "A test dress", 29.99, 10);
        assertTrue(result.isSuccess());
        assertNotNull(result.getValue());
        assertEquals("Test Dress", result.getValue().getName());
    }

    @Test
    void addProduct_emptyName_returnsFailure() {
        Result<Product> result = productService.addProduct(
                "", ProductCategory.DRESS, "desc", 10.0, 5);
        assertFalse(result.isSuccess());
    }

    @Test
    void addProduct_negativPrice_returnsFailure() {
        Result<Product> result = productService.addProduct(
                "Bag", ProductCategory.BAG, "desc", -5.0, 5);
        assertFalse(result.isSuccess());
    }

    @Test
    void addProduct_duplicateName_returnsFailure() {
        productService.addProduct("Shoe", ProductCategory.SHOES, "desc", 15.0, 3);
        Result<Product> result = productService.addProduct(
                "Shoe", ProductCategory.SHOES, "desc2", 20.0, 1);
        assertFalse(result.isSuccess());
    }

    @Test
    void getAllProducts_returnsOnlyActive() {
        productService.addProduct("Item1", ProductCategory.ACCESSORY, "", 5.0, 1);
        productService.addProduct("Item2", ProductCategory.DRESS, "", 10.0, 2);
        List<Product> products = productService.getAllProducts();
        assertEquals(2, products.size());
    }

    @Test
    void deleteProduct_deactivatesProduct() {
        Result<Product> added = productService.addProduct(
                "ToDelete", ProductCategory.BAG, "", 9.0, 1);
        String id = added.getValue().getProductId();
        Result<Void> deleteResult = productService.deleteProduct(id);
        assertTrue(deleteResult.isSuccess()); // confirm delete succeeded
        Optional<Product> found = productService.getProductById(id);
        assertTrue(found.isEmpty()); // confirm no longer visible as active
    }

    @Test
    void reactivateProduct_makesProductVisible() {
        Result<Product> added = productService.addProduct(
                "ToReactivate", ProductCategory.DRESS, "", 12.0, 2);
        String id = added.getValue().getProductId();
        productService.deleteProduct(id);
        productService.reactivateProduct(id);
        Optional<Product> found = productService.getProductById(id);
        assertTrue(found.isPresent());
    }

    @Test
    void updateProduct_changesName() {
        Result<Product> added = productService.addProduct(
                "OldName", ProductCategory.SHOES, "", 20.0, 5);
        String id = added.getValue().getProductId();
        Result<Product> updated = productService.updateProduct(
                id, "NewName", ProductCategory.SHOES, "", 20.0, 5);
        assertTrue(updated.isSuccess());
        assertEquals("NewName", updated.getValue().getName());
    }
}