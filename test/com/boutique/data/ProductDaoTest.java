package com.boutique.data;

import com.boutique.enums.ProductCategory;

import com.boutique.model.Product;

import com.boutique.util.DataStore;

import com.boutique.util.IdGenerator;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDAOTest {

    private ProductDAO productDAO;

    private Product testProduct;

    @BeforeEach

    void setUp() {

        DataStore.getInstance().reset();

        productDAO = new ProductDAO();

        // Manually add a product since seedData() only seeds users

        testProduct = new Product(IdGenerator.nextProductId(), "Test Dress",

                ProductCategory.DRESS, "A nice dress", 49.99, 10);

        productDAO.save(testProduct);

    }

    @Test

    void save_addsProductToStore() {

        Optional<Product> found = productDAO.findById(testProduct.getProductId());

        assertTrue(found.isPresent());

    }

    @Test

    void findById_existingProduct_returnsProduct() {

        Optional<Product> found = productDAO.findById(testProduct.getProductId());

        assertTrue(found.isPresent());

        assertEquals(testProduct.getProductId(), found.get().getProductId());

    }

    @Test

    void findById_nonExistentId_returnsEmpty() {

        Optional<Product> found = productDAO.findById("PRD-9999");

        assertTrue(found.isEmpty());

    }

    @Test

    void findAll_returnsOnlyActiveProducts() {

        List<Product> all = productDAO.findAll();

        assertFalse(all.isEmpty());

        assertTrue(all.stream().allMatch(Product::isActive));

    }

    @Test

    void findAllIncludingInactive_returnsAll() {

        productDAO.deactivate(testProduct.getProductId());

        List<Product> including = productDAO.findAllIncludingInactive();

        assertFalse(including.isEmpty());

        assertTrue(including.stream().anyMatch(p -> !p.isActive()));

    }

    @Test

    void deactivate_setsProductInactive() {

        boolean result = productDAO.deactivate(testProduct.getProductId());

        assertTrue(result);

        Optional<Product> found = productDAO.findAllIncludingInactive()

                .stream().filter(p -> p.getProductId().equals(testProduct.getProductId())).findFirst();

        assertTrue(found.isPresent());

        assertFalse(found.get().isActive());

    }

    @Test

    void reactivate_setsProductActive() {

        productDAO.deactivate(testProduct.getProductId());

        boolean result = productDAO.reactivate(testProduct.getProductId());

        assertTrue(result);

        Optional<Product> found = productDAO.findById(testProduct.getProductId());

        assertTrue(found.isPresent());

        assertTrue(found.get().isActive());

    }

    @Test

    void hardDelete_removesProductPermanently() {

        boolean result = productDAO.hardDelete(testProduct.getProductId());

        assertTrue(result);

        Optional<Product> found = productDAO.findAllIncludingInactive()

                .stream().filter(p -> p.getProductId().equals(testProduct.getProductId())).findFirst();

        assertTrue(found.isEmpty());

    }

    @Test

    void update_changesProductFields() {

        testProduct.setPrice(999.99);

        productDAO.update(testProduct);

        Optional<Product> found = productDAO.findById(testProduct.getProductId());

        assertEquals(999.99, found.get().getPrice(), 0.001);

    }

}
