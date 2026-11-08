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
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.lang.Class<?> wildcardClass2 = productList1.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2" + "'", str1, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855" + "'", str1, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.Optional<com.boutique.model.Product> productOptional2 = productDAO0.findById("");
        boolean boolean4 = productDAO0.deactivate("");
        boolean boolean6 = productDAO0.reactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(productOptional2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.Optional<com.boutique.model.Product> productOptional2 = productDAO0.findById("");
        boolean boolean4 = productDAO0.deactivate("");
        boolean boolean6 = productDAO0.hardDelete("");
        org.junit.Assert.assertNotNull(productOptional2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProducts();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        java.util.List<com.boutique.model.Product> productList6 = productService0.searchProducts("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory3, (double) 'a', (double) 'a');
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productService0.searchProducts("", productCategory3, 0.0d, (double) 0L);
// flaky "1) test010(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productDAO0.search("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory4, (double) '4', 10.0d);
// flaky "2) test011(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc" + "'", str1, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9" + "'", str1, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional10 = productService0.getProductById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
// flaky "3) test015(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6" + "'", str1, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.enums.ProductCategory productCategory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList5 = productDAO0.search("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory2, (double) (byte) 1, (double) 1L);
// flaky "4) test018(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48" + "'", str1, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.enums.Role role20 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role20);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult24 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProducts();
// flaky "5) test021(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.hardDeleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
// flaky "6) test022(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.update(product4);
// flaky "7) test023(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", productCategory3, "hi!", (double) 10.0f, (int) (short) 0);
// flaky "8) test025(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", productCategory4, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 100L, (int) (short) 0);
// flaky "9) test026(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList14 = productService0.searchProducts("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory11, (double) (-1), (double) (short) -1);
// flaky "10) test027(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.hardDelete("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) 100.0f, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = userDAO0.update(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.search("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory3, 1.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.lang.Class<?> wildcardClass3 = productList2.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory3, "hi!", 0.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.lang.Class<?> wildcardClass2 = productService0.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList13 = productService0.searchProducts("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory10, 1.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.search("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, (double) (-1), (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.deleteProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.util.Result<java.lang.Void> voidResult20 = authService0.changePassword("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(voidResult20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.lang.Class<?> wildcardClass4 = userDAO0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findByUsername("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        java.lang.Class<?> wildcardClass17 = voidResult16.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.reactivateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.deleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.hardDelete("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", role9);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional12 = productService0.getProductById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.enums.Role role20 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role20);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult24 = authService0.signIn("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult21);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.deleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.lang.Class<?> wildcardClass3 = userDAO0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.lang.Class<?> wildcardClass10 = productList9.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.hardDelete("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", productCategory3, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.hardDeleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional11 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        java.lang.Class<?> wildcardClass18 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.enums.Role role8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", role8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = userDAO0.update(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findByUsername("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.deleteProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "hi!", productCategory4, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 100.0f, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.search("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory6, (double) (short) 10, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
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
            boolean boolean4 = productDAO0.deactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        com.boutique.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = userDAO0.update(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
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
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.update(product5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because the return value of \"java.util.List.get(int)\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = userDAO0.update(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult17 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult17 = productService0.updateProduct("hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory13, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (-1L), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productService0.searchProducts("hi!", productCategory4, (double) 0.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional12 = productService0.getProductById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional7 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList17 = productService0.searchProducts("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory14, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.enums.Role role4 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult5 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "", role4);
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "");
        com.boutique.enums.Role role12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signUp("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", role12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userResult5);
        org.junit.Assert.assertNotNull(userResult8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role22 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signUp("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role22);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult19 = productService0.updateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!", productCategory15, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) 10L, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList15 = productService0.searchProducts("hi!", productCategory12, (double) (byte) 0, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.enums.Role role8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult9 = authService0.signUp("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!", role8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
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
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "", productCategory5, "hi!", (double) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.enums.ProductCategory productCategory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory7, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory12, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (-1.0d), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.reactivateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.enums.Role role4 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult5 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "", role4);
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "", "hi!");
        org.junit.Assert.assertNotNull(userResult5);
        org.junit.Assert.assertNotNull(voidResult9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory12, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (-1.0d), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.deleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult14 = productService0.deleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("hi!", "hi!", productCategory3, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
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
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d" + "'", str1, "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.hardDelete("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = userDAO0.update(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productService0.searchProducts("", productCategory4, (double) (short) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.deleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = userDAO0.update(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult17 = productService0.updateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory13, "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", (double) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.addProduct("", productCategory10, "hi!", (double) 10L, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult16 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productResult14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList5 = productService0.searchProducts("hi!", productCategory2, (double) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList7 = productDAO0.search("", productCategory4, (double) (-1), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.addProduct("", productCategory10, "hi!", (double) 10L, (int) 'a');
        com.boutique.enums.ProductCategory productCategory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult21 = productService0.updateProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", productCategory17, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (-1.0d), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productResult14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        java.lang.Class<?> wildcardClass15 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.hardDelete("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productService0.searchProducts("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory3, 0.0d, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional14 = productService0.getProductById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory4, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (double) 10.0f, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("hi!", "");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(userResult7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = productDAO0.deactivate("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory12, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        com.boutique.model.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = userDAO0.update(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList8 = productDAO0.search("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", productCategory5, (double) (-1), 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional9 = userDAO0.findByUsername("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        com.boutique.enums.ProductCategory productCategory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList11 = productDAO0.search("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", productCategory8, (double) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findByUsername("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult10 = productService0.updateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory6, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 100.0f, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList14 = productService0.searchProducts("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory11, 1.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.enums.Role role4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult5 = authService0.signUp("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", role4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        com.boutique.enums.ProductCategory productCategory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.search("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", productCategory7, (-1.0d), (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory11 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult15 = productService0.addProduct("", productCategory11, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) 10L, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList16 = productService0.getAllProducts();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productResult15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList14 = productService0.searchProducts("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory11, (double) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.hardDelete("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.hardDeleteProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936" + "'", str1, "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory12, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (-1.0d), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.hardDeleteProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.enums.Role role4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult5 = authService0.signUp("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", role4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = userDAO0.update(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional17 = userDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.addProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory10, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", (double) 100L, (int) (byte) -1);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productResult14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.search("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", productCategory6, (double) 100.0f, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        java.lang.Class<?> wildcardClass17 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList10 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory12, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional18 = productService0.getProductById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
        org.junit.Assert.assertNotNull(productList10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("", "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory11 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult15 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory11, "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", (double) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional17 = productService0.getProductById("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        authService0.signOut();
        authService0.signOut();
        java.lang.Class<?> wildcardClass17 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.deactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.reactivate("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult7 = productService0.updateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory3, "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", (double) 10L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role18 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult19 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role18);
        com.boutique.util.Result<java.lang.Void> voidResult23 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult19);
        org.junit.Assert.assertNotNull(voidResult23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult16 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        com.boutique.util.Result<java.lang.Void> voidResult20 = authService0.changePassword("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult16);
        org.junit.Assert.assertNotNull(voidResult20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        com.boutique.enums.ProductCategory productCategory18 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult22 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory18, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) 1.0f, (int) (short) 0);
        com.boutique.enums.ProductCategory productCategory24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList27 = productService0.searchProducts("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory24, (double) 0.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
        org.junit.Assert.assertNotNull(productResult22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role22 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signUp("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role22);
        java.lang.Class<?> wildcardClass24 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productService0.searchProducts("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory6, (double) (short) -1, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = productDAO0.deactivate("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional11 = productService0.getProductById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.search("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory6, (double) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        java.lang.Class<?> wildcardClass9 = voidResult8.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.reactivateProduct("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory12, "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", (-1.0d), (-1));
        com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional20 = productService0.getProductById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
        org.junit.Assert.assertNotNull(voidResult18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.hardDeleteProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        java.util.List<com.boutique.model.User> userList16 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional18 = userDAO0.findById("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.reactivateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        com.boutique.enums.ProductCategory productCategory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList21 = productService0.searchProducts("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory18, (double) (byte) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        com.boutique.enums.Role role9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult10 = authService0.signUp("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", role9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role18 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult19 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role18);
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult24 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "hi!", "hi!");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult19);
        org.junit.Assert.assertNotNull(voidResult24);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        org.junit.Assert.assertNotNull(voidResult5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.enums.Role role12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", role12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        java.util.List<com.boutique.model.User> userList12 = userDAO0.getAll();
        com.boutique.model.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = userDAO0.update(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional12 = productService0.getProductById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult5 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        java.lang.Class<?> wildcardClass6 = authService0.getClass();
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional10 = productService0.getProductById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.hardDelete("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.Product> productResult15 = productService0.updateProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "", productCategory11, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", 1.0d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productDAO0.hardDelete("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.addProduct("", productCategory10, "hi!", (double) 10L, (int) 'a');
        java.lang.Class<?> wildcardClass15 = productResult14.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productResult14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.enums.Role role20 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role20);
        com.boutique.enums.Role role25 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult26 = authService0.signUp("", "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role25);
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult21);
        org.junit.Assert.assertNotNull(userResult26);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.deleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role22 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signUp("", "", "", role22);
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult23);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = productResult8.getClass();
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        authService0.signOut();
        authService0.signOut();
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        java.util.List<com.boutique.model.Product> productList9 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult11 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
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
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        java.util.List<com.boutique.model.User> userList16 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList17 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList18 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional12 = productService0.getProductById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        com.boutique.model.Product product5 = null;
        productDAO0.save(product5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = productDAO0.reactivate("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        authService0.signOut();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult20 = authService0.changePassword("", "hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signIn("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
        org.junit.Assert.assertNotNull(voidResult20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        com.boutique.util.Result<com.boutique.model.User> userResult16 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "");
        com.boutique.enums.Role role20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", role20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult16);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        java.util.List<com.boutique.model.User> userList16 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional18 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = productDAO0.deactivate("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        com.boutique.enums.ProductCategory productCategory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList13 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory10, (double) (short) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        boolean boolean2 = com.boutique.util.PasswordUtil.verify("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.enums.Role role20 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("", "hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role20);
        com.boutique.util.Result<java.lang.Void> voidResult25 = authService0.changePassword("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult21);
        org.junit.Assert.assertNotNull(voidResult25);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList6 = productDAO0.search("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", productCategory3, (double) 0.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional17 = userDAO0.findByUsername("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory12, "", 1.0d, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.deleteProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        com.boutique.enums.ProductCategory productCategory18 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult22 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory18, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) 1.0f, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional24 = productService0.getProductById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
        org.junit.Assert.assertNotNull(productResult22);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult18 = productService0.deleteProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = productDAO0.deactivate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList11 = productDAO0.search("hi!", productCategory8, (double) 10L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory5 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult9 = productService0.addProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", productCategory5, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) 100L, (int) (byte) 10);
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.updateProduct("", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d", productCategory12, "", (double) 0, (-1));
        com.boutique.enums.ProductCategory productCategory18 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult22 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory18, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) 1.0f, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult24 = productService0.reactivateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productResult9);
        org.junit.Assert.assertNotNull(productResult16);
        org.junit.Assert.assertNotNull(productResult22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        com.boutique.model.Product product9 = null;
        productDAO0.save(product9);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.addProduct("", productCategory4, "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", (double) (-1L), (int) '4');
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.deleteProduct("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional12 = productService0.getProductById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        java.util.List<com.boutique.model.Product> productList9 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        com.boutique.model.User user3 = null;
        userDAO0.save(user3);
        java.util.List<com.boutique.model.User> userList5 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList6 = userDAO0.getAll();
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str1 = com.boutique.util.PasswordUtil.hash("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bdca9e8dbca354e824e67bfe1533fa4a238b9ea832f23fb4271ebeb3a5a8f720" + "'", str1, "bdca9e8dbca354e824e67bfe1533fa4a238b9ea832f23fb4271ebeb3a5a8f720");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        java.util.List<com.boutique.model.User> userList6 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList7 = userDAO0.getAll();
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        java.lang.Class<?> wildcardClass10 = userDAO0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findByUsername("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role22 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signUp("", "", "", role22);
        com.boutique.util.Result<java.lang.Void> voidResult27 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", "hi!");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult23);
        org.junit.Assert.assertNotNull(voidResult27);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        com.boutique.model.Product product1 = null;
        productDAO0.save(product1);
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        com.boutique.enums.ProductCategory productCategory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList9 = productDAO0.search("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory6, (double) 0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional11 = userDAO0.findById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        authService0.signOut();
        com.boutique.enums.Role role13 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult14 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role13);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<com.boutique.model.User> userResult17 = authService0.signIn("bdca9e8dbca354e824e67bfe1533fa4a238b9ea832f23fb4271ebeb3a5a8f720", "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(userResult14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.enums.ProductCategory productCategory10 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult14 = productService0.addProduct("", productCategory10, "hi!", (double) 10L, (int) 'a');
        com.boutique.enums.ProductCategory productCategory16 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult20 = productService0.addProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", productCategory16, "bdca9e8dbca354e824e67bfe1533fa4a238b9ea832f23fb4271ebeb3a5a8f720", (double) (-1.0f), (int) (byte) 1);
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(productResult14);
        org.junit.Assert.assertNotNull(productResult20);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product7 = null;
        productDAO0.save(product7);
        java.util.List<com.boutique.model.Product> productList9 = productDAO0.findAllIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList10 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(productList4);
        org.junit.Assert.assertNotNull(productList5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productList9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.enums.Role role20 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult21 = authService0.signUp("", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", role20);
        com.boutique.util.Result<java.lang.Void> voidResult25 = authService0.changePassword("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
        authService0.signOut();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(voidResult16);
        org.junit.Assert.assertNotNull(userResult21);
        org.junit.Assert.assertNotNull(voidResult25);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        java.util.List<com.boutique.model.Product> productList11 = productService0.getAllProductsIncludingInactive();
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult13 = productService0.deleteProduct("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productList11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        java.util.List<com.boutique.model.User> userList12 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional14 = userDAO0.findByUsername("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory4, "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", (double) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(voidResult2);
        org.junit.Assert.assertNotNull(productResult8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.enums.Role role4 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult5 = authService0.signUp("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "", role4);
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        com.boutique.util.Result<java.lang.Void> voidResult13 = authService0.changePassword("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        org.junit.Assert.assertNotNull(userResult5);
        org.junit.Assert.assertNotNull(voidResult9);
        org.junit.Assert.assertNotNull(voidResult13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional7 = userDAO0.findByUsername("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product3 = null;
        productDAO0.save(product3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult12 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role18 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult19 = authService0.signUp("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", role18);
        java.lang.Class<?> wildcardClass20 = userResult19.getClass();
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
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
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.enums.ProductCategory productCategory2 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult6 = productService0.addProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", productCategory2, "2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936", (double) (short) 0, 0);
        org.junit.Assert.assertNotNull(productResult6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        com.boutique.model.User user1 = null;
        userDAO0.save(user1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUsername()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        java.util.List<com.boutique.model.User> userList12 = userDAO0.getAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional14 = userDAO0.findById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        com.boutique.model.Product product2 = null;
        productDAO0.save(product2);
        com.boutique.model.Product product4 = null;
        productDAO0.save(product4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = productDAO0.deactivate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        com.boutique.model.User user2 = null;
        userDAO0.save(user2);
        com.boutique.model.User user4 = null;
        userDAO0.save(user4);
        com.boutique.model.User user6 = null;
        userDAO0.save(user6);
        com.boutique.model.User user8 = null;
        userDAO0.save(user8);
        com.boutique.model.User user10 = null;
        userDAO0.save(user10);
        com.boutique.model.User user12 = null;
        userDAO0.save(user12);
        com.boutique.model.User user14 = null;
        userDAO0.save(user14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.User> userOptional17 = userDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.User.getUserId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory4 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult8 = productService0.updateProduct("", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", productCategory4, "", (double) 10.0f, (int) (short) 1);
        com.boutique.util.Result<java.lang.Void> voidResult10 = productService0.reactivateProduct("");
        com.boutique.enums.ProductCategory productCategory12 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult16 = productService0.addProduct("bdca9e8dbca354e824e67bfe1533fa4a238b9ea832f23fb4271ebeb3a5a8f720", productCategory12, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 0.0f, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.boutique.model.Product> productOptional18 = productService0.getProductById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<parameter2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productResult8);
        org.junit.Assert.assertNotNull(voidResult10);
        org.junit.Assert.assertNotNull(productResult16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        authService0.signOut();
        com.boutique.enums.Role role18 = null;
        com.boutique.util.Result<com.boutique.model.User> userResult19 = authService0.signUp("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "", role18);
        authService0.signOut();
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult25 = authService0.changePassword("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
        org.junit.Assert.assertNotNull(voidResult4);
        org.junit.Assert.assertNotNull(voidResult8);
        org.junit.Assert.assertNotNull(voidResult12);
        org.junit.Assert.assertNotNull(userResult19);
        org.junit.Assert.assertNotNull(voidResult25);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.deleteProduct("");
        java.util.List<com.boutique.model.Product> productList6 = productService0.getAllProductsIncludingInactive();
        com.boutique.enums.ProductCategory productCategory8 = null;
        com.boutique.util.Result<com.boutique.model.Product> productResult12 = productService0.addProduct("", productCategory8, "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", 10.0d, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.util.Result<java.lang.Void> voidResult14 = productService0.reactivateProduct("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.boutique.model.Product.getProductId()\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(productList1);
        org.junit.Assert.assertNotNull(productList2);
        org.junit.Assert.assertNotNull(productList3);
        org.junit.Assert.assertNotNull(voidResult5);
        org.junit.Assert.assertNotNull(productList6);
        org.junit.Assert.assertNotNull(productResult12);
    }
}
