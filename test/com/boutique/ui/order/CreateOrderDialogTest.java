package com.boutique.ui.order;

import com.boutique.data.CustomerDAO;
import com.boutique.data.ProductDAO;
import com.boutique.enums.ProductCategory;
import com.boutique.model.Customer;
import com.boutique.model.Product;
import com.boutique.util.DataStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.GraphicsEnvironment;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import static com.boutique.ui.SwingTestUtils.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

/** JUnit tests for CreateOrderDialog: initial screen, loaded customers/products, buttons. */
public class CreateOrderDialogTest {

    @BeforeEach
    void setUp() {
        assumeFalse(GraphicsEnvironment.isHeadless(), "JDialog needs a display");
        DataStore ds = DataStore.getInstance();
        ds.getOrders().clear(); ds.getOrderItems().clear(); ds.getProducts().clear(); ds.getCustomers().clear();
        new CustomerDAO().save(new Customer("C1", "Sara Hasan", "sara@test.com", "33333333", "Manama"));
        Customer inactive = new Customer("C2", "Old Customer", "old@test.com", "34444444", "Manama");
        inactive.setActive(false);
        new CustomerDAO().save(inactive);
        new ProductDAO().save(new Product("P1", "Silk Dress", ProductCategory.DRESS, "d", 50.0, 5));
        new ProductDAO().save(new Product("P2", "Leather Bag", ProductCategory.BAG, "d", 20.0, 2));
    }

    private void withDialog(Consumer<CreateOrderDialog> test) throws Exception {
        AtomicReference<Throwable> error = new AtomicReference<>();
        SwingUtilities.invokeAndWait(() -> {
            CreateOrderDialog d = null;
            try {
                d = new CreateOrderDialog(null);
                test.accept(d);
            } catch (Throwable t) {
                error.set(t);
            } finally {
                if (d != null) d.dispose();
            }
        });
        if (error.get() != null) throw new AssertionError("Dialog test failed", error.get());
    }

    @Test void dialogHasExpectedTitleModalAndSize() throws Exception {
        withDialog(d -> {
            assertEquals("Create Order", d.getTitle());
            assertTrue(d.isModal());
            assertEquals(820, d.getWidth());
            assertEquals(520, d.getHeight());
        });
    }

    @Test void customerBoxListsOnlyActiveCustomers() throws Exception {
        withDialog(d -> assertEquals(1, findAll(d, JComboBox.class).get(0).getItemCount()));
    }

    @Test void productTableListsActiveProducts() throws Exception {
        withDialog(d -> assertEquals(2, findAll(d, JTable.class).get(0).getRowCount()));
    }

    @Test void cartStartsEmptyWithZeroTotal() throws Exception {
        withDialog(d -> {
            assertEquals(0, findAll(d, JTable.class).get(1).getRowCount());
            assertTrue(hasLabel(d, "Total: 0.000"));
        });
    }

    @Test void dialogContainsMainButtons() throws Exception {
        withDialog(d -> {
            assertNotNull(button(d, "Find"));
            assertNotNull(button(d, "Search"));
            assertNotNull(button(d, "Add to Order"));
            assertNotNull(button(d, "Checkout"));
        });
    }
}