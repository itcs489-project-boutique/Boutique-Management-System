import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = productDAO0.deactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.reactivate("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.reactivateProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = productDAO0.hardDelete("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional4 = productDAO0.findById("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findById("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult3 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.hardDelete("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional3 = userDAO0.findByUsername("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = productDAO0.hardDelete("");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional3 = productService0.getProductById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAll();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAll();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAll();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional3 = productService0.getProductById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = productDAO0.hardDelete("hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional6 = productDAO0.findById("hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.deactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult8 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = productDAO0.hardDelete("");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.reactivateProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.hardDelete("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findByUsername("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional5 = productDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional3 = productDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.reactivate("hi!");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.deleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional6 = productDAO0.findById("");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult15 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.reactivateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.hardDeleteProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.deactivate("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional2 = productService0.getProductById("");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("hi!", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult7 = authService0.signIn("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.hardDelete("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findByUsername("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional4 = productDAO0.findById("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult3 = productService0.hardDeleteProduct("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional4 = productService0.getProductById("");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAll();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProducts();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList4 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional6 = userDAO0.findByUsername("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProducts();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult11 = authService0.signIn("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("", "hi!", "");
        com.boutique.util.Result<java.lang.Void> voidResult20 = authService0.changePassword("hi!", "", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult23 = authService0.signIn("hi!", "hi!");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.hardDelete("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.deactivate("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = productDAO0.reactivate("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = productDAO0.reactivate("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = productDAO0.deactivate("hi!");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional6 = productDAO0.findById("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional3 = userDAO0.findByUsername("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult3 = productService0.hardDeleteProduct("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional2 = userDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.reactivate("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = productDAO0.hardDelete("2a132dbfe4784627b86aa3807cd19cfeff487aab3dd7a60d0ab119a72e736936");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.reactivateProduct("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult7 = productService0.hardDeleteProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional7 = productService0.getProductById("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional7 = productDAO0.findById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = productDAO0.deactivate("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = productDAO0.deactivate("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48");
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("hi!");
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        com.boutique.util.Result<java.lang.Void> voidResult2 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult4 = productService0.deleteProduct("hi!");
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAll();
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.Product> productOptional5 = productService0.getProductById("hi!");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        com.boutique.util.Result<java.lang.Void> voidResult8 = authService0.changePassword("hi!", "", "");
        com.boutique.util.Result<java.lang.Void> voidResult12 = authService0.changePassword("hi!", "fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        com.boutique.util.Result<java.lang.Void> voidResult16 = authService0.changePassword("cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult19 = authService0.signIn("hi!", "cd372fb85148700fa88095e3492d3f9f5beb43e555e5ff26d95f5a6adc36f8e6");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findById("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList3 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional5 = userDAO0.findByUsername("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult3 = authService0.signIn("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = productDAO0.reactivate("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.deleteProduct("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult7 = productService0.deleteProduct("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult6 = productService0.deleteProduct("cdb9a58370da5d27986221d0b59d409091b8972f5b062e804a289b221bd44cd9");
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        com.boutique.data.ProductDAO productDAO0 = new com.boutique.data.ProductDAO();
        java.util.List<com.boutique.model.Product> productList1 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList4 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList5 = productDAO0.findAllIncludingInactive();
        java.util.List<com.boutique.model.Product> productList6 = productDAO0.findAllIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = productDAO0.reactivate("");
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        com.boutique.service.ProductService productService0 = new com.boutique.service.ProductService();
        java.util.List<com.boutique.model.Product> productList1 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList2 = productService0.getAllProductsIncludingInactive();
        java.util.List<com.boutique.model.Product> productList3 = productService0.getAllProductsIncludingInactive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<java.lang.Void> voidResult5 = productService0.reactivateProduct("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        com.boutique.data.UserDAO userDAO0 = new com.boutique.data.UserDAO();
        java.util.List<com.boutique.model.User> userList1 = userDAO0.getAll();
        java.util.List<com.boutique.model.User> userList2 = userDAO0.getAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Optional<com.boutique.model.User> userOptional4 = userDAO0.findById("f7d062d662826ed95869851db06bb539b402047baee53a00e0aa35bfbe98265d");
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        com.boutique.service.AuthService authService0 = new com.boutique.service.AuthService();
        com.boutique.util.Result<java.lang.Void> voidResult4 = authService0.changePassword("c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "c0ddd62c7717180e7ffb8a15bb9674d3ec92592e0b7ac7d1d5289836b4553be2", "hi!");
        authService0.signOut();
        com.boutique.util.Result<java.lang.Void> voidResult9 = authService0.changePassword("fde7de9030ec5285996a75b73217a8ed3de4fe01eca546be9174463595f8dfbc", "e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        authService0.signOut();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.boutique.util.Result<com.boutique.model.User> userResult13 = authService0.signIn("e67e72111b363d80c8124d28193926000980e1211c7986cacbd26aacc5528d48", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }
}

