package com.boutique.service;

import com.boutique.data.CustomerDAO;
import com.boutique.data.OrderDAO;
import com.boutique.data.OrderItemDAO;
import com.boutique.data.ProductDAO;
import com.boutique.enums.OrderStatus;
import com.boutique.model.Customer;
import com.boutique.model.Order;
import com.boutique.model.OrderItem;
import com.boutique.model.Product;
import com.boutique.util.IdGenerator;
import com.boutique.util.Result;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Business layer for "Manage Sales / Orders" (FR3) and the order side of checkout (FR4).
 * Responsibilities: order lifecycle CART -> PENDING -> CONFIRMED (or PAYMENT_FAILED / CANCELLED),
 * item validation, total calculation, stock deduction and restoration.
 * Dependencies: OrderDAO, OrderItemDAO, ProductDAO, CustomerDAO (never DataStore directly).
 * Returns Result objects instead of throwing, so the UI can show messages cleanly.
 */
public class OrderService {
    private final OrderDAO orderDAO;
    private final OrderItemDAO itemDAO;
    private final ProductDAO productDAO;
    private final CustomerDAO customerDAO;

    /** Default wiring used by the application. */
    public OrderService() {
        this(new OrderDAO(), new OrderItemDAO(), new ProductDAO(), new CustomerDAO());
    }

    /** Constructor with injected DAOs. */
    public OrderService(OrderDAO o, OrderItemDAO i, ProductDAO p, CustomerDAO c) {
        this.orderDAO = o; this.itemDAO = i; this.productDAO = p; this.customerDAO = c;
    }

    /** FR3.1: creates an empty order (status CART) for an existing, active customer. */
    public Result<Order> createOrder(String customerId) {
        if (customerId == null || customerId.isBlank()) return Result.failure("Customer is required");
        Customer customer = customerDAO.findById(customerId);   // null when not found
        if (customer == null) return Result.failure("Customer not found");
        if (!customer.isActive()) return Result.failure("Customer is not active");
        Order order = new Order(IdGenerator.nextOrderId(), customerId, null); // constructor sets status CART and the date
        orderDAO.save(order);
        return Result.success(order);
    }

    /**
     * FR3.2: adds a product to a CART order. If the product is already in the order the
     * quantities are summed. The unit price is snapshotted from the product.
     */
    public Result<OrderItem> addItemToOrder(String orderId, String productId, int qty) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        if (o.get().getStatus() != OrderStatus.CART) return Result.failure("Items can only be added while the order is in CART");
        if (qty <= 0) return Result.failure("Quantity must be greater than zero");
        Optional<Product> p = productDAO.findById(productId);
        if (p.isEmpty() || !p.get().isActive()) return Result.failure("Product not found or inactive");

        OrderItem existing = itemDAO.findByOrderId(orderId).stream()
                .filter(i -> i.getProductId().equals(productId)).findFirst().orElse(null);
        int newQty = qty + (existing == null ? 0 : existing.getQuantity());
        if (newQty > p.get().getStockQuantity())
            return Result.failure("Insufficient stock (available: " + p.get().getStockQuantity() + ")");

        if (existing != null) {
            existing.setQuantity(newQty);
            itemDAO.update(existing);
            return Result.success(existing);
        }
        OrderItem item = new OrderItem(IdGenerator.nextItemId(), orderId, productId, qty, p.get().getPrice());
        itemDAO.save(item);
        return Result.success(item);
    }

    /** FR3.3: total = sum of (unitPrice x quantity) over all lines; 0 for an empty order. */
    public double getOrderTotal(String orderId) {
        return itemDAO.findByOrderId(orderId).stream().mapToDouble(OrderItem::getSubtotal).sum();
    }

    /** @return the lines of an order */
    public List<OrderItem> getOrderItems(String orderId) { return itemDAO.findByOrderId(orderId); }

    /** FR3.5: @return the order with this id, or empty */
    public Optional<Order> getOrderById(String orderId) { return orderDAO.findById(orderId); }

    /** FR4.1: moves a CART order that has at least one item to PENDING. */
    public Result<Order> initiateCheckout(String orderId) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        if (o.get().getStatus() != OrderStatus.CART) return Result.failure("Order is not in CART");
        if (itemDAO.findByOrderId(orderId).isEmpty()) return Result.failure("Order has no items");
        o.get().setStatus(OrderStatus.PENDING);
        orderDAO.update(o.get());
        return Result.success(o.get());
    }

    /** FR4.2: stores the delivery address on the order (not on the customer profile). */
    public Result<Order> setDeliveryAddress(String orderId, String address) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        if (o.get().getStatus() != OrderStatus.PENDING) return Result.failure("Order is not in checkout");
        if (address == null || address.isBlank()) return Result.failure("Address is required");
        o.get().setDeliveryAddress(address.trim());
        orderDAO.update(o.get());
        return Result.success(o.get());
    }

    /** FR4.1: customer goes back from checkout to edit the cart, PENDING returns to CART. */
    public Result<Order> returnToCart(String orderId) {
        return transition(orderId, OrderStatus.PENDING, OrderStatus.CART);
    }

    /** FR4.5: a declined payment moves a PENDING order to PAYMENT_FAILED. */
    public Result<Order> markPaymentFailed(String orderId) {
        return transition(orderId, OrderStatus.PENDING, OrderStatus.PAYMENT_FAILED);
    }

    /** FR4.5: retry after a decline, PAYMENT_FAILED goes back to PENDING. */
    public Result<Order> retryCheckout(String orderId) {
        return transition(orderId, OrderStatus.PAYMENT_FAILED, OrderStatus.PENDING);
    }

    /**
     * FR3.4: records the transaction after an approved payment.
     * PENDING -> CONFIRMED, sets transactionDate and deducts stock for every line.
     * Stock is re-checked first so nothing is deducted if one product ran out.
     */
    public Result<Order> confirmOrder(String orderId) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        Order order = o.get();
        if (order.getStatus() != OrderStatus.PENDING) return Result.failure("Only PENDING orders can be confirmed");
        if (order.getDeliveryAddress() == null || order.getDeliveryAddress().isBlank())
            return Result.failure("Delivery address is missing");

        List<OrderItem> items = itemDAO.findByOrderId(orderId);
        for (OrderItem i : items) {
            Optional<Product> p = productDAO.findById(i.getProductId());
            if (p.isEmpty() || p.get().getStockQuantity() < i.getQuantity())
                return Result.failure("Not enough stock for product " + i.getProductId());
        }
        for (OrderItem i : items) {
            Product p = productDAO.findById(i.getProductId()).get();
            p.setStockQuantity(p.getStockQuantity() - i.getQuantity());
            productDAO.update(p);
        }
        order.setStatus(OrderStatus.CONFIRMED);
        order.setTransactionDate(LocalDateTime.now());
        orderDAO.update(order);
        return Result.success(order);
    }

    /**
     * FR3.6: cancels a PENDING or CONFIRMED order. Stock is restored only if it was
     * already deducted (CONFIRMED). SHIPPED/DELIVERED orders cannot be cancelled.
     */
    public Result<Order> cancelOrder(String orderId) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        Order order = o.get();
        if (order.getStatus() != OrderStatus.PENDING && order.getStatus() != OrderStatus.CONFIRMED)
            return Result.failure("Only PENDING or CONFIRMED orders can be cancelled");
        if (order.getStatus() == OrderStatus.CONFIRMED) {
            for (OrderItem i : itemDAO.findByOrderId(orderId)) {
                productDAO.findById(i.getProductId()).ifPresent(p -> {
                    p.setStockQuantity(p.getStockQuantity() + i.getQuantity());
                    productDAO.update(p);
                });
            }
        }
        order.setStatus(OrderStatus.CANCELLED);
        orderDAO.update(order);
        return Result.success(order);
    }

    /** @return all orders of a customer (used by tracking and the customer module) */
    public List<Order> getOrdersByCustomer(String customerId) { return orderDAO.findByCustomerId(customerId); }

    /** FR5.2: CONFIRMED orders with no courier yet, oldest first. */
    public List<Order> getConfirmedOrders() {
        return orderDAO.findByStatus(OrderStatus.CONFIRMED).stream()
                .filter(x -> x.getAssignedCourierId() == null)
                .sorted(Comparator.comparing(Order::getOrderDate))
                .collect(Collectors.toList());
    }

    /** Shared helper: moves an order from one required status to another. */
    private Result<Order> transition(String orderId, OrderStatus from, OrderStatus to) {
        Optional<Order> o = orderDAO.findById(orderId);
        if (o.isEmpty()) return Result.failure("Order not found");
        if (o.get().getStatus() != from) return Result.failure("Order must be " + from + " but is " + o.get().getStatus());
        o.get().setStatus(to);
        orderDAO.update(o.get());
        return Result.success(o.get());
    }
}
