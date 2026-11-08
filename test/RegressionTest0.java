import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2" + "'", str1, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        boolean boolean2 = productDAO0.reactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.hardDeleteProduct("hi!");
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc" + "'", str1, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderItemDAO0.findByOrderId("hi!");
        orderItemDAO0.deleteByOrderId("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(orderItemList2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.Optional<com.boutique.model.Product> productOptional2 = productDAO0.findById("");
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAll();
        org.junit.Assert.assertNotNull(productOptional2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.enums.ProductCategory productCategory2 = null;
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.search("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory2, (double) (-1.0f), (double) 10L);
        com.boutique.model.Product product6 = null;
        productDAO0.save(product6);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory10, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.updateProduct("hi!", "hi!", productCategory10, "hi!", 10.0d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.User> userResult6 = authService0.signIn("", "hi!");
        org.junit.Assert.assertNotNull(userResult3);
        org.junit.Assert.assertNotNull(userResult6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        java.util.List<com.boutique.model.OrderItem> orderItemList2 = orderItemDAO0.findByOrderId("hi!");
        com.boutique.model.OrderItem orderItem3 = null;
        boolean boolean4 = orderItemDAO0.update(orderItem3);
        org.junit.Assert.assertNotNull(orderItemList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Order> orderList4 = orderDAO0.findByCourierId("hi!");
        com.boutique.model.Order order5 = null;
        boolean boolean6 = orderDAO0.update(order5);
        org.junit.Assert.assertNotNull(orderOptional2);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(voidResult7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(userOptional2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Order> orderList4 = orderDAO0.findByCourierId("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.model.Order order5 = null;
        boolean boolean6 = orderDAO0.update(order5);
        org.junit.Assert.assertNotNull(orderOptional2);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!", productCategory10, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Order> orderList4 = orderDAO0.findByCourierId("hi!");
        com.boutique.enums.OrderStatus orderStatus5 = null;
        java.util.List<com.boutique.model.Order> orderList6 = orderDAO0.findByStatus(orderStatus5);
        com.boutique.enums.OrderStatus orderStatus7 = null;
        java.util.List<com.boutique.model.Order> orderList8 = orderDAO0.findByStatus(orderStatus7);
        org.junit.Assert.assertNotNull(orderOptional2);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertNotNull(orderList8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.List<com.boutique.model.Order> orderList2 = orderDAO0.findByCustomerId("hi!");
        org.junit.Assert.assertNotNull(orderList2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<java.lang.Void> voidResult7 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        org.junit.Assert.assertNotNull(userResult3);
        org.junit.Assert.assertNotNull(voidResult7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        java.util.List<com.boutique.model.Customer> customerList7 = customerService0.searchCustomers("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Customer> customerList9 = customerService0.searchCustomers("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerList7);
        org.junit.Assert.assertNotNull(customerList9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Order> orderList4 = orderDAO0.findByCourierId("hi!");
        com.boutique.enums.OrderStatus orderStatus5 = null;
        java.util.List<com.boutique.model.Order> orderList6 = orderDAO0.findByStatus(orderStatus5);
        com.boutique.model.Order order7 = null;
        boolean boolean8 = orderDAO0.update(order7);
        org.junit.Assert.assertNotNull(orderOptional2);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(orderList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult6 = customerService0.updateCustomer("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(customerResult6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        java.util.Optional<com.boutique.model.Order> orderOptional2 = orderDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Order> orderList4 = orderDAO0.findByCourierId("hi!");
        com.boutique.enums.OrderStatus orderStatus5 = null;
        java.util.List<com.boutique.model.Order> orderList6 = orderDAO0.findByStatus(orderStatus5);
        com.boutique.model.Order order7 = null;
        orderDAO0.save(order7);
        org.junit.Assert.assertNotNull(orderOptional2);
        org.junit.Assert.assertNotNull(orderList4);
        org.junit.Assert.assertNotNull(orderList6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        orderItemDAO0.deleteByOrderId("");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList5 = productService0.searchProducts("hi!", productCategory2, (double) (short) 0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(100L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", productCategory3, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = orderItemDAO0.update(orderItem1);
// flaky "1) test036(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getItemId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.model.Customer customer2 = customerService0.getCustomerById("");
        com.boutique.util.Result<java.lang.Void> voidResult4 = customerService0.deactivateCustomer("hi!");
        org.junit.Assert.assertNull(customer2);
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("");
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = userDAO0.update(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("");
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        org.junit.Assert.assertNotNull(userOptional2);
        org.junit.Assert.assertNotNull(userOptional4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.hardDeleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = customerService0.deactivateCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult8 = customerService0.updateCustomer("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(customerResult8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = userDAO0.update(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory10, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        java.util.List<com.boutique.model.Customer> customerList9 = customerService0.searchCustomers("");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(voidResult7);
        org.junit.Assert.assertNotNull(customerList9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("");
        com.boutique.model.Customer customer4 = customerDAO0.findByEmail("hi!");
        com.boutique.model.Customer customer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = customerDAO0.update(customer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customerList2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("");
        boolean boolean4 = customerDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(customerList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("hi!");
        com.boutique.model.Customer customer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = customerDAO0.update(customer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customerList2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult7 = customerService0.deactivateCustomer("");
        com.boutique.util.Result<java.lang.Void> voidResult9 = customerService0.deactivateCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        java.util.List<com.boutique.model.Customer> customerList11 = customerService0.searchCustomers("");
        java.util.List<com.boutique.model.Customer> customerList13 = customerService0.searchCustomers("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(voidResult7);
        org.junit.Assert.assertNotNull(voidResult9);
        org.junit.Assert.assertNotNull(customerList11);
        org.junit.Assert.assertNotNull(customerList13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9" + "'", str1, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("");
        com.boutique.model.Customer customer4 = customerDAO0.findByEmail("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.model.Customer customer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = customerDAO0.update(customer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(customerList2);
        org.junit.Assert.assertNull(customer4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList2 = customerDAO0.search("");
        com.boutique.model.Customer customer4 = customerDAO0.findByEmail("hi!");
        com.boutique.model.Customer customer6 = customerDAO0.findByEmail("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(customerList2);
        org.junit.Assert.assertNull(customer4);
        org.junit.Assert.assertNull(customer6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        java.util.List<com.boutique.model.Customer> customerList1 = customerDAO0.findAll();
        com.boutique.model.Customer customer2 = null;
        customerDAO0.save(customer2);
        org.junit.Assert.assertNotNull(customerList1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList18 = productService0.searchProducts("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, 0.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855" + "'", str1, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.reactivateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.hardDeleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.enums.Role role5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult6 = authService0.signUp("hi!", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6" + "'", str1, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.reactivateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.reactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.deleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        com.boutique.enums.Role role12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signUp("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", role12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.deleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList24 = productService0.searchProducts("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory21, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.boutique.service.PaymentService.PaymentResult paymentResult0 = com.boutique.service.PaymentService.PaymentResult.DECLINED;
        java.lang.Class<?> wildcardClass1 = paymentResult0.getClass();
        org.junit.Assert.assertTrue("'" + paymentResult0 + "' != '" + com.boutique.service.PaymentService.PaymentResult.DECLINED + "'", paymentResult0.equals(com.boutique.service.PaymentService.PaymentResult.DECLINED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("hi!", "", productCategory28, "", (double) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional4 = productDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList27 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional21 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory5, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", 1.0d, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList15 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory4, (double) 1L, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult39 = productService0.updateProduct("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory35, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", 0.0d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99" + "'", str1, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.enums.ProductCategory productCategory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList5 = productDAO0.search("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory2, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.deleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional27 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.hardDelete("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        com.boutique.model.OrderItem orderItem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = orderItemDAO0.update(orderItem3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getItemId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory9, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.reactivateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult34 = productService0.reactivateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "hi!", (double) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult36 = productService0.reactivateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList29 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.search("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory5, (double) 0L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = productResult13.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "hi!", (double) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList35 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList13 = productService0.searchProducts("", productCategory10, (double) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult34 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productDAO0.search("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory4, (double) 1.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory9, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        com.boutique.enums.ProductCategory productCategory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList18 = productService0.searchProducts("hi!", productCategory15, (double) (short) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList11 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList30 = productService0.searchProducts("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory27, (double) 10L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.deleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.lang.Class<?> wildcardClass3 = userList2.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.reactivateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult30 = productService0.reactivateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList24 = productService0.searchProducts("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory21, (double) 1L, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) (-1), (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", productCategory12, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional9 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.updateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory10, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = userDAO0.update(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) ' ');
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.reactivate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.search("hi!", productCategory3, (double) 1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(100L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory28, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional22 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        com.boutique.enums.ProductCategory productCategory23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.updateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "", productCategory23, "", (double) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.OrderItem> orderItemList4 = orderItemDAO0.findByOrderId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = productResult38.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "hi!", (double) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult36 = productService0.deleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult10 = authService0.changePassword("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "hi!");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        com.boutique.enums.ProductCategory productCategory30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!", productCategory30, "hi!", (double) (-1.0f), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        com.boutique.util.Result<java.lang.Void> voidResult17 = authService0.changePassword("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult20 = authService0.signIn("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult13);
        org.junit.Assert.assertNotNull(voidResult17);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.deleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory9, "hi!", 100.0d, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.reactivateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = customerDAO0.update(customer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "hi!", (double) (byte) 10, (int) (short) 0);
        com.boutique.util.Result<java.lang.Void> voidResult36 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult38 = productService0.reactivateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
        org.junit.Assert.assertNotNull(voidResult36);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.reactivateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = productDAO0.update(product2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.deactivate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        com.boutique.model.Customer customer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = customerDAO0.update(customer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.reactivateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", role9);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productService0.getProductById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult33 = productService0.updateProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory29, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory16, "hi!", (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = productDAO0.update(product1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Customer> customerList4 = customerDAO0.search("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.isActive()\" because \"<local5>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.hardDeleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        java.lang.Class<?> wildcardClass20 = productResult19.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional41 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 1);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional7 = productDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.hardDelete("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList8 = productDAO0.findAllIncludingInactive();
        org.junit.Assert.assertNotNull(productList7);
        org.junit.Assert.assertNotNull(productList8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional29 = productService0.getProductById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory27 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult31 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory27, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (-1.0d), (-1));
        com.boutique.util.Result<java.lang.Void> voidResult33 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList34 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult31);
        org.junit.Assert.assertNotNull(voidResult33);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.model.Product product7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.update(product7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.update(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList25 = productService0.searchProducts("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory22, (-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional9 = productDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.model.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productService0.getProductById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList26 = productService0.searchProducts("", productCategory23, (double) 100, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) '#');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional34 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult21 = productService0.updateProduct("hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory17, "hi!", (double) 100L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.boutique.service.PaymentService.PaymentResult paymentResult0 = com.boutique.service.PaymentService.PaymentResult.APPROVED;
        java.lang.Class<?> wildcardClass1 = paymentResult0.getClass();
        org.junit.Assert.assertTrue("'" + paymentResult0 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult0.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 'a');
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.hardDelete("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerResult10);
        org.junit.Assert.assertNotNull(customerResult16);
        org.junit.Assert.assertNotNull(customerResult21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(1L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory9, "hi!", 100.0d, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<java.lang.Void> voidResult17 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult13);
        org.junit.Assert.assertNotNull(voidResult17);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.enums.ProductCategory productCategory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory7, (double) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(0L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findByUsername("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory28, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.boutique.data.OrderDAO orderDAO0 = new com.boutique.data.OrderDAO();
        com.boutique.model.Order order1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = orderDAO0.update(order1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Order.getOrderId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        java.lang.Class<?> wildcardClass15 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory9, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, (int) (byte) 0);
        com.boutique.enums.ProductCategory productCategory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList18 = productService0.searchProducts("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, (double) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList28 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList27 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.deleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList27);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.enums.Role role12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signUp("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", role12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList33 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional15 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList18 = productService0.searchProducts("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, (double) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult6 = customerService0.updateCustomer("", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(customerResult6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product8 = null;
        productDAO0.save(product8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory9, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional15 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory3, "hi!", (double) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productDAO0.reactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.enums.Role role11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult12 = authService0.signUp("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userResult4);
        org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.model.Customer customer4 = customerDAO0.findByEmail("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getEmail()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = userDAO0.update(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList27 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.deleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productList27);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.enums.Role role5 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult6 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", role5);
        org.junit.Assert.assertNotNull(userResult6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.deleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.boutique.service.PaymentService paymentService0 = new com.boutique.service.PaymentService();
        com.boutique.service.PaymentService.PaymentResult paymentResult2 = paymentService0.process("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.service.PaymentService.PaymentResult paymentResult4 = paymentService0.process("hi!");
        com.boutique.service.PaymentService.PaymentResult paymentResult6 = paymentService0.process("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.service.PaymentService.PaymentResult paymentResult8 = paymentService0.process("hi!");
        org.junit.Assert.assertTrue("'" + paymentResult2 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult2.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult4 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult4.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult6 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult6.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult8 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult8.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        java.lang.Class<?> wildcardClass17 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        authService0.signOut();
        java.lang.Class<?> wildcardClass9 = authService0.getClass();
        org.junit.Assert.assertNotNull(userResult4);
        org.junit.Assert.assertNotNull(userResult7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.search("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, (double) (byte) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.boutique.service.OrderService orderService0 = new com.boutique.service.OrderService();
        com.boutique.util.Result<com.boutique.model.Order> orderResult2 = orderService0.createOrder("");
        com.boutique.util.Result<com.boutique.model.Order> orderResult4 = orderService0.createOrder("");
        org.junit.Assert.assertNotNull(orderResult2);
        org.junit.Assert.assertNotNull(orderResult4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        com.boutique.enums.ProductCategory productCategory22 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult26 = productService0.addProduct("", productCategory22, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) (-1L), (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult33 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory29, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
        org.junit.Assert.assertNotNull(productResult26);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.deactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.update(product3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.hardDelete("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult22 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory18, "hi!", (double) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role14);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult18 = authService0.signIn("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        com.boutique.enums.Role role16 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult17 = authService0.signUp("", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role16);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(voidResult13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", role13);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult9);
        org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role14);
        authService0.signOut();
        com.boutique.enums.Role role20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!", role20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList40 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional42 = productService0.getProductById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role14);
        com.boutique.util.Result<com.boutique.model.User> userResult18 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult15);
        org.junit.Assert.assertNotNull(userResult18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult9 = productService0.reactivateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList11 = productDAO0.search("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory8, (double) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.model.Product product6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.update(product6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList40 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult42 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = userDAO0.update(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional8 = userDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult41 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) ' ');
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        com.boutique.model.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult28 = productService0.updateProduct("hi!", "hi!", productCategory24, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
        org.junit.Assert.assertNotNull(productList21);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.boutique.service.PaymentService paymentService0 = new com.boutique.service.PaymentService();
        com.boutique.service.PaymentService.PaymentResult paymentResult2 = paymentService0.process("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + paymentResult2 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult2.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory28, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", 1.0d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.model.Customer customer4 = customerDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48" + "'", str1, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult40 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory9, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, (int) (byte) 0);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional17 = productService0.getProductById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult17 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        java.util.List<com.boutique.model.Product> productList11 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult18 = productService0.updateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory14, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", role9);
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role14);
        com.boutique.util.Result<com.boutique.model.User> userResult18 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
        org.junit.Assert.assertNotNull(userResult15);
        org.junit.Assert.assertNotNull(userResult18);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.model.Product product6 = null;
        productDAO0.save(product6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        com.boutique.util.Result<com.boutique.model.User> userResult12 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.search("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, (double) (-1L), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory22 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult26 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory22, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", 1.0d, 100);
        com.boutique.enums.ProductCategory productCategory28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList31 = productService0.searchProducts("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory28, (double) (short) 1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productResult26);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.lang.Class<?> wildcardClass2 = productDAO0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional16 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (-1));
        com.boutique.enums.ProductCategory productCategory36 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult40 = productService0.addProduct("", productCategory36, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
        org.junit.Assert.assertNotNull(productResult40);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory9, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional18 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(voidResult16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.model.Product product6 = null;
        productDAO0.save(product6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", role9);
        com.boutique.enums.Role role14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", role14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", role9);
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerResult10);
        org.junit.Assert.assertNotNull(customerResult16);
        org.junit.Assert.assertNotNull(customerResult21);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Customer> customerList3 = customerDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.isActive()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = customerDAO0.deactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        com.boutique.model.OrderItem orderItem3 = null;
        orderItemDAO0.save(orderItem3);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList15 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (-1));
        com.boutique.enums.ProductCategory productCategory37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult41 = productService0.updateProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "hi!", productCategory37, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (-1.0d), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        com.boutique.model.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = userDAO0.update(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        java.util.List<com.boutique.model.Product> productList9 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = productDAO0.reactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) -1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product8 = null;
        productDAO0.save(product8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory9, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.deleteProduct("");
        java.lang.Class<?> wildcardClass17 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult15 = customerService0.addCustomer("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerResult10);
        org.junit.Assert.assertNotNull(customerResult15);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        com.boutique.enums.ProductCategory productCategory22 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult26 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory22, "hi!", (double) (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
        org.junit.Assert.assertNotNull(productResult26);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList40 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory43 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult47 = productService0.updateProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory43, "", (double) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productService0.getProductById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = customerDAO0.deactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        userDAO0.save(user7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional10 = userDAO0.findByUsername("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = userDAO0.update(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional7 = productDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role9);
        java.lang.Class<?> wildcardClass11 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(userResult10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory15, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", 0.0d, 0);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult22 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.model.Customer customer4 = customerDAO0.findById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getCustomerId()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", role14);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional6 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "hi!", (double) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional36 = productService0.getProductById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.enums.Role role11 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult12 = authService0.signUp("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role11);
        authService0.signOut();
        org.junit.Assert.assertNotNull(userResult4);
        org.junit.Assert.assertNotNull(userResult7);
        org.junit.Assert.assertNotNull(userResult12);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        com.boutique.model.OrderItem orderItem3 = null;
        orderItemDAO0.save(orderItem3);
        com.boutique.model.OrderItem orderItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = orderItemDAO0.update(orderItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getItemId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList17 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList22 = productService0.searchProducts("hi!", productCategory19, (double) '#', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.boutique.service.PaymentService paymentService0 = new com.boutique.service.PaymentService();
        java.lang.Class<?> wildcardClass1 = paymentService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.boutique.data.OrderItemDAO orderItemDAO0 = new com.boutique.data.OrderItemDAO();
        com.boutique.model.OrderItem orderItem1 = null;
        orderItemDAO0.save(orderItem1);
        // The following exception was thrown during execution in test generation
        try {
            orderItemDAO0.deleteByOrderId("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.OrderItem.getOrderId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory15, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", 0.0d, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.deleteProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.boutique.data.CustomerDAO customerDAO0 = new com.boutique.data.CustomerDAO();
        com.boutique.model.Customer customer1 = null;
        customerDAO0.save(customer1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.model.Customer customer4 = customerDAO0.findByEmail("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Customer.getEmail()\" because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        userDAO0.save(user7);
        com.boutique.model.User user9 = null;
        userDAO0.save(user9);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.enums.ProductCategory productCategory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList11 = productDAO0.search("", productCategory8, (double) 0L, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findByUsername("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        org.junit.Assert.assertNotNull(customerResult5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        java.util.List<com.boutique.model.User> userList7 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional9 = userDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664" + "'", str1, "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional18 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) '4');
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        userDAO0.save(user7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional10 = userDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 100);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.search("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, (double) 1, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        java.util.List<com.boutique.model.User> userList7 = userDAO0.getAll();
        com.boutique.model.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = userDAO0.update(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory27 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult31 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory27, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (-1.0d), (-1));
        com.boutique.util.Result<java.lang.Void> voidResult33 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory35 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult39 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory35, "", (double) ' ', (int) '4');
        com.boutique.enums.ProductCategory productCategory41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList44 = productService0.searchProducts("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory41, 10.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult31);
        org.junit.Assert.assertNotNull(voidResult33);
        org.junit.Assert.assertNotNull(productResult39);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.deleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.enums.Role role8 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!", role8);
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        com.boutique.util.Result<java.lang.Void> voidResult17 = authService0.changePassword("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        com.boutique.enums.Role role21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult22 = authService0.signUp("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult9);
        org.junit.Assert.assertNotNull(userResult13);
        org.junit.Assert.assertNotNull(voidResult17);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "");
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(voidResult9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertNotNull(customerResult5);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory34 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult38 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory34, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10L, (int) (byte) 1);
        java.util.List<com.boutique.model.Product> productList39 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList40 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList45 = productService0.searchProducts("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory42, (double) 0.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productResult38);
        org.junit.Assert.assertNotNull(productList39);
        org.junit.Assert.assertNotNull(productList40);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8" + "'", str1, "641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(userResult4);
        org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("");
        com.boutique.enums.ProductCategory productCategory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList32 = productService0.searchProducts("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", productCategory29, (double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(voidResult27);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", role9);
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
        org.junit.Assert.assertNotNull(userResult13);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList17 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult19 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional7 = productDAO0.findById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        java.util.List<com.boutique.model.User> userList7 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional9 = userDAO0.findById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        java.util.List<com.boutique.model.User> userList6 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d" + "'", str1, "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(100L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        java.util.List<com.boutique.model.Product> productList9 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = productDAO0.reactivate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        userDAO0.save(user7);
        com.boutique.model.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = userDAO0.update(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.deleteProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult31 = productService0.reactivateProduct("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(voidResult27);
        org.junit.Assert.assertNotNull(voidResult29);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult16 = customerService0.updateCustomer("", "", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult21 = customerService0.addCustomer("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!", "");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult26 = customerService0.addCustomer("", "1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerResult10);
        org.junit.Assert.assertNotNull(customerResult16);
        org.junit.Assert.assertNotNull(customerResult21);
        org.junit.Assert.assertNotNull(customerResult26);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = userDAO0.update(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory9, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList17 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(voidResult16);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("hi!", "");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", productCategory16, "", (double) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.hardDelete("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory30, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.search("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", productCategory6, (double) (short) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.enums.ProductCategory productCategory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory7, (double) (byte) 1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("");
        com.boutique.enums.ProductCategory productCategory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList32 = productService0.searchProducts("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", productCategory29, (double) 1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(voidResult27);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.lang.Class<?> wildcardClass9 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList17 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional19 = productService0.getProductById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
        org.junit.Assert.assertNotNull(productList17);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        java.util.List<com.boutique.model.Product> productList11 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList12 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList13 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productList11);
        org.junit.Assert.assertNotNull(productList12);
        org.junit.Assert.assertNotNull(productList13);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        java.util.List<com.boutique.model.Product> productList7 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product8 = null;
        productDAO0.save(product8);
        com.boutique.enums.ProductCategory productCategory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList14 = productDAO0.search("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", productCategory11, (double) 100L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList30 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(voidResult27);
        org.junit.Assert.assertNotNull(voidResult29);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList8 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        java.util.List<com.boutique.model.Product> productList11 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional13 = productService0.getProductById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productList8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        java.util.List<com.boutique.model.User> userList8 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional10 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory9, "hi!", 100.0d, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.reactivateProduct("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.reactivateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList13 = productDAO0.search("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory10, (double) 1L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.update(product4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory15, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 0.0d, (-1));
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.reactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", "hi!", "", role9);
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 1);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.reactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.deleteProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.boutique.service.CustomerService customerService0 = new com.boutique.service.CustomerService();
        com.boutique.util.Result<com.boutique.model.Customer> customerResult5 = customerService0.addCustomer("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<com.boutique.model.Customer> customerResult10 = customerService0.addCustomer("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "");
        org.junit.Assert.assertNotNull(customerResult5);
        org.junit.Assert.assertNotNull(customerResult10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.addProduct("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", productCategory28, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult34 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(productResult32);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult34 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory30, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (-1));
        com.boutique.enums.ProductCategory productCategory36 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult40 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory36, "", (double) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
        org.junit.Assert.assertNotNull(productResult34);
        org.junit.Assert.assertNotNull(productResult40);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        java.lang.Class<?> wildcardClass5 = userList4.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult4 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("", "hi!", "hi!");
        org.junit.Assert.assertNotNull(userResult4);
        org.junit.Assert.assertNotNull(userResult7);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", role9);
        com.boutique.enums.Role role14 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role14);
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
        org.junit.Assert.assertNotNull(userResult15);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.reactivateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
        org.junit.Assert.assertNotNull(productList16);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", "hi!", "");
        com.boutique.util.Result<java.lang.Void> voidResult17 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(voidResult9);
        org.junit.Assert.assertNotNull(voidResult13);
        org.junit.Assert.assertNotNull(voidResult17);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional6 = productDAO0.findById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory9, "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", (double) (byte) -1, (int) (byte) 0);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional16 = productService0.getProductById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = productService0.getClass();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList20 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList21 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory23 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult27 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory23, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (short) 100, (int) (short) 100);
        com.boutique.enums.ProductCategory productCategory29 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult33 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory29, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) 1.0f, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList34 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productList20);
        org.junit.Assert.assertNotNull(productList21);
        org.junit.Assert.assertNotNull(productResult27);
        org.junit.Assert.assertNotNull(productResult33);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional28 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        java.util.List<com.boutique.model.Product> productList14 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory16, "", (double) 0.0f, 100);
        com.boutique.enums.ProductCategory productCategory22 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult26 = productService0.addProduct("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", productCategory22, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (-1.0f), (int) (byte) 0);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productList14);
        org.junit.Assert.assertNotNull(productResult20);
        org.junit.Assert.assertNotNull(productResult26);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        com.boutique.enums.Role role17 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult18 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", role17);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult13);
        org.junit.Assert.assertNotNull(userResult18);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8", productCategory15, "", (double) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult21 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("", "");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "", "c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult8);
        org.junit.Assert.assertNotNull(voidResult13);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", (double) ' ', (int) (byte) 100);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("", productCategory9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100, 10);
        com.boutique.util.Result<java.lang.Void> voidResult15 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional17 = productService0.getProductById("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(voidResult15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.model.Product product6 = null;
        productDAO0.save(product6);
        com.boutique.model.Product product8 = null;
        productDAO0.save(product8);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("hi!", "");
        com.boutique.util.Result<java.lang.Void> voidResult15 = authService0.changePassword("c018256bbe80f95a7eb71b8c3abb0ff013ab126951975099003d14416249bf99", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult11);
        org.junit.Assert.assertNotNull(voidResult15);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        com.boutique.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = userDAO0.update(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        java.util.List<com.boutique.model.Product> productList26 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult28 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList33 = productService0.searchProducts("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory30, (double) 0L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productList26);
        org.junit.Assert.assertNotNull(voidResult28);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory27 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult31 = productService0.addProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory27, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (-1.0d), (-1));
        com.boutique.util.Result<java.lang.Void> voidResult33 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory35 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult39 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory35, "", (double) ' ', (int) '4');
        com.boutique.enums.ProductCategory productCategory41 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult45 = productService0.addProduct("1b704de5dbf799fb3fe1af14e3a2fbc5ce46dea5d28da9b6a906e47a6edba664", productCategory41, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult31);
        org.junit.Assert.assertNotNull(voidResult33);
        org.junit.Assert.assertNotNull(productResult39);
        org.junit.Assert.assertNotNull(productResult45);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional11 = userDAO0.findById("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        java.util.List<com.boutique.model.User> userList10 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "hi!");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role12 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signUp("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", role12);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult13);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory21, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) (short) 100, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory28 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult32 = productService0.updateProduct("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory28, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", 100.0d, (int) (byte) 100);
        java.util.List<com.boutique.model.Product> productList33 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(productResult32);
        org.junit.Assert.assertNotNull(productList33);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 10);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("641cb482fe5632ffcf4e36b016dc14f57cdc22fbd25b832cf8015339df5eade8");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        com.boutique.model.User user5 = null;
        userDAO0.save(user5);
        com.boutique.model.User user7 = null;
        userDAO0.save(user7);
        java.util.List<com.boutique.model.User> userList9 = userDAO0.getAll();
        com.boutique.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = userDAO0.update(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "", 1.0d, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory9 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult13 = productService0.addProduct("hi!", productCategory9, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 10, (int) (short) 10);
        com.boutique.enums.ProductCategory productCategory15 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory15, "hi!", (double) (byte) -1, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory21 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult25 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory21, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 1L, (int) (byte) 10);
        com.boutique.util.Result<java.lang.Void> voidResult27 = productService0.hardDeleteProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult29 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult31 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productResult7);
        org.junit.Assert.assertNotNull(productResult13);
        org.junit.Assert.assertNotNull(productResult19);
        org.junit.Assert.assertNotNull(productResult25);
        org.junit.Assert.assertNotNull(voidResult27);
        org.junit.Assert.assertNotNull(voidResult29);
    }
}
