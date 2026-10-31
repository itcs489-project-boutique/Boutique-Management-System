package com.boutique.service;

import com.boutique.data.*;
import com.boutique.enums.ProductCategory;
import com.boutique.util.DataStore;
import com.boutique.enums.OrderStatus;
import com.boutique.model.*;
import com.boutique.util.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for OrderService (FR3.1-FR3.6, FR4.1-FR4.2, FR5.2).
 * Only the two seed helpers at the bottom touch Product/Customer constructors:
 * adjust them if your teammates' classes differ.
 */
class OrderServiceTest {
    private OrderService service;
    private String customerId;
    private String dressId;
    private String bagId;

    @BeforeEach
    void setUp() {
        DataStore ds = DataStore.getInstance();
        ds.getOrders().clear(); ds.getOrderItems().clear(); ds.getProducts().clear(); ds.getCustomers().clear();
        service = new OrderService();
        customerId = seedCustomer("C1", true);
        dressId = seedProduct("P1", 50.0, 5);
        bagId = seedProduct("P2", 20.0, 2);
    }

    // ---- FR3.1 create order
    @Test void createOrderStartsInCart() {
        Result<Order> r = service.createOrder(customerId);
        assertTrue(r.isSuccess());
        assertEquals(OrderStatus.CART, r.getValue().getStatus());
    }

    @Test void createOrderRejectsUnknownCustomer() {
        assertFalse(service.createOrder("nope").isSuccess());
    }

    @Test void createOrderRejectsInactiveCustomer() {
        String inactive = seedCustomer("C2", false);
        assertFalse(service.createOrder(inactive).isSuccess());
    }

    @Test void createOrderRejectsBlankCustomerId() {
        assertFalse(service.createOrder("  ").isSuccess());
    }

    // ---- FR3.2 / FR3.3 add items + total
    @Test void addItemsAndCalculateTotal() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertTrue(service.addItemToOrder(oid, dressId, 2).isSuccess());   // 100
        assertTrue(service.addItemToOrder(oid, bagId, 1).isSuccess());     // 20
        assertEquals(2, service.getOrderItems(oid).size());
        assertEquals(120.0, service.getOrderTotal(oid), 0.001);
    }

    @Test void emptyOrderTotalIsZero() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertEquals(0.0, service.getOrderTotal(oid), 0.001);
    }

    @Test void addingSameProductTwiceSumsQuantity() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        service.addItemToOrder(oid, dressId, 1);
        service.addItemToOrder(oid, dressId, 2);
        assertEquals(1, service.getOrderItems(oid).size());
        assertEquals(3, service.getOrderItems(oid).get(0).getQuantity());
    }

    @Test void quantityAboveStockIsRejected() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertFalse(service.addItemToOrder(oid, bagId, 3).isSuccess());   // stock is 2
        assertEquals(0, service.getOrderItems(oid).size());
    }

    @Test void zeroOrNegativeQuantityIsRejected() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertFalse(service.addItemToOrder(oid, dressId, 0).isSuccess());
        assertFalse(service.addItemToOrder(oid, dressId, -1).isSuccess());
    }

    @Test void unitPriceIsSnapshotted() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        service.addItemToOrder(oid, dressId, 1);
        assertEquals(50.0, service.getOrderItems(oid).get(0).getUnitPrice(), 0.001);
    }

    @Test void addItemRejectedOutsideCart() {
        String oid = readyPendingOrder();
        assertFalse(service.addItemToOrder(oid, bagId, 1).isSuccess());
    }

    @Test void addItemRejectsInactiveProduct() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        new ProductDAO().deactivate(bagId);
        assertFalse(service.addItemToOrder(oid, bagId, 1).isSuccess());
    }

    // ---- FR4.1 / FR4.2 checkout
    @Test void checkoutNeedsItems() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertFalse(service.initiateCheckout(oid).isSuccess());
    }

    @Test void checkoutMovesToPendingAndStoresAddress() {
        String oid = readyPendingOrder();
        assertEquals(OrderStatus.PENDING, service.getOrderById(oid).get().getStatus());
        assertEquals("Street 1, Manama", service.getOrderById(oid).get().getDeliveryAddress());
    }

    @Test void emptyAddressIsRejected() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        service.addItemToOrder(oid, dressId, 1);
        service.initiateCheckout(oid);
        assertFalse(service.setDeliveryAddress(oid, "  ").isSuccess());
    }

    @Test void backFromCheckoutReturnsOrderToCart() {
        String oid = readyPendingOrder();
        assertTrue(service.returnToCart(oid).isSuccess());
        assertEquals(OrderStatus.CART, service.getOrderById(oid).get().getStatus());
        assertTrue(service.addItemToOrder(oid, bagId, 1).isSuccess());
    }

    // ---- FR3.4 confirm
    @Test void confirmDeductsStockAndRecordsTransaction() {
        String oid = readyPendingOrder();                         // 2 dresses
        Result<Order> r = service.confirmOrder(oid);
        assertTrue(r.isSuccess());
        assertEquals(OrderStatus.CONFIRMED, r.getValue().getStatus());
        assertNotNull(r.getValue().getTransactionDate());
        assertEquals(3, new ProductDAO().findById(dressId).get().getStockQuantity());
    }

    @Test void confirmFailsWithoutAddress() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        service.addItemToOrder(oid, dressId, 1);
        service.initiateCheckout(oid);
        assertFalse(service.confirmOrder(oid).isSuccess());
    }

    @Test void cartOrderCannotBeConfirmed() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertFalse(service.confirmOrder(oid).isSuccess());
    }

    @Test void confirmFailsWhenStockRanOutAndDeductsNothing() {
        String oid = readyPendingOrder();                         // 2 dresses
        new ProductDAO().findById(dressId).get().setStockQuantity(1);
        assertFalse(service.confirmOrder(oid).isSuccess());
        assertEquals(OrderStatus.PENDING, service.getOrderById(oid).get().getStatus());
        assertEquals(1, new ProductDAO().findById(dressId).get().getStockQuantity());
    }

    // ---- declined payment flow
    @Test void declinedPaymentCanBeRetried() {
        String oid = readyPendingOrder();
        assertTrue(service.markPaymentFailed(oid).isSuccess());
        assertEquals(OrderStatus.PAYMENT_FAILED, service.getOrderById(oid).get().getStatus());
        assertTrue(service.retryCheckout(oid).isSuccess());
        assertEquals(OrderStatus.PENDING, service.getOrderById(oid).get().getStatus());
    }

    @Test void markPaymentFailedRequiresPending() {
        String oid = service.createOrder(customerId).getValue().getOrderId();   // CART
        assertFalse(service.markPaymentFailed(oid).isSuccess());
    }

    // ---- FR3.6 cancel
    @Test void cancelConfirmedOrderRestoresStock() {
        String oid = readyPendingOrder();
        service.confirmOrder(oid);
        assertTrue(service.cancelOrder(oid).isSuccess());
        assertEquals(OrderStatus.CANCELLED, service.getOrderById(oid).get().getStatus());
        assertEquals(5, new ProductDAO().findById(dressId).get().getStockQuantity());
    }

    @Test void cancelPendingOrderDoesNotTouchStock() {
        String oid = readyPendingOrder();
        assertTrue(service.cancelOrder(oid).isSuccess());
        assertEquals(5, new ProductDAO().findById(dressId).get().getStockQuantity());
    }

    @Test void shippedOrderCannotBeCancelled() {
        String oid = readyPendingOrder();
        service.confirmOrder(oid);
        service.getOrderById(oid).get().setStatus(OrderStatus.SHIPPED);
        assertFalse(service.cancelOrder(oid).isSuccess());
    }

    @Test void cartOrderCannotBeCancelled() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        assertFalse(service.cancelOrder(oid).isSuccess());
    }

    // ---- customer orders
    @Test void getOrdersByCustomerReturnsOnlyThatCustomersOrders() {
        String other = seedCustomer("C3", true);
        service.createOrder(customerId);
        service.createOrder(other);
        assertEquals(1, service.getOrdersByCustomer(customerId).size());
    }

    // ---- FR5.2 queue
    @Test void confirmedQueueIsOldestFirstAndOnlyConfirmed() throws Exception {
        String first = readyPendingOrder();
        service.confirmOrder(first);
        Thread.sleep(5);                                          // make sure dates differ
        String second = readyPendingOrder();
        service.confirmOrder(second);
        String cartOnly = service.createOrder(customerId).getValue().getOrderId();   // stays CART

        var queue = service.getConfirmedOrders();
        assertEquals(2, queue.size());
        assertEquals(first, queue.get(0).getOrderId());
        assertFalse(queue.stream().anyMatch(o -> o.getOrderId().equals(cartOnly)));
    }

    // ---- helpers ----
    private String readyPendingOrder() {
        String oid = service.createOrder(customerId).getValue().getOrderId();
        service.addItemToOrder(oid, dressId, 2);
        service.initiateCheckout(oid);
        service.setDeliveryAddress(oid, "Street 1, Manama");
        return oid;
    }

    /** Adjust to your teammate's Customer constructor if needed. */
    private String seedCustomer(String id, boolean active) {
        Customer c = new Customer(id, "Customer " + id, id + "@mail.com", "12345678", "Some address");
        c.setActive(active);
        new CustomerDAO().save(c);
        return id;
    }

    /** Adjust to your teammate's Product constructor if needed. */
    private String seedProduct(String id, double price, int stock) {
        new ProductDAO().save(new Product(id, "Item " + id, ProductCategory.DRESS, "desc", price, stock));
        return id;
    }
}