import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.reactivate("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.deleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer2 = customerDAO0.findByEmail("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList1 = orderService0.getConfirmedOrders();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (int) (short) 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.deactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (int) (short) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!", (int) '#');
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProducts();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAll();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("", "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList7 = customerService0.searchCustomers("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) (byte) 10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.cancelOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (int) (short) 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) 'a');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList6 = customerService0.getAllCustomers();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        orderItemDAO0.deleteByOrderId("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult12 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) '4');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.cancelOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.reactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer7 = customerService0.getCustomerById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (int) '#');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.cancelOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.cancelOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.markPaymentFailed("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderDAO0.findByCourierId("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult11 = customerService0.updateCustomer("hi!", "hi!", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderDAO0.findByCustomerId("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.cancelOrder("");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "", (int) (short) 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signIn("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional2 = productDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult12 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.confirmOrder("hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.initiateCheckout("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", (int) (byte) 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList8 = customerService0.getAllCustomers();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = orderService0.getOrderTotal("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional4 = orderService0.getOrderById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAll();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.cancelOrder("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.markPaymentFailed("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderItemDAO0.findByOrderId("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (int) (short) 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = customerService0.deactivateCustomer("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional3 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult13 = customerService0.updateCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.retryCheckout("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = orderService0.getOrderTotal("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.retryCheckout("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderDAO0.findByCustomerId("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer9 = customerService0.getCustomerById("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.initiateCheckout("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderService0.getOrderById("");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", (int) (short) 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional3 = productDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.confirmOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", 100);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.confirmOrder("");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList7 = customerService0.searchCustomers("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (int) (short) 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        orderItemDAO0.deleteByOrderId("hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional4 = orderService0.getOrderById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList6 = customerService0.getAllCustomers();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList11 = customerService0.getAllCustomers();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = orderService0.getOrderTotal("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderItemDAO0.findByOrderId("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional3 = userDAO0.findByUsername("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.cancelOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = orderService0.getOrderTotal("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.cancelOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional4 = orderService0.getOrderById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.markPaymentFailed("");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.deactivate("hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (int) (byte) 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.reactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.cancelOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAll();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) (byte) -1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.retryCheckout("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional4 = orderService0.getOrderById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList18 = customerService0.searchCustomers("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.cancelOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional4 = orderService0.getOrderById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.initiateCheckout("hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = orderService0.getOrderTotal("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList3 = orderService0.getConfirmedOrders();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.returnToCart("hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderItemDAO0.findByOrderId("");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.markPaymentFailed("hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.deactivate("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.hardDeleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.markPaymentFailed("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList6 = orderService0.getOrderItems("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList6 = orderService0.getOrdersByCustomer("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = orderService0.getOrderTotal("hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList6 = orderService0.getOrderItems("");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult9 = customerService0.deactivateCustomer("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (int) (byte) -1);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList5 = orderService0.getConfirmedOrders();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer12 = customerService0.getCustomerById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("hi!", "hi!", 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.createOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList6 = orderService0.getOrderItems("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (int) (byte) 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList17 = customerService0.getAllCustomers();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.initiateCheckout("");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult8 = orderService0.addItemToOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) (byte) -1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.retryCheckout("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.retryCheckout("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.markPaymentFailed("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional6 = orderService0.getOrderById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = orderService0.getOrderTotal("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAll();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.initiateCheckout("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult9 = customerService0.deactivateCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult27 = customerService0.updateCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.createOrder("hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.markPaymentFailed("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.retryCheckout("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.confirmOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.markPaymentFailed("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional6 = orderService0.getOrderById("");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult15 = customerService0.addCustomer("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult17 = customerService0.deactivateCustomer("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer23 = customerService0.getCustomerById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult8 = orderService0.addItemToOrder("hi!", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (int) (byte) 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.markPaymentFailed("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult9 = customerService0.deactivateCustomer("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = orderService0.getOrderTotal("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer7 = customerService0.getCustomerById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList22 = customerService0.getAllCustomers();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult6 = orderService0.addItemToOrder("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (int) (byte) 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.confirmOrder("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.cancelOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.initiateCheckout("hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.initiateCheckout("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (int) (byte) 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderService0.getOrderItems("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.initiateCheckout("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult7 = orderService0.setDeliveryAddress("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (int) (short) 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional3 = userDAO0.findByUsername("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.confirmOrder("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.returnToCart("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult7 = orderService0.setDeliveryAddress("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (int) (byte) 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult11 = customerService0.updateCustomer("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult4 = orderService0.addItemToOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.cancelOrder("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult16 = authService0.signIn("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult6 = customerService0.updateCustomer("", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList7 = customerService0.getAllCustomers();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.confirmOrder("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult8 = orderService0.addItemToOrder("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "hi!", (int) '4');
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = productDAO0.hardDelete("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult26 = customerService0.addCustomer("", "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Customer> customerResult32 = customerService0.updateCustomer("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList6 = orderService0.getOrderItems("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList12 = customerService0.searchCustomers("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.returnToCart("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList2 = orderService0.getOrdersByCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult7 = orderService0.setDeliveryAddress("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Order> orderOptional6 = orderService0.getOrderById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult26 = customerService0.addCustomer("", "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer28 = customerService0.getCustomerById("");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult3 = orderService0.setDeliveryAddress("", "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderService0.getOrderItems("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.returnToCart("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = orderService0.getOrderTotal("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.returnToCart("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.retryCheckout("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        orderItemDAO0.deleteByOrderId("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult5 = orderService0.setDeliveryAddress("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.model.Customer customer2 = customerDAO0.findByEmail("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult10 = authService0.changePassword("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Customer> customerList22 = customerService0.getAllCustomers();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.markPaymentFailed("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.markPaymentFailed("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult8 = orderService0.addItemToOrder("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Order> orderList4 = orderService0.getOrdersByCustomer("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.createOrder("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.OrderItem> orderItemResult8 = orderService0.addItemToOrder("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "", 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.Order> orderResult6 = orderService0.initiateCheckout("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }
}

