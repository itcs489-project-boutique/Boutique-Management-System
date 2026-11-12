import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SaraRegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test001");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test002");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        boolean boolean13 = customer5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test003");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test004");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "hi!", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}");
        customer5.setActive(false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test005");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test006");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test007");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.toString();
        customer5.setEmail("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='', name='', email=''}" + "'", str10, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test008");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setActive(true);
        customer5.setPhone("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test009");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        java.lang.String str6 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='hi!', name='', email='hi!'}" + "'", str6, "Customer{id='hi!', name='', email='hi!'}");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test010");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        java.lang.String str11 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str11, "Customer{id='', name='hi!', email=''}");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test011");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.String str11 = customer5.toString();
        java.lang.String str12 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test012");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        customer5.setPhone("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test013");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.String str11 = customer5.toString();
        java.lang.String str12 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test014");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setFullName("Customer{id='hi!', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test015");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.getAddress();
        java.time.LocalDateTime localDateTime10 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test016");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.time.LocalDateTime localDateTime6 = customer5.getRegistrationDate();
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test017");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        java.lang.String str7 = customer5.getFullName();
        java.lang.Class<?> wildcardClass8 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test018");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test019");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("");
        customer5.setPhone("Customer{id='', name='', email=''}");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test020");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("");
        boolean boolean8 = customer5.isActive();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test021");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        java.lang.String str8 = customer5.getAddress();
        java.lang.String str9 = customer5.getEmail();
        java.lang.String str10 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test022");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setEmail("");
        java.lang.String str11 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test023");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "Customer{id='', name='hi!', email=''}", "hi!", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test024");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.Class<?> wildcardClass9 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test025");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='hi!', name='', email='hi!'}", "hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test026");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test027");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "hi!", "Customer{id='', name='', email='hi!'}");
        java.lang.String str6 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test028");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setActive(false);
        java.lang.String str12 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test029");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        customer5.setActive(true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test030");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        customer5.setEmail("hi!");
        java.lang.String str16 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test031");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email='hi!'}", "", "hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test032");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test033");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        java.lang.String str10 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='hi!', name='', email='hi!'}" + "'", str10, "Customer{id='hi!', name='', email='hi!'}");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test034");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        java.lang.String str10 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test035");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setPhone("Customer{id='', name='', email=''}");
        java.time.LocalDateTime localDateTime11 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test036");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "", "Customer{id='hi!', name='', email='hi!'}", "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test037");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        customer5.setPhone("hi!");
        boolean boolean8 = customer5.isActive();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test038");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email='hi!'}", "hi!", "", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}");
        java.time.LocalDateTime localDateTime6 = customer5.getRegistrationDate();
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test039");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}");
        customer5.setEmail("Customer{id='', name='', email=''}");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test040");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.String str11 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test041");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test042");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setFullName("Customer{id='', name='', email='hi!'}");
        customer5.setFullName("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test043");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        customer5.setPhone("hi!");
        java.lang.String str10 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test044");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test045");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        customer5.setFullName("hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test046");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test047");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        java.lang.String str7 = customer5.getPhone();
        java.lang.String str8 = customer5.toString();
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str9, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test048");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        java.lang.String str9 = customer5.toString();
        java.time.LocalDateTime localDateTime10 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str9, "Customer{id='', name='hi!', email=''}");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test049");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.String str11 = customer5.toString();
        customer5.setPhone("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test050");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "hi!");
        java.lang.String str6 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test051");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getPhone();
        java.lang.Class<?> wildcardClass11 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test052");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setPhone("Customer{id='', name='', email=''}");
        boolean boolean11 = customer5.isActive();
        customer5.setActive(false);
        customer5.setPhone("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test053");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.toString();
        java.lang.String str9 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test054");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setActive(false);
        customer5.setPhone("");
        java.time.LocalDateTime localDateTime14 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test055");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test056");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        customer5.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test057");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setFullName("Customer{id='hi!', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test058");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.lang.String str14 = customer5.getCustomerId();
        java.lang.String str15 = customer5.getAddress();
        java.lang.String str16 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test059");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        boolean boolean8 = customer5.isActive();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test060");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getFullName();
        java.lang.String str11 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test061");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        customer5.setEmail("Customer{id='', name='', email='hi!'}");
        boolean boolean11 = customer5.isActive();
        java.lang.String str12 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test062");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        boolean boolean10 = customer5.isActive();
        customer5.setFullName("");
        java.lang.String str13 = customer5.getEmail();
        java.lang.String str14 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Customer{id='', name='', email=''}" + "'", str14, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test063");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        java.lang.String str10 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test064");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        customer5.setEmail("Customer{id='', name='', email='hi!'}");
        java.lang.String str11 = customer5.getEmail();
        java.lang.Class<?> wildcardClass12 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str11, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test065");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        customer5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test066");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        boolean boolean8 = customer5.isActive();
        customer5.setActive(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test067");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.lang.String str14 = customer5.getCustomerId();
        java.lang.String str15 = customer5.getAddress();
        customer5.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test068");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.getAddress();
        java.lang.String str11 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str9, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test069");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "Customer{id='', name='', email='hi!'}", "hi!", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test070");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email=''}", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test071");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "hi!");
        customer5.setPhone("Customer{id='', name='hi!', email=''}");
        customer5.setAddress("Customer{id='hi!', name='', email='hi!'}");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test072");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        java.lang.String str10 = customer5.getFullName();
        customer5.setPhone("");
        java.lang.String str13 = customer5.getFullName();
        java.lang.Class<?> wildcardClass14 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test073");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='hi!', email=''}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "", "hi!");
        java.lang.String str6 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str6, "Customer{id='', name='hi!', email=''}");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test074");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        java.lang.String str7 = customer5.getPhone();
        java.lang.String str8 = customer5.toString();
        java.lang.String str9 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test075");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        customer5.setFullName("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test076");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        java.lang.String str8 = customer5.getAddress();
        java.lang.String str9 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test077");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "hi!");
        customer5.setPhone("Customer{id='', name='hi!', email=''}");
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test078");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setEmail("");
        customer5.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test079");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        boolean boolean8 = customer5.isActive();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test080");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.Class<?> wildcardClass12 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test081");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        customer5.setPhone("Customer{id='hi!', name='', email='hi!'}");
        java.time.LocalDateTime localDateTime10 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test082");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test083");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        boolean boolean6 = customer5.isActive();
        java.lang.String str7 = customer5.getAddress();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test084");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        customer5.setActive(true);
        java.lang.String str11 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test085");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.lang.String str6 = customer5.getFullName();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test086");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email='hi!'}", "", "", "Customer{id='', name='', email=''}");
        customer5.setAddress("");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test087");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setPhone("Customer{id='', name='', email=''}");
        boolean boolean11 = customer5.isActive();
        boolean boolean12 = customer5.isActive();
        java.lang.String str13 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test088");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}");
        customer5.setFullName("Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test089");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        boolean boolean10 = customer5.isActive();
        customer5.setFullName("");
        java.lang.String str13 = customer5.getEmail();
        java.lang.String str14 = customer5.getPhone();
        java.lang.String str15 = customer5.getFullName();
        customer5.setEmail("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test090");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        boolean boolean8 = customer5.isActive();
        boolean boolean9 = customer5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test091");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        java.lang.Class<?> wildcardClass6 = customer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test092");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.time.LocalDateTime localDateTime14 = customer5.getRegistrationDate();
        java.lang.String str15 = customer5.getFullName();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test093");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getFullName();
        java.lang.String str9 = customer5.getEmail();
        java.lang.String str10 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='hi!', name='', email='hi!'}" + "'", str10, "Customer{id='hi!', name='', email='hi!'}");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test094");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test095");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email=''}");
        customer5.setAddress("");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test096");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        customer5.setPhone("hi!");
        java.lang.String str10 = customer5.getFullName();
        java.lang.String str11 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='', name='', email=''}" + "'", str10, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test097");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        boolean boolean12 = customer5.isActive();
        customer5.setFullName("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test098");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        customer5.setPhone("Customer{id='', name='', email=''}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test099");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        customer5.setFullName("Customer{id='', name='hi!', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test100");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='hi!', name='', email='hi!'}", "", "hi!");
        boolean boolean6 = customer5.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test101");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.lang.String str14 = customer5.getFullName();
        customer5.setAddress("Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test102");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.lang.String str14 = customer5.getCustomerId();
        customer5.setEmail("");
        java.lang.String str17 = customer5.getFullName();
        customer5.setFullName("Customer{id='hi!', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test103");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getPhone();
        java.lang.String str9 = customer5.getEmail();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test104");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setActive(false);
        java.lang.String str11 = customer5.getFullName();
        java.time.LocalDateTime localDateTime12 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test105");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test106");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        java.lang.String str10 = customer5.getCustomerId();
        java.lang.String str11 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test107");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='hi!', email=''}", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email=''}");
        java.lang.String str6 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='', email=''}" + "'", str6, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test108");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getFullName();
        java.lang.String str8 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='hi!', name='', email=''}" + "'", str8, "Customer{id='hi!', name='', email=''}");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test109");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        java.lang.String str10 = customer5.getFullName();
        java.lang.String str11 = customer5.getEmail();
        java.lang.String str12 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test110");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        customer5.setPhone("Customer{id='', name='', email=''}");
        customer5.setEmail("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test111");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        customer5.setEmail("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test112");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email=''}");
        boolean boolean6 = customer5.isActive();
        java.lang.String str7 = customer5.getPhone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test113");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setActive(false);
        java.lang.String str11 = customer5.getFullName();
        customer5.setPhone("Customer{id='hi!', name='', email='hi!'}");
        java.time.LocalDateTime localDateTime14 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test114");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setActive(true);
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        java.lang.String str14 = customer5.getFullName();
        customer5.setPhone("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test115");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        customer5.setPhone("hi!");
        java.lang.String str10 = customer5.getCustomerId();
        java.lang.String str11 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test116");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setPhone("");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test117");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "hi!", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}");
        java.time.LocalDateTime localDateTime6 = customer5.getRegistrationDate();
        customer5.setFullName("");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test118");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}");
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test119");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        boolean boolean10 = customer5.isActive();
        customer5.setFullName("");
        java.lang.String str13 = customer5.getEmail();
        java.lang.String str14 = customer5.getPhone();
        java.lang.String str15 = customer5.getFullName();
        boolean boolean16 = customer5.isActive();
        java.time.LocalDateTime localDateTime17 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test120");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getAddress();
        java.time.LocalDateTime localDateTime7 = customer5.getRegistrationDate();
        customer5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test121");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='hi!', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test122");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        java.lang.String str8 = customer5.getFullName();
        java.lang.String str9 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email=''}" + "'", str8, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test123");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        java.lang.String str11 = customer5.getCustomerId();
        java.lang.String str12 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test124");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setFullName("Customer{id='', name='', email=''}");
        java.lang.String str12 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id='', name='', email=''}" + "'", str12, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test125");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getFullName();
        java.lang.Class<?> wildcardClass8 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test126");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        java.lang.String str10 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test127");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        customer5.setPhone("Customer{id='', name='', email=''}");
        customer5.setAddress("");
        java.time.LocalDateTime localDateTime13 = customer5.getRegistrationDate();
        java.time.LocalDateTime localDateTime14 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test128");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='hi!', name='', email='hi!'}", "", "hi!");
        java.lang.String str6 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test129");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.getAddress();
        customer5.setAddress("Customer{id='hi!', name='', email='hi!'}");
        java.lang.String str13 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str9, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test130");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        customer5.setPhone("Customer{id='', name='', email=''}");
        customer5.setAddress("Customer{id='', name='hi!', email=''}");
        java.lang.Class<?> wildcardClass13 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test131");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        java.lang.String str7 = customer5.getPhone();
        java.lang.String str8 = customer5.toString();
        customer5.setPhone("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test132");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setActive(false);
        java.lang.String str11 = customer5.getFullName();
        customer5.setPhone("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test133");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setFullName("Customer{id='hi!', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test134");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "hi!", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email=''}");
        java.time.LocalDateTime localDateTime6 = customer5.getRegistrationDate();
        java.lang.String str7 = customer5.getPhone();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test135");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        customer5.setActive(true);
        java.time.LocalDateTime localDateTime11 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test136");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email=''}");
        java.lang.String str6 = customer5.getEmail();
        java.lang.String str7 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str6, "Customer{id='', name='hi!', email=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Customer{id='', name='', email=''}" + "'", str7, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test137");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.String str11 = customer5.toString();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        java.lang.Class<?> wildcardClass14 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test138");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        boolean boolean7 = customer5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test139");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        customer5.setPhone("hi!");
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test140");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}");
        java.lang.String str6 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='', email=''}" + "'", str6, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test141");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        customer5.setEmail("hi!");
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.Class<?> wildcardClass9 = customer5.getClass();
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test142");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        java.lang.String str10 = customer5.getCustomerId();
        java.lang.String str11 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test143");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setActive(false);
        customer5.setAddress("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test144");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        customer5.setPhone("hi!");
        java.lang.String str8 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test145");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        customer5.setAddress("");
        customer5.setEmail("Customer{id='hi!', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test146");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        customer5.setPhone("hi!");
        java.lang.String str8 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test147");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setActive(false);
        java.lang.String str11 = customer5.getFullName();
        customer5.setPhone("Customer{id='hi!', name='', email='hi!'}");
        java.lang.String str14 = customer5.getAddress();
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test148");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        java.lang.String str9 = customer5.getFullName();
        java.lang.String str10 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test149");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setActive(true);
        customer5.setFullName("");
        java.lang.String str14 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime15 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test150");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email='hi!'}");
        customer5.setAddress("Customer{id='', name='hi!', email=''}");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test151");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        customer5.setActive(true);
        customer5.setEmail("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test152");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        customer5.setAddress("Customer{id='', name='', email='hi!'}");
        java.lang.String str10 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test153");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        customer5.setPhone("hi!");
        java.lang.String str10 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='hi!', name='Customer{id='', name='', email=''}', email='hi!'}" + "'", str10, "Customer{id='hi!', name='Customer{id='', name='', email=''}', email='hi!'}");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test154");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getCustomerId();
        customer5.setFullName("hi!");
        customer5.setActive(true);
        java.lang.String str11 = customer5.getCustomerId();
        java.lang.String str12 = customer5.getEmail();
        java.time.LocalDateTime localDateTime13 = customer5.getRegistrationDate();
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        customer5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test155");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.time.LocalDateTime localDateTime14 = customer5.getRegistrationDate();
        java.lang.String str15 = customer5.getFullName();
        java.lang.String str16 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test156");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.toString();
        java.lang.String str9 = customer5.getEmail();
        java.lang.String str10 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test157");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setPhone("Customer{id='', name='', email=''}");
        boolean boolean11 = customer5.isActive();
        java.lang.String str12 = customer5.getAddress();
        java.time.LocalDateTime localDateTime13 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test158");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        java.lang.String str10 = customer5.getFullName();
        customer5.setEmail("Customer{id='hi!', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test159");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        customer5.setAddress("Customer{id='hi!', name='Customer{id='', name='', email=''}', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test160");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        java.lang.String str7 = customer5.getPhone();
        java.lang.String str8 = customer5.toString();
        boolean boolean9 = customer5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test161");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getCustomerId();
        boolean boolean10 = customer5.isActive();
        customer5.setFullName("Customer{id='hi!', name='', email=''}");
        java.lang.String str13 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test162");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='hi!', email=''}", "Customer{id='hi!', name='', email=''}", "Customer{id='hi!', name='', email=''}", "Customer{id='hi!', name='', email=''}", "Customer{id='hi!', name='', email='hi!'}");
        java.lang.String str6 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='hi!', name='', email=''}" + "'", str6, "Customer{id='hi!', name='', email=''}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test163");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setActive(false);
        customer5.setAddress("Customer{id='', name='hi!', email=''}");
        customer5.setFullName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test164");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email=''}");
        java.lang.String str6 = customer5.getEmail();
        customer5.setAddress("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str6, "Customer{id='', name='hi!', email=''}");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test165");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='hi!', name='Customer{id='', name='', email=''}', email='hi!'}", "hi!", "Customer{id='', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test166");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.toString();
        java.lang.String str9 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str8, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test167");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        java.lang.String str9 = customer5.getAddress();
        java.time.LocalDateTime localDateTime10 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test168");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        java.lang.String str6 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test169");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        java.lang.String str8 = customer5.getFullName();
        java.lang.String str9 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Customer{id='', name='', email=''}" + "'", str8, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test170");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getAddress();
        java.lang.String str10 = customer5.getEmail();
        java.lang.Class<?> wildcardClass11 = customer5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test171");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        customer5.setEmail("hi!");
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        customer5.setEmail("");
        java.time.LocalDateTime localDateTime11 = customer5.getRegistrationDate();
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test172");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.toString();
        java.lang.String str11 = customer5.getAddress();
        java.lang.String str12 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='', name='', email=''}" + "'", str10, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test173");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        customer5.setFullName("");
        java.lang.String str8 = customer5.getEmail();
        java.time.LocalDateTime localDateTime9 = customer5.getRegistrationDate();
        customer5.setActive(true);
        customer5.setPhone("Customer{id='', name='', email='hi!'}");
        customer5.setEmail("hi!");
        customer5.setActive(false);
        java.lang.String str18 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str18, "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test174");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='', email=''}", "Customer{id='', name='hi!', email=''}", "", "Customer{id='', name='', email=''}");
        java.lang.String str6 = customer5.getEmail();
        java.lang.String str7 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='', name='hi!', email=''}" + "'", str6, "Customer{id='', name='hi!', email=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Customer{id='', name='', email=''}" + "'", str7, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test175");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setFullName("Customer{id='', name='', email='hi!'}");
        java.lang.String str12 = customer5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test176");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "Customer{id='', name='hi!', email=''}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test177");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        customer5.setPhone("Customer{id='', name='', email=''}");
        boolean boolean11 = customer5.isActive();
        customer5.setActive(true);
        java.lang.String str14 = customer5.getAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test178");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        customer5.setActive(false);
        customer5.setPhone("");
        java.lang.String str14 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test179");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        java.lang.String str14 = customer5.getCustomerId();
        customer5.setEmail("");
        customer5.setPhone("Customer{id='hi!', name='Customer{id='', name='', email=''}', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test180");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setFullName("Customer{id='', name='', email=''}");
        customer5.setPhone("hi!");
        java.lang.String str10 = customer5.getFullName();
        customer5.setActive(true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='', name='', email=''}" + "'", str10, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test181");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.getEmail();
        customer5.setActive(false);
        customer5.setFullName("Customer{id='hi!', name='', email='hi!'}");
        java.time.LocalDateTime localDateTime15 = customer5.getRegistrationDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test182");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        java.lang.String str10 = customer5.toString();
        customer5.setPhone("Customer{id='', name='hi!', email=''}");
        customer5.setAddress("Customer{id='hi!', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Customer{id='', name='', email=''}" + "'", str10, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test183");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        customer5.setPhone("Customer{id='', name='hi!', email=''}");
        java.lang.String str11 = customer5.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test184");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "hi!", "hi!", "");
        java.lang.String str6 = customer5.getPhone();
        customer5.setActive(false);
        customer5.setEmail("Customer{id='', name='', email='hi!'}");
        java.lang.String str11 = customer5.getEmail();
        java.lang.String str12 = customer5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str11, "Customer{id='', name='', email='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Customer{id='', name='', email='hi!'}" + "'", str12, "Customer{id='', name='', email='hi!'}");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test185");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        java.lang.String str13 = customer5.getPhone();
        customer5.setEmail("hi!");
        customer5.setAddress("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test186");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.lang.String str8 = customer5.getEmail();
        customer5.setActive(false);
        customer5.setAddress("Customer{id='', name='', email=''}");
        customer5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test187");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        java.time.LocalDateTime localDateTime8 = customer5.getRegistrationDate();
        java.lang.String str9 = customer5.getCustomerId();
        java.lang.String str10 = customer5.getFullName();
        java.lang.String str11 = customer5.toString();
        java.lang.String str12 = customer5.getFullName();
        java.lang.String str13 = customer5.getAddress();
        java.lang.String str14 = customer5.getPhone();
        customer5.setPhone("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Customer{id='', name='', email=''}" + "'", str11, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test188");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "hi!", "", "");
        customer5.setActive(true);
        java.lang.String str8 = customer5.getCustomerId();
        customer5.setPhone("Customer{id='', name='', email=''}");
        customer5.setAddress("");
        java.lang.String str13 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Customer{id='hi!', name='', email='hi!'}" + "'", str13, "Customer{id='hi!', name='', email='hi!'}");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test189");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='hi!', email=''}", "Customer{id='', name='', email=''}", "", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='', email=''}");
        java.lang.String str6 = customer5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Customer{id='Customer{id='', name='hi!', email=''}', name='Customer{id='', name='', email=''}', email=''}" + "'", str6, "Customer{id='Customer{id='', name='hi!', email=''}', name='Customer{id='', name='', email=''}', email=''}");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test190");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("hi!", "", "", "hi!", "");
        boolean boolean6 = customer5.isActive();
        customer5.setPhone("");
        java.lang.String str9 = customer5.getFullName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test191");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("", "", "", "", "");
        java.lang.String str6 = customer5.getFullName();
        java.lang.String str7 = customer5.getCustomerId();
        boolean boolean8 = customer5.isActive();
        java.lang.String str9 = customer5.toString();
        customer5.setPhone("");
        java.lang.String str12 = customer5.getPhone();
        customer5.setFullName("Customer{id='', name='', email=''}");
        java.lang.String str15 = customer5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Customer{id='', name='', email=''}" + "'", str9, "Customer{id='', name='', email=''}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Customer{id='', name='', email=''}" + "'", str15, "Customer{id='', name='', email=''}");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test192");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "Customer{id='hi!', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}");
        customer5.setActive(true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SaraRegressionTest0.test193");
        com.boutique.model.Customer customer5 = new com.boutique.model.Customer("Customer{id='', name='hi!', email=''}", "Customer{id='', name='', email=''}", "Customer{id='', name='', email='hi!'}", "Customer{id='', name='hi!', email=''}", "Customer{id='', name='hi!', email=''}");
    }
}

