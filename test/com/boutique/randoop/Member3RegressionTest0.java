package com.boutique.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Member3RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test001");
        com.boutique.service.PaymentService.PaymentResult paymentResult0 = com.boutique.service.PaymentService.PaymentResult.DECLINED;
        java.lang.Class<?> wildcardClass1 = paymentResult0.getClass();
        org.junit.Assert.assertTrue("'" + paymentResult0 + "' != '" + com.boutique.service.PaymentService.PaymentResult.DECLINED + "'", paymentResult0.equals(com.boutique.service.PaymentService.PaymentResult.DECLINED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test002");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test003");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.Class<?> wildcardClass8 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test004");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test005");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test006");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test007");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test008");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test009");
        com.boutique.service.PaymentService paymentService0 = new com.boutique.service.PaymentService();
        java.lang.Class<?> wildcardClass1 = paymentService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test010");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        double double6 = orderItem5.getUnitPrice();
        java.lang.Class<?> wildcardClass7 = orderItem5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test011");
        com.boutique.service.PaymentService.PaymentResult paymentResult0 = com.boutique.service.PaymentService.PaymentResult.APPROVED;
        org.junit.Assert.assertTrue("'" + paymentResult0 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult0.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test012");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test013");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test014");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test015");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = localDateTime6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test016");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test017");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test018");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test019");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getProofImagePath();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test020");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test021");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.Class<?> wildcardClass11 = order3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test022");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getSubtotal();
        java.lang.String str12 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test023");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout value is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test024");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test025");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test026");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("hi!");
        com.boutique.service.PaymentService.PaymentResult paymentResult7 = paymentService1.process("");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult7 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult7.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test027");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test028");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test029");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.lang.Class<?> wildcardClass9 = order3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test030");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test031");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test032");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "", (int) (short) 10, (double) ' ');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test033");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test034");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test035");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        java.lang.Class<?> wildcardClass7 = localDateTime6.getClass();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test036");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test037");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getDeliveryAddress();
        java.lang.Class<?> wildcardClass5 = order3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test038");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test039");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.lang.Class<?> wildcardClass9 = order3.getClass();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test040");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("hi!");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test041");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test042");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test043");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test044");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 10);
        java.lang.Class<?> wildcardClass2 = paymentService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test045");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.getAssignedCourierId();
        java.lang.String str21 = order3.getDeliveryAddress();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str21, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test046");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test047");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getUnitPrice();
        int int12 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test048");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test049");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", 100, (double) 100L);
        java.lang.String str6 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test050");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", 100, (double) 100L);
        java.lang.Class<?> wildcardClass6 = orderItem5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test051");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.lang.String str11 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test052");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        java.lang.String str5 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test053");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test054");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        java.lang.Class<?> wildcardClass6 = order3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test055");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setProofImagePath("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getOrderId();
        java.time.LocalDateTime localDateTime13 = order3.getTransactionDate();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test056");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test057");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        java.lang.String str6 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test058");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test059");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test060");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getProofImagePath();
        com.boutique.model.Order order9 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus10 = null;
        order9.setStatus(orderStatus10);
        java.time.LocalDateTime localDateTime12 = order9.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus13 = null;
        order9.setStatus(orderStatus13);
        order9.setDeliveryAddress("");
        order9.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        order9.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime21 = order9.getOrderDate();
        order3.setTransactionDate(localDateTime21);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test061");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test062");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test063");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str17 = order16.getOrderId();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus20 = order16.getStatus();
        order3.setStatus(orderStatus20);
        java.lang.String str22 = order3.toString();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + orderStatus20 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus20.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str22, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test064");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test065");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "hi!", "Order{id='hi!', customerId='hi!', status=CART}", (int) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass6 = orderItem5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test066");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test067");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str13 = order3.toString();
        java.time.LocalDateTime localDateTime14 = order3.getTransactionDate();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test068");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus9 = null;
        order8.setStatus(orderStatus9);
        java.time.LocalDateTime localDateTime11 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime11);
        java.lang.String str13 = order3.toString();
        com.boutique.enums.OrderStatus orderStatus14 = order3.getStatus();
        java.lang.String str15 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str13, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus14 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus14.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test069");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("hi!");
        com.boutique.service.PaymentService.PaymentResult paymentResult7 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult7 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult7.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test070");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test071");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.toString();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.lang.String str6 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str4, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test072");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getSubtotal();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test073");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.toString();
        java.lang.String str10 = orderItem5.getProductId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test074");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        order3.setDeliveryAddress("");
        java.lang.String str13 = order3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test075");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.lang.Class<?> wildcardClass15 = order3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test076");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        java.lang.String str11 = order3.getAssignedCourierId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test077");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.lang.String str9 = order3.getDeliveryAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test078");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.toString();
        java.lang.String str21 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test079");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus6 = order3.getStatus();
        com.boutique.model.Order order10 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus11 = null;
        order10.setStatus(orderStatus11);
        order10.setProofImagePath("");
        com.boutique.model.Order order18 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str19 = order18.getOrderId();
        order18.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus22 = order18.getStatus();
        order10.setStatus(orderStatus22);
        order3.setStatus(orderStatus22);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + orderStatus6 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus6.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + orderStatus22 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus22.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test080");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus14 = null;
        order13.setStatus(orderStatus14);
        java.time.LocalDateTime localDateTime16 = order13.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order13.setStatus(orderStatus17);
        java.lang.String str19 = order13.getOrderId();
        java.time.LocalDateTime localDateTime20 = order13.getOrderDate();
        order13.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order26 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str27 = order26.getOrderId();
        order26.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus30 = order26.getStatus();
        order13.setStatus(orderStatus30);
        order3.setStatus(orderStatus30);
        java.lang.String str33 = order3.getProofImagePath();
        order3.setDeliveryAddress("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + orderStatus30 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus30.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test081");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.toString();
        double double10 = orderItem5.getUnitPrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test082");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "hi!", "Order{id='hi!', customerId='hi!', status=CART}", (int) (byte) 0, 0.0d);
        double double6 = orderItem5.getSubtotal();
        double double7 = orderItem5.getUnitPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test083");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", (int) (byte) 100, (double) (byte) 100);
        java.lang.String str6 = orderItem5.toString();
        java.lang.String str7 = orderItem5.getProductId();
        java.lang.String str8 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}" + "'", str6, "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str7, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test084");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str13 = order3.getOrderId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test085");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str11 = order3.getOrderId();
        java.lang.String str12 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test086");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test087");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test088");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        double double6 = orderItem5.getUnitPrice();
        java.lang.String str7 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test089");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getCustomerId();
        com.boutique.model.Order order12 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str13 = order12.getAssignedCourierId();
        java.time.LocalDateTime localDateTime14 = order12.getOrderDate();
        order3.setTransactionDate(localDateTime14);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test090");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        int int9 = orderItem5.getQuantity();
        orderItem5.setQuantity((int) (short) 0);
        orderItem5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test091");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", (int) (short) -1, (double) (short) 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test092");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) '#');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test093");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getUnitPrice();
        java.lang.String str12 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}" + "'", str12, "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test094");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        java.lang.String str13 = order3.getOrderId();
        java.time.LocalDateTime localDateTime14 = order3.getTransactionDate();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test095");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test096");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.toString();
        double double10 = orderItem5.getUnitPrice();
        java.lang.String str11 = orderItem5.getProductId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test097");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "", (int) (short) 10, (double) (byte) 10);
        orderItem5.setQuantity(0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test098");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        int int9 = orderItem5.getQuantity();
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str12 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str12, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test099");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test100");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDateTime12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test101");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getProofImagePath();
        java.lang.String str6 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test102");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=CART}", (int) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test103");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test104");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test105");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test106");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        com.boutique.model.Order order10 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus11 = null;
        order10.setStatus(orderStatus11);
        java.time.LocalDateTime localDateTime13 = order10.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus14 = null;
        order10.setStatus(orderStatus14);
        order10.setDeliveryAddress("");
        java.lang.String str18 = order10.getAssignedCourierId();
        java.time.LocalDateTime localDateTime19 = order10.getTransactionDate();
        com.boutique.model.Order order23 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus24 = null;
        order23.setStatus(orderStatus24);
        java.time.LocalDateTime localDateTime26 = order23.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus27 = null;
        order23.setStatus(orderStatus27);
        order23.setProofImagePath("");
        java.lang.String str31 = order23.getDeliveryAddress();
        order23.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order37 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str38 = order37.getProofImagePath();
        com.boutique.model.Order order42 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus43 = null;
        order42.setStatus(orderStatus43);
        java.time.LocalDateTime localDateTime45 = order42.getOrderDate();
        order37.setTransactionDate(localDateTime45);
        java.lang.String str47 = order37.toString();
        com.boutique.enums.OrderStatus orderStatus48 = order37.getStatus();
        order23.setStatus(orderStatus48);
        order10.setStatus(orderStatus48);
        order3.setStatus(orderStatus48);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str47, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus48 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus48.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test107");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getSubtotal();
        java.lang.String str12 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}" + "'", str12, "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test108");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        java.lang.Class<?> wildcardClass4 = paymentResult3.getClass();
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test109");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test110");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test111");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus9 = null;
        order8.setStatus(orderStatus9);
        java.time.LocalDateTime localDateTime11 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime11);
        java.lang.String str13 = order3.getDeliveryAddress();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test112");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        java.lang.String str10 = orderItem5.getProductId();
        orderItem5.setQuantity((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test113");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test114");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        com.boutique.model.Order order12 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str13 = order12.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus14 = order12.getStatus();
        order3.setStatus(orderStatus14);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus14 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus14.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test115");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getUnitPrice();
        orderItem5.setQuantity((-1));
        int int14 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test116");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime8 = order3.getOrderDate();
        java.lang.String str9 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test117");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus13 = order3.getStatus();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + orderStatus13 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus13.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test118");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", 100, (double) 100L);
        double double6 = orderItem5.getSubtotal();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10000.0d + "'", double6 == 10000.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test119");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test120");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "Order{id='', customerId='hi!', status=null}", "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test121");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus14 = null;
        order13.setStatus(orderStatus14);
        java.time.LocalDateTime localDateTime16 = order13.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order13.setStatus(orderStatus17);
        java.lang.String str19 = order13.getOrderId();
        java.time.LocalDateTime localDateTime20 = order13.getOrderDate();
        order13.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order26 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str27 = order26.getOrderId();
        order26.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus30 = order26.getStatus();
        order13.setStatus(orderStatus30);
        order3.setStatus(orderStatus30);
        java.lang.String str33 = order3.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus34 = order3.getStatus();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + orderStatus30 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus30.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + orderStatus34 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus34.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test122");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getItemId();
        int int11 = orderItem5.getQuantity();
        java.lang.String str12 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test123");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        java.lang.String str7 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test124");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test125");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test126");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test127");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        com.boutique.enums.OrderStatus orderStatus9 = order3.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(orderStatus9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test128");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getProductId();
        java.lang.String str13 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test129");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        orderItem5.setQuantity(0);
        java.lang.String str14 = orderItem5.getItemId();
        java.lang.String str15 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test130");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        double double11 = orderItem5.getUnitPrice();
        orderItem5.setQuantity((-1));
        java.lang.String str14 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test131");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.lang.String str6 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test132");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        double double10 = orderItem5.getUnitPrice();
        java.lang.String str11 = orderItem5.getProductId();
        double double12 = orderItem5.getSubtotal();
        orderItem5.setQuantity((int) '4');
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test133");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus14 = null;
        order13.setStatus(orderStatus14);
        java.time.LocalDateTime localDateTime16 = order13.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order13.setStatus(orderStatus17);
        java.lang.String str19 = order13.getOrderId();
        java.time.LocalDateTime localDateTime20 = order13.getOrderDate();
        order13.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order26 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str27 = order26.getOrderId();
        order26.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus30 = order26.getStatus();
        order13.setStatus(orderStatus30);
        order3.setStatus(orderStatus30);
        java.lang.Class<?> wildcardClass33 = orderStatus30.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + orderStatus30 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus30.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test134");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        orderItem5.setQuantity((int) (short) 10);
        double double14 = orderItem5.getUnitPrice();
        double double15 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test135");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        com.boutique.enums.OrderStatus orderStatus6 = order3.getStatus();
        order3.setAssignedCourierId("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + orderStatus6 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus6.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test136");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.toString();
        orderItem5.setQuantity(10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test137");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        int int10 = orderItem5.getQuantity();
        java.lang.String str11 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test138");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getOrderId();
        order14.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus18 = null;
        order14.setStatus(orderStatus18);
        com.boutique.model.Order order23 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str24 = order23.getOrderId();
        order23.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus27 = order23.getStatus();
        order14.setStatus(orderStatus27);
        order3.setStatus(orderStatus27);
        order3.setAssignedCourierId("");
        java.time.LocalDateTime localDateTime32 = order3.getTransactionDate();
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + orderStatus27 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus27.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(localDateTime32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test139");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test140");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        order3.setAssignedCourierId("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test141");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.toString();
        java.lang.String str10 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test142");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        double double12 = orderItem5.getUnitPrice();
        double double13 = orderItem5.getSubtotal();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test143");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        double double12 = orderItem5.getSubtotal();
        double double13 = orderItem5.getUnitPrice();
        double double14 = orderItem5.getSubtotal();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test144");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test145");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.Class<?> wildcardClass7 = order3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test146");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.getProductId();
        java.lang.String str10 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test147");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setProofImagePath("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.toString();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str12, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test148");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        java.lang.String str13 = order3.getOrderId();
        java.time.LocalDateTime localDateTime14 = order3.getTransactionDate();
        com.boutique.enums.OrderStatus orderStatus15 = order3.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(orderStatus15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test149");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test150");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        java.lang.String str11 = order3.toString();
        com.boutique.model.Order order15 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str16 = order15.getOrderId();
        order15.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus19 = null;
        order15.setStatus(orderStatus19);
        java.lang.String str21 = order15.toString();
        java.time.LocalDateTime localDateTime22 = order15.getOrderDate();
        order3.setTransactionDate(localDateTime22);
        java.lang.String str24 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str11, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str21, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test151");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str13 = order3.toString();
        com.boutique.model.Order order17 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str18 = order17.getOrderId();
        order17.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        order17.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus23 = order17.getStatus();
        order3.setStatus(orderStatus23);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str13, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + orderStatus23 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus23.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test152");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test153");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test154");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test155");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) -1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test156");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        com.boutique.service.PaymentService.PaymentResult paymentResult7 = paymentService1.process("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult9 = paymentService1.process("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult11 = paymentService1.process("hi!");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult7 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult7.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult9 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult9.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult11 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult11.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test157");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        order3.setAssignedCourierId("hi!");
        java.lang.String str8 = order3.toString();
        java.lang.Class<?> wildcardClass9 = order3.getClass();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str8, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test158");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        com.boutique.model.Order order12 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str13 = order12.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus14 = order12.getStatus();
        order3.setStatus(orderStatus14);
        java.lang.String str16 = order3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus14 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus14.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str16, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test159");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "");
        order3.setAssignedCourierId("hi!");
        java.lang.String str6 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test160");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "Order{id='', customerId='hi!', status=CART}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", (int) (short) 1, (double) 32);
        java.lang.String str6 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str6, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test161");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.toString();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str11, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test162");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}", (int) (short) 0, 1.0d);
        java.lang.String str6 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test163");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        double double12 = orderItem5.getSubtotal();
        java.lang.String str13 = orderItem5.getProductId();
        orderItem5.setQuantity((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test164");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getDeliveryAddress();
        java.lang.String str13 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test165");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test166");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus10 = order3.getStatus();
        java.lang.String str11 = order3.getCustomerId();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(orderStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test167");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        orderItem5.setQuantity((-1));
        double double12 = orderItem5.getSubtotal();
        java.lang.String str13 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0d) + "'", double12 == (-0.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test168");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "hi!", "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test169");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.lang.String str5 = order3.getAssignedCourierId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test170");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        java.lang.String str6 = order3.getDeliveryAddress();
        java.lang.String str7 = order3.getDeliveryAddress();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str7, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test171");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getOrderId();
        order14.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus18 = null;
        order14.setStatus(orderStatus18);
        com.boutique.model.Order order23 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str24 = order23.getOrderId();
        order23.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus27 = order23.getStatus();
        order14.setStatus(orderStatus27);
        order3.setStatus(orderStatus27);
        com.boutique.model.Order order33 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str34 = order33.getProofImagePath();
        order33.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime37 = order33.getOrderDate();
        java.lang.String str38 = order33.getDeliveryAddress();
        order33.setAssignedCourierId("");
        order33.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus43 = order33.getStatus();
        order3.setStatus(orderStatus43);
        com.boutique.enums.OrderStatus orderStatus45 = order3.getStatus();
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + orderStatus27 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus27.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + orderStatus43 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus43.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertTrue("'" + orderStatus45 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus45.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test172");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=null}", "hi!", (int) (byte) 0, (double) '#');
        java.lang.String str6 = orderItem5.toString();
        int int7 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test173");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getCustomerId();
        java.lang.String str13 = order3.getDeliveryAddress();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test174");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order16.setStatus(orderStatus17);
        java.time.LocalDateTime localDateTime19 = order16.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus20 = null;
        order16.setStatus(orderStatus20);
        order16.setProofImagePath("");
        java.lang.String str24 = order16.getDeliveryAddress();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order30 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str31 = order30.getProofImagePath();
        com.boutique.model.Order order35 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus36 = null;
        order35.setStatus(orderStatus36);
        java.time.LocalDateTime localDateTime38 = order35.getOrderDate();
        order30.setTransactionDate(localDateTime38);
        java.lang.String str40 = order30.toString();
        com.boutique.enums.OrderStatus orderStatus41 = order30.getStatus();
        order16.setStatus(orderStatus41);
        order3.setStatus(orderStatus41);
        com.boutique.model.Order order47 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus48 = null;
        order47.setStatus(orderStatus48);
        java.lang.String str50 = order47.getCustomerId();
        com.boutique.model.Order order54 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str55 = order54.getProofImagePath();
        order54.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime58 = order54.getOrderDate();
        java.lang.String str59 = order54.getProofImagePath();
        order54.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.time.LocalDateTime localDateTime62 = order54.getOrderDate();
        order47.setTransactionDate(localDateTime62);
        order3.setTransactionDate(localDateTime62);
        java.lang.String str65 = order3.toString();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str40, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus41 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus41.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str65, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test175");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus13 = order3.getStatus();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNull(orderStatus13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test176");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        orderItem5.setQuantity((-1));
        double double12 = orderItem5.getSubtotal();
        java.lang.Class<?> wildcardClass13 = orderItem5.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0d) + "'", double12 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test177");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardholderName("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test178");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus9 = order3.getStatus();
        java.time.LocalDateTime localDateTime10 = order3.getTransactionDate();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(orderStatus9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test179");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str9 = order8.getProofImagePath();
        order8.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime12 = order8.getOrderDate();
        java.time.LocalDateTime localDateTime13 = order8.getTransactionDate();
        java.time.LocalDateTime localDateTime14 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime14);
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test180");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        java.lang.String str13 = order3.getProofImagePath();
        java.lang.String str14 = order3.getDeliveryAddress();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test181");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test182");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test183");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getItemId();
        int int11 = orderItem5.getQuantity();
        double double12 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test184");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        java.lang.String str6 = order3.toString();
        java.lang.String str7 = order3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str6, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str7, "Order{id='hi!', customerId='hi!', status=CART}");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test185");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        int int10 = orderItem5.getQuantity();
        int int11 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test186");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getCustomerId();
        java.lang.String str9 = order3.getDeliveryAddress();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test187");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus9 = order3.getStatus();
        order3.setProofImagePath("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(orderStatus9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test188");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getAssignedCourierId();
        order3.setProofImagePath("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test189");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.lang.String str9 = order3.getAssignedCourierId();
        java.lang.String str10 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test190");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.toString();
        double double10 = orderItem5.getSubtotal();
        double double11 = orderItem5.getUnitPrice();
        orderItem5.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test191");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        java.lang.String str6 = order3.getDeliveryAddress();
        java.lang.String str7 = order3.getProofImagePath();
        java.lang.String str8 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test192");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=null}", "hi!", (int) (byte) 0, (double) '#');
        java.lang.String str6 = orderItem5.getProductId();
        java.lang.String str7 = orderItem5.toString();
        int int8 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}" + "'", str7, "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test193");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 32);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test194");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.lang.String str9 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test195");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}", (int) (short) 0, 1.0d);
        java.lang.String str6 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test196");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        double double10 = orderItem5.getSubtotal();
        int int11 = orderItem5.getQuantity();
        java.lang.String str12 = orderItem5.getOrderId();
        double double13 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test197");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "hi!", (int) 'a', (double) (byte) 1);
        double double6 = orderItem5.getSubtotal();
        double double7 = orderItem5.getUnitPrice();
        orderItem5.setQuantity((int) (byte) -1);
        java.lang.String str10 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str10, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test198");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.toString();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.lang.String str6 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str4, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test199");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test200");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getCustomerId();
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus13 = null;
        order12.setStatus(orderStatus13);
        java.time.LocalDateTime localDateTime15 = order12.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus16 = null;
        order12.setStatus(orderStatus16);
        order12.setDeliveryAddress("");
        java.lang.String str20 = order12.getAssignedCourierId();
        java.time.LocalDateTime localDateTime21 = order12.getTransactionDate();
        com.boutique.model.Order order25 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus26 = null;
        order25.setStatus(orderStatus26);
        java.time.LocalDateTime localDateTime28 = order25.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus29 = null;
        order25.setStatus(orderStatus29);
        order25.setProofImagePath("");
        java.lang.String str33 = order25.getDeliveryAddress();
        order25.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order39 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str40 = order39.getProofImagePath();
        com.boutique.model.Order order44 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus45 = null;
        order44.setStatus(orderStatus45);
        java.time.LocalDateTime localDateTime47 = order44.getOrderDate();
        order39.setTransactionDate(localDateTime47);
        java.lang.String str49 = order39.toString();
        com.boutique.enums.OrderStatus orderStatus50 = order39.getStatus();
        order25.setStatus(orderStatus50);
        order12.setStatus(orderStatus50);
        order3.setStatus(orderStatus50);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str49, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus50 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus50.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test201");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime13 = order3.getOrderDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test202");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(0L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("hi!");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test203");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getCustomerId();
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str13 = order12.getOrderId();
        com.boutique.model.Order order17 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str18 = order17.getProofImagePath();
        order17.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime21 = order17.getOrderDate();
        java.time.LocalDateTime localDateTime22 = order17.getTransactionDate();
        java.time.LocalDateTime localDateTime23 = order17.getOrderDate();
        order12.setTransactionDate(localDateTime23);
        order3.setTransactionDate(localDateTime23);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test204");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "hi!", (int) 'a', (double) (byte) 1);
        double double6 = orderItem5.getSubtotal();
        orderItem5.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test205");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.lang.String str6 = order3.toString();
        order3.setAssignedCourierId("hi!");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str6, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test206");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.lang.Class<?> wildcardClass5 = order3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test207");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", 100, (double) 100L);
        java.lang.String str6 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test208");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        java.lang.String str11 = order3.getDeliveryAddress();
        com.boutique.enums.OrderStatus orderStatus12 = order3.getStatus();
        java.time.LocalDateTime localDateTime13 = order3.getTransactionDate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + orderStatus12 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus12.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test209");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.getOrderId();
        double double10 = orderItem5.getUnitPrice();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test210");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test211");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getAssignedCourierId();
        java.lang.String str9 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test212");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str11 = order3.getAssignedCourierId();
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test213");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='', customerId='hi!', status=CART}", "Order{id='hi!', customerId='hi!', status=CART}", "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test214");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.toString();
        java.lang.String str10 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test215");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime11 = order3.getTransactionDate();
        java.lang.String str12 = order3.getOrderId();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test216");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.enums.OrderStatus orderStatus11 = order3.getStatus();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertNull(orderStatus11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test217");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus9 = null;
        order8.setStatus(orderStatus9);
        java.time.LocalDateTime localDateTime11 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime11);
        java.lang.String str13 = order3.getAssignedCourierId();
        java.lang.Class<?> wildcardClass14 = order3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test218");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.lang.String str7 = order3.getOrderId();
        com.boutique.model.Order order11 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str12 = order11.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus13 = order11.getStatus();
        order3.setStatus(orderStatus13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + orderStatus13 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus13.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test219");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 97);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test220");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("");
        order3.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test221");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order16.setStatus(orderStatus17);
        java.time.LocalDateTime localDateTime19 = order16.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus20 = null;
        order16.setStatus(orderStatus20);
        order16.setProofImagePath("");
        java.lang.String str24 = order16.getDeliveryAddress();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order30 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str31 = order30.getProofImagePath();
        com.boutique.model.Order order35 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus36 = null;
        order35.setStatus(orderStatus36);
        java.time.LocalDateTime localDateTime38 = order35.getOrderDate();
        order30.setTransactionDate(localDateTime38);
        java.lang.String str40 = order30.toString();
        com.boutique.enums.OrderStatus orderStatus41 = order30.getStatus();
        order16.setStatus(orderStatus41);
        order3.setStatus(orderStatus41);
        com.boutique.model.Order order47 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus48 = null;
        order47.setStatus(orderStatus48);
        java.lang.String str50 = order47.getCustomerId();
        com.boutique.model.Order order54 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str55 = order54.getProofImagePath();
        order54.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime58 = order54.getOrderDate();
        java.lang.String str59 = order54.getProofImagePath();
        order54.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.time.LocalDateTime localDateTime62 = order54.getOrderDate();
        order47.setTransactionDate(localDateTime62);
        order3.setTransactionDate(localDateTime62);
        order3.setAssignedCourierId("");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str40, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus41 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus41.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(localDateTime62);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test222");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str13 = order3.getAssignedCourierId();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test223");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test224");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=CART}");
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str14 = order13.getProofImagePath();
        java.lang.String str15 = order13.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus16 = order13.getStatus();
        order3.setStatus(orderStatus16);
        java.lang.String str18 = order3.getCustomerId();
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + orderStatus16 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus16.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test225");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime11 = order3.getTransactionDate();
        java.lang.String str12 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test226");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=null}", "hi!", (int) (byte) 0, (double) '#');
        java.lang.String str6 = orderItem5.getProductId();
        java.lang.String str7 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str7, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test227");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getCustomerId();
        java.lang.String str13 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test228");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order16.setStatus(orderStatus17);
        java.time.LocalDateTime localDateTime19 = order16.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus20 = null;
        order16.setStatus(orderStatus20);
        order16.setProofImagePath("");
        java.lang.String str24 = order16.getDeliveryAddress();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order30 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str31 = order30.getProofImagePath();
        com.boutique.model.Order order35 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus36 = null;
        order35.setStatus(orderStatus36);
        java.time.LocalDateTime localDateTime38 = order35.getOrderDate();
        order30.setTransactionDate(localDateTime38);
        java.lang.String str40 = order30.toString();
        com.boutique.enums.OrderStatus orderStatus41 = order30.getStatus();
        order16.setStatus(orderStatus41);
        order3.setStatus(orderStatus41);
        com.boutique.enums.OrderStatus orderStatus44 = order3.getStatus();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str40, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus41 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus41.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertTrue("'" + orderStatus44 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus44.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test229");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.getItemId();
        double double10 = orderItem5.getSubtotal();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test230");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        order3.setProofImagePath("");
        java.lang.String str13 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test231");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "hi!", (int) 'a', (double) (byte) 1);
        double double6 = orderItem5.getSubtotal();
        int int7 = orderItem5.getQuantity();
        java.lang.String str8 = orderItem5.getProductId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test232");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus15 = order3.getStatus();
        com.boutique.model.Order order19 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str20 = order19.getOrderId();
        order19.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus23 = order19.getStatus();
        order3.setStatus(orderStatus23);
        java.time.LocalDateTime localDateTime25 = order3.getOrderDate();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(orderStatus15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + orderStatus23 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus23.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test233");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus14 = null;
        order13.setStatus(orderStatus14);
        java.time.LocalDateTime localDateTime16 = order13.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order13.setStatus(orderStatus17);
        java.lang.String str19 = order13.getOrderId();
        java.time.LocalDateTime localDateTime20 = order13.getOrderDate();
        order13.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order26 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str27 = order26.getOrderId();
        order26.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus30 = order26.getStatus();
        order13.setStatus(orderStatus30);
        order3.setStatus(orderStatus30);
        java.lang.String str33 = order3.getProofImagePath();
        java.lang.String str34 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + orderStatus30 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus30.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test234");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus9 = null;
        order8.setStatus(orderStatus9);
        java.time.LocalDateTime localDateTime11 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime11);
        java.lang.String str13 = order3.getAssignedCourierId();
        com.boutique.enums.OrderStatus orderStatus14 = order3.getStatus();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + orderStatus14 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus14.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test235");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity(100);
        double double10 = orderItem5.getSubtotal();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test236");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("hi!");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str6, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test237");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getProductId();
        double double13 = orderItem5.getSubtotal();
        orderItem5.setQuantity((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test238");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getItemId();
        java.lang.String str11 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test239");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        java.lang.String str6 = order3.toString();
        com.boutique.model.Order order10 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str11 = order10.getProofImagePath();
        order10.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime14 = order10.getOrderDate();
        java.time.LocalDateTime localDateTime15 = order10.getTransactionDate();
        java.time.LocalDateTime localDateTime16 = order10.getOrderDate();
        order3.setTransactionDate(localDateTime16);
        java.lang.String str18 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str6, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test240");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        java.lang.String str10 = order3.getAssignedCourierId();
        java.lang.String str11 = order3.getCustomerId();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test241");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str9 = order8.getProofImagePath();
        java.time.LocalDateTime localDateTime10 = order8.getTransactionDate();
        java.lang.String str11 = order8.toString();
        com.boutique.model.Order order15 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str16 = order15.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus17 = order15.getStatus();
        order8.setStatus(orderStatus17);
        order3.setStatus(orderStatus17);
        java.lang.String str20 = order3.getCustomerId();
        java.lang.Class<?> wildcardClass21 = order3.getClass();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str11, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + orderStatus17 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus17.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test242");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus10 = order3.getStatus();
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        java.lang.String str13 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(orderStatus10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test243");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order16.setStatus(orderStatus17);
        java.time.LocalDateTime localDateTime19 = order16.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus20 = null;
        order16.setStatus(orderStatus20);
        order16.setProofImagePath("");
        java.lang.String str24 = order16.getDeliveryAddress();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order30 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str31 = order30.getProofImagePath();
        com.boutique.model.Order order35 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus36 = null;
        order35.setStatus(orderStatus36);
        java.time.LocalDateTime localDateTime38 = order35.getOrderDate();
        order30.setTransactionDate(localDateTime38);
        java.lang.String str40 = order30.toString();
        com.boutique.enums.OrderStatus orderStatus41 = order30.getStatus();
        order16.setStatus(orderStatus41);
        order3.setStatus(orderStatus41);
        com.boutique.model.Order order47 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus48 = null;
        order47.setStatus(orderStatus48);
        java.lang.String str50 = order47.getCustomerId();
        com.boutique.model.Order order54 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str55 = order54.getProofImagePath();
        order54.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime58 = order54.getOrderDate();
        java.lang.String str59 = order54.getProofImagePath();
        order54.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.time.LocalDateTime localDateTime62 = order54.getOrderDate();
        order47.setTransactionDate(localDateTime62);
        order3.setTransactionDate(localDateTime62);
        java.lang.String str65 = order3.getOrderId();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str40, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus41 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus41.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test244");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setProofImagePath("Order{id='hi!', customerId='hi!', status=CART}");
        java.lang.String str11 = order3.getProofImagePath();
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str11, "Order{id='hi!', customerId='hi!', status=CART}");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test245");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test246");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCardNumber("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test247");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test248");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "hi!", "Order{id='hi!', customerId='hi!', status=CART}", (int) (byte) 0, 0.0d);
        double double6 = orderItem5.getUnitPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test249");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        com.boutique.enums.OrderStatus orderStatus6 = order3.getStatus();
        java.lang.String str7 = order3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + orderStatus6 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus6.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str7, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test250");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        com.boutique.enums.OrderStatus orderStatus7 = order3.getStatus();
        java.lang.String str8 = order3.getProofImagePath();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(orderStatus7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test251");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "hi!", (int) 'a', (double) (byte) 1);
        double double6 = orderItem5.getUnitPrice();
        java.lang.String str7 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str7, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test252");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        double double6 = orderItem5.getSubtotal();
        java.lang.String str7 = orderItem5.getOrderId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test253");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setProofImagePath("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getOrderId();
        com.boutique.enums.OrderStatus orderStatus13 = order3.getStatus();
        order3.setDeliveryAddress("hi!");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(orderStatus13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test254");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        int int11 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test255");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "Order{id='hi!', customerId='hi!', status=CART}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getDeliveryAddress();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus9 = null;
        order8.setStatus(orderStatus9);
        java.time.LocalDateTime localDateTime11 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str4, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test256");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        java.lang.String str6 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test257");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}", "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}", 100, (double) '4');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test258");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getAssignedCourierId();
        java.lang.String str13 = order3.getProofImagePath();
        java.lang.String str14 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test259");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "");
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        order3.setProofImagePath("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test260");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 100);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("hi!");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test261");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        java.lang.String str10 = order3.getAssignedCourierId();
        order3.setProofImagePath("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test262");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        java.lang.String str6 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test263");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='hi!', customerId='hi!', status=CART}", "", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test264");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getSubtotal();
        int int10 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test265");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        order3.setAssignedCourierId("hi!");
        java.lang.String str8 = order3.toString();
        java.lang.String str9 = order3.getAssignedCourierId();
        order3.setProofImagePath("hi!");
        order3.setProofImagePath("Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str8, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test266");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        order3.setAssignedCourierId("hi!");
        java.lang.String str8 = order3.toString();
        java.lang.String str9 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str8, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test267");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getProofImagePath();
        java.lang.Class<?> wildcardClass6 = order3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test268");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + orderStatus8 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus8.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test269");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.getAssignedCourierId();
        order3.setProofImagePath("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test270");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", (int) (byte) 100, (double) (byte) 100);
        java.lang.String str6 = orderItem5.toString();
        java.lang.String str7 = orderItem5.getProductId();
        orderItem5.setQuantity((int) (byte) 1);
        int int10 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}" + "'", str6, "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str7, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test271");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        double double10 = orderItem5.getSubtotal();
        double double11 = orderItem5.getUnitPrice();
        java.lang.String str12 = orderItem5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str12, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test272");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}", (int) (byte) 100, 10000.0d);
        java.lang.String str6 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test273");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=null}", "hi!", (int) (byte) 0, (double) '#');
        java.lang.String str6 = orderItem5.toString();
        java.lang.String str7 = orderItem5.getItemId();
        java.lang.String str8 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str7, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test274");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.lang.String str5 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test275");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateCVV("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test276");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        orderItem5.setQuantity((-1));
        java.lang.String str12 = orderItem5.getOrderId();
        int int13 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test277");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=CART}");
        java.lang.String str4 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test278");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (byte) 1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test279");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        order3.setAssignedCourierId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test280");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.toString();
        com.boutique.model.Order order24 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus25 = null;
        order24.setStatus(orderStatus25);
        java.time.LocalDateTime localDateTime27 = order24.getTransactionDate();
        order24.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order33 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str34 = order33.getAssignedCourierId();
        java.time.LocalDateTime localDateTime35 = order33.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus36 = order33.getStatus();
        order24.setStatus(orderStatus36);
        order3.setStatus(orderStatus36);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + orderStatus36 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus36.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test281");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}", "hi!", 10, 10000.0d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test282");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.lang.String str9 = order3.getAssignedCourierId();
        java.lang.String str10 = order3.toString();
        java.time.LocalDateTime localDateTime11 = order3.getOrderDate();
        java.lang.String str12 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str10, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test283");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test284");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        order3.setAssignedCourierId("");
        java.lang.String str13 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(orderStatus8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str13, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test285");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.lang.String str6 = order3.toString();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        order3.setProofImagePath("hi!");
        java.time.LocalDateTime localDateTime11 = order3.getOrderDate();
        java.lang.String str12 = order3.getCustomerId();
        java.lang.Class<?> wildcardClass13 = order3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str6, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test286");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", (int) (byte) 100, (double) (byte) 100);
        double double6 = orderItem5.getUnitPrice();
        java.lang.String str7 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}" + "'", str7, "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test287");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        java.lang.String str6 = order3.getDeliveryAddress();
        order3.setProofImagePath("OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test288");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test289");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", (int) (byte) 100, (double) (byte) 100);
        int int6 = orderItem5.getQuantity();
        int int7 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test290");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.lang.String str7 = order3.getAssignedCourierId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test291");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        double double8 = orderItem5.getUnitPrice();
        orderItem5.setQuantity((int) '#');
        java.lang.Class<?> wildcardClass11 = orderItem5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test292");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus13 = null;
        order12.setStatus(orderStatus13);
        java.time.LocalDateTime localDateTime15 = order12.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus16 = null;
        order12.setStatus(orderStatus16);
        order12.setDeliveryAddress("");
        order12.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        order12.setAssignedCourierId("Order{id='', customerId='hi!', status=CART}");
        java.time.LocalDateTime localDateTime24 = order12.getOrderDate();
        order3.setTransactionDate(localDateTime24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test293");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "hi!", (int) 'a', (double) (byte) 1);
        double double6 = orderItem5.getUnitPrice();
        int int7 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test294");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.lang.String str9 = order3.getAssignedCourierId();
        java.lang.String str10 = order3.toString();
        java.time.LocalDateTime localDateTime11 = order3.getTransactionDate();
        java.lang.String str12 = order3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str10, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str12, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test295");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "hi!", "");
        com.boutique.model.Order order7 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str8 = order7.getProofImagePath();
        java.lang.String str9 = order7.getProofImagePath();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str14 = order13.getProofImagePath();
        com.boutique.model.Order order18 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus19 = null;
        order18.setStatus(orderStatus19);
        java.time.LocalDateTime localDateTime21 = order18.getOrderDate();
        order13.setTransactionDate(localDateTime21);
        order7.setTransactionDate(localDateTime21);
        order3.setTransactionDate(localDateTime21);
        java.lang.String str25 = order3.getDeliveryAddress();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test296");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.getAssignedCourierId();
        java.lang.String str21 = order3.getAssignedCourierId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test297");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        double double8 = orderItem5.getSubtotal();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test298");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getOrderId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test299");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getCustomerId();
        java.lang.String str9 = order3.getOrderId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test300");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus8 = null;
        order3.setStatus(orderStatus8);
        order3.setAssignedCourierId("hi!");
        java.lang.String str12 = order3.getCustomerId();
        java.lang.String str13 = order3.getProofImagePath();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test301");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getProductId();
        double double13 = orderItem5.getSubtotal();
        int int14 = orderItem5.getQuantity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test302");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        double double6 = orderItem5.getUnitPrice();
        double double7 = orderItem5.getSubtotal();
        double double8 = orderItem5.getUnitPrice();
        int int9 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test303");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.lang.String str7 = order3.getCustomerId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test304");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str13 = order12.getProofImagePath();
        order12.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime16 = order12.getOrderDate();
        java.lang.String str17 = order12.getDeliveryAddress();
        order12.setAssignedCourierId("");
        order12.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus22 = order12.getStatus();
        java.time.LocalDateTime localDateTime23 = order12.getOrderDate();
        order3.setTransactionDate(localDateTime23);
        java.lang.String str25 = order3.getCustomerId();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + orderStatus22 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus22.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test305");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "hi!", "Order{id='hi!', customerId='hi!', status=CART}", (int) (byte) 0, 0.0d);
        double double6 = orderItem5.getSubtotal();
        java.lang.String str7 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OrderItem{productId='Order{id='hi!', customerId='hi!', status=CART}', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str7, "OrderItem{productId='Order{id='hi!', customerId='hi!', status=CART}', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test306");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.Class<?> wildcardClass20 = localDateTime18.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test307");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        java.lang.String str9 = order3.getDeliveryAddress();
        java.lang.String str10 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test308");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test309");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.getItemId();
        java.lang.String str10 = orderItem5.getProductId();
        double double11 = orderItem5.getSubtotal();
        java.lang.String str12 = orderItem5.getProductId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test310");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        double double6 = orderItem5.getUnitPrice();
        double double7 = orderItem5.getSubtotal();
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test311");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "", "", 32, (double) 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test312");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) '4');
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test313");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getAssignedCourierId();
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str13 = order12.getProofImagePath();
        order12.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime16 = order12.getOrderDate();
        java.time.LocalDateTime localDateTime17 = order12.getTransactionDate();
        java.time.LocalDateTime localDateTime18 = order12.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test314");
        boolean boolean1 = com.boutique.util.PaymentValidator.validateExpiry("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test315");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str9 = order8.getProofImagePath();
        java.lang.String str10 = order8.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus11 = order8.getStatus();
        order3.setStatus(orderStatus11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + orderStatus11 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus11.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test316");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "OrderItem{productId='Order{id='hi!', customerId='hi!', status=CART}', qty=0, unitPrice=0.0, subtotal=0.0}", 0, (double) (short) 10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test317");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getAssignedCourierId();
        order3.setAssignedCourierId("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        java.lang.String str9 = order3.getDeliveryAddress();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test318");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test319");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity(100);
        double double10 = orderItem5.getUnitPrice();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test320");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        int int8 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test321");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test322");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}", "");
        java.lang.Class<?> wildcardClass4 = order3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test323");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        orderItem5.setQuantity(32);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test324");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.time.LocalDateTime localDateTime20 = order3.getTransactionDate();
        java.lang.String str21 = order3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str21, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test325");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        com.boutique.model.Order order8 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str9 = order8.getProofImagePath();
        order8.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime12 = order8.getOrderDate();
        java.time.LocalDateTime localDateTime13 = order8.getTransactionDate();
        java.time.LocalDateTime localDateTime14 = order8.getOrderDate();
        order3.setTransactionDate(localDateTime14);
        java.lang.String str16 = order3.getCustomerId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test326");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        order3.setDeliveryAddress("Order{id='hi!', customerId='hi!', status=CART}");
        java.lang.String str8 = order3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}" + "'", str8, "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test327");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus6 = order3.getStatus();
        java.lang.String str7 = order3.getDeliveryAddress();
        order3.setAssignedCourierId("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + orderStatus6 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus6.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test328");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test329");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.getOrderId();
        java.lang.String str12 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test330");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        com.boutique.model.Order order11 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus12 = null;
        order11.setStatus(orderStatus12);
        java.time.LocalDateTime localDateTime14 = order11.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus15 = null;
        order11.setStatus(orderStatus15);
        order11.setProofImagePath("");
        com.boutique.model.Order order22 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str23 = order22.toString();
        java.time.LocalDateTime localDateTime24 = order22.getOrderDate();
        order11.setTransactionDate(localDateTime24);
        order3.setTransactionDate(localDateTime24);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str23, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test331");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test332");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        orderItem5.setQuantity((int) (short) 100);
        java.lang.String str14 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test333");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        com.boutique.model.Order order13 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str14 = order13.getOrderId();
        order13.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order13.setStatus(orderStatus17);
        com.boutique.model.Order order22 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str23 = order22.getOrderId();
        order22.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus26 = order22.getStatus();
        order13.setStatus(orderStatus26);
        order3.setStatus(orderStatus26);
        com.boutique.model.Order order32 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str33 = order32.getProofImagePath();
        java.lang.String str34 = order32.getOrderId();
        com.boutique.enums.OrderStatus orderStatus35 = order32.getStatus();
        com.boutique.enums.OrderStatus orderStatus36 = order32.getStatus();
        order3.setStatus(orderStatus36);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + orderStatus26 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus26.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + orderStatus35 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus35.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertTrue("'" + orderStatus36 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus36.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test334");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getAssignedCourierId();
        com.boutique.enums.OrderStatus orderStatus9 = order3.getStatus();
        java.time.LocalDateTime localDateTime10 = order3.getTransactionDate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + orderStatus9 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus9.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test335");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='', customerId='hi!', status=null}", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test336");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=CART}", "Order{id='', customerId='hi!', status=CART}");
        order3.setAssignedCourierId("");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test337");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=10, unitPrice=0.0, subtotal=0.0}");
        order3.setAssignedCourierId("Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test338");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.toString();
        order3.setProofImagePath("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test339");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime4 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime6 = order3.getTransactionDate();
        order3.setAssignedCourierId("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        java.lang.String str9 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test340");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        java.lang.String str9 = order3.getProofImagePath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test341");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        double double12 = orderItem5.getSubtotal();
        double double13 = orderItem5.getUnitPrice();
        java.lang.String str14 = orderItem5.getOrderId();
        double double15 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test342");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        double double12 = orderItem5.getUnitPrice();
        java.lang.String str13 = orderItem5.toString();
        java.lang.String str14 = orderItem5.getOrderId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str13, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test343");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}", "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test344");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}", 100, (double) 100L);
        orderItem5.setQuantity((int) (short) 1);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.toString();
        java.lang.String str10 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}" + "'", str9, "OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test345");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        int int8 = orderItem5.getQuantity();
        java.lang.String str9 = orderItem5.getProductId();
        java.lang.String str10 = orderItem5.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test346");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test347");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.time.LocalDateTime localDateTime5 = order3.getTransactionDate();
        com.boutique.enums.OrderStatus orderStatus6 = order3.getStatus();
        com.boutique.model.Order order10 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str11 = order10.getProofImagePath();
        com.boutique.model.Order order15 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus16 = null;
        order15.setStatus(orderStatus16);
        java.time.LocalDateTime localDateTime18 = order15.getOrderDate();
        order10.setTransactionDate(localDateTime18);
        java.lang.String str20 = order10.toString();
        com.boutique.enums.OrderStatus orderStatus21 = order10.getStatus();
        order3.setStatus(orderStatus21);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + orderStatus6 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus6.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str20, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus21 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus21.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test348");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.toString();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        java.lang.String str11 = order3.getCustomerId();
        java.lang.String str12 = order3.getProofImagePath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str9, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test349");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getCustomerId();
        java.lang.String str10 = order3.getOrderId();
        com.boutique.model.Order order14 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str15 = order14.getCustomerId();
        com.boutique.enums.OrderStatus orderStatus16 = order14.getStatus();
        order3.setStatus(orderStatus16);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str15, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertTrue("'" + orderStatus16 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus16.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test350");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        java.lang.String str10 = orderItem5.getItemId();
        double double11 = orderItem5.getSubtotal();
        java.lang.String str12 = orderItem5.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test351");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.toString();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        order3.setProofImagePath("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='hi!', customerId='hi!', status=CART}" + "'", str4, "Order{id='hi!', customerId='hi!', status=CART}");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test352");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.getOrderId();
        double double12 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test353");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str13 = order3.getOrderId();
        java.lang.Class<?> wildcardClass14 = order3.getClass();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test354");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService(10L);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.service.PaymentService.PaymentResult paymentResult7 = paymentService1.process("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult7 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult7.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test355");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order12 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str13 = order12.getProofImagePath();
        order12.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime16 = order12.getOrderDate();
        java.lang.String str17 = order12.getDeliveryAddress();
        order12.setAssignedCourierId("");
        order12.setProofImagePath("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus22 = order12.getStatus();
        java.time.LocalDateTime localDateTime23 = order12.getOrderDate();
        order3.setTransactionDate(localDateTime23);
        java.lang.Class<?> wildcardClass25 = order3.getClass();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + orderStatus22 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus22.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test356");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "hi!", "");
        java.lang.String str4 = order3.getProofImagePath();
        java.time.LocalDateTime localDateTime5 = order3.getOrderDate();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test357");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        double double10 = orderItem5.getSubtotal();
        java.lang.String str11 = orderItem5.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test358");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=CART}");
        order3.setAssignedCourierId("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test359");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        order3.setAssignedCourierId("Order{id='', customerId='hi!', status=CART}");
        java.time.LocalDateTime localDateTime15 = order3.getOrderDate();
        java.lang.String str16 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test360");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.toString();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getOrderId();
        order14.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order21 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus22 = null;
        order21.setStatus(orderStatus22);
        java.lang.String str24 = order21.toString();
        order21.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        order21.setProofImagePath("hi!");
        java.time.LocalDateTime localDateTime29 = order21.getOrderDate();
        order14.setTransactionDate(localDateTime29);
        order3.setTransactionDate(localDateTime29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str9, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str24, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test361");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getProofImagePath();
        order3.setProofImagePath("hi!");
        java.lang.String str8 = order3.getOrderId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test362");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}", "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}", "Order{id='', customerId='hi!', status=CART}", 0, (-0.0d));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test363");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setProofImagePath("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getOrderId();
        com.boutique.enums.OrderStatus orderStatus13 = order3.getStatus();
        order3.setAssignedCourierId("OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime16 = order3.getOrderDate();
        java.lang.String str17 = order3.getDeliveryAddress();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(orderStatus13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test364");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        java.lang.String str13 = order3.getCustomerId();
        com.boutique.model.Order order17 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.time.LocalDateTime localDateTime18 = order17.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test365");
        com.boutique.model.Order order3 = new com.boutique.model.Order("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", "Order{id='hi!', customerId='hi!', status=CART}", "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getDeliveryAddress();
        com.boutique.enums.OrderStatus orderStatus5 = order3.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str4, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + orderStatus5 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus5.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test366");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setProofImagePath("");
        java.lang.String str11 = order3.getDeliveryAddress();
        java.lang.String str12 = order3.getOrderId();
        com.boutique.enums.OrderStatus orderStatus13 = order3.getStatus();
        order3.setDeliveryAddress("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=1, unitPrice=100.0, subtotal=100.0}");
        java.lang.String str16 = order3.getProofImagePath();
        java.lang.String str17 = order3.getProofImagePath();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(orderStatus13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test367");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getOrderId();
        order3.setDeliveryAddress("OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        order3.setProofImagePath("");
        com.boutique.enums.OrderStatus orderStatus9 = order3.getStatus();
        java.lang.String str10 = order3.getOrderId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + orderStatus9 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus9.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test368");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        java.lang.String str5 = order3.getOrderId();
        java.lang.String str6 = order3.getOrderId();
        java.time.LocalDateTime localDateTime7 = order3.getTransactionDate();
        java.lang.String str8 = order3.getAssignedCourierId();
        java.lang.String str9 = order3.getDeliveryAddress();
        java.lang.String str10 = order3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str10, "Order{id='', customerId='hi!', status=CART}");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test369");
        com.boutique.model.Order order3 = new com.boutique.model.Order("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}", "", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        com.boutique.enums.OrderStatus orderStatus4 = order3.getStatus();
        org.junit.Assert.assertTrue("'" + orderStatus4 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus4.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test370");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        java.lang.String str8 = orderItem5.toString();
        double double9 = orderItem5.getUnitPrice();
        java.lang.String str10 = orderItem5.getProductId();
        orderItem5.setQuantity((-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}" + "'", str8, "OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test371");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("Order{id='', customerId='hi!', status=CART}", "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}", "OrderItem{productId='hi!', qty=0, unitPrice=35.0, subtotal=0.0}", 10, (double) 32);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test372");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 10);
        java.lang.String str10 = orderItem5.getProductId();
        double double11 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test373");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime10 = order3.getTransactionDate();
        order3.setAssignedCourierId("Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test374");
        com.boutique.model.Order order3 = new com.boutique.model.Order("hi!", "Order{id='', customerId='hi!', status=null}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        java.lang.String str4 = order3.getCustomerId();
        java.lang.String str5 = order3.getCustomerId();
        com.boutique.model.Order order9 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str10 = order9.getProofImagePath();
        java.lang.String str11 = order9.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus12 = order9.getStatus();
        order3.setStatus(orderStatus12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str4, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str5, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + orderStatus12 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus12.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test375");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "", "Order{id='hi!', customerId='Order{id='', customerId='hi!', status=null}', status=CART}", (int) 'a', (double) 1.0f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test376");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        int int6 = orderItem5.getQuantity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test377");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.getProductId();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.toString();
        double double13 = orderItem5.getUnitPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str12, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test378");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity(100);
        orderItem5.setQuantity((int) (short) 0);
        java.lang.String str10 = orderItem5.toString();
        java.lang.String str11 = orderItem5.toString();
        java.lang.String str12 = orderItem5.getProductId();
        java.lang.String str13 = orderItem5.getOrderId();
        orderItem5.setQuantity((int) (short) -1);
        orderItem5.setQuantity((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str10, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test379");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        order3.setDeliveryAddress("");
        java.lang.String str11 = order3.getAssignedCourierId();
        java.time.LocalDateTime localDateTime12 = order3.getTransactionDate();
        com.boutique.model.Order order16 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus17 = null;
        order16.setStatus(orderStatus17);
        java.time.LocalDateTime localDateTime19 = order16.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus20 = null;
        order16.setStatus(orderStatus20);
        order16.setProofImagePath("");
        java.lang.String str24 = order16.getDeliveryAddress();
        order16.setDeliveryAddress("OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}");
        com.boutique.model.Order order30 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str31 = order30.getProofImagePath();
        com.boutique.model.Order order35 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus36 = null;
        order35.setStatus(orderStatus36);
        java.time.LocalDateTime localDateTime38 = order35.getOrderDate();
        order30.setTransactionDate(localDateTime38);
        java.lang.String str40 = order30.toString();
        com.boutique.enums.OrderStatus orderStatus41 = order30.getStatus();
        order16.setStatus(orderStatus41);
        order3.setStatus(orderStatus41);
        java.time.LocalDateTime localDateTime44 = order3.getOrderDate();
        order3.setAssignedCourierId("Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Order{id='', customerId='hi!', status=CART}" + "'", str40, "Order{id='', customerId='hi!', status=CART}");
        org.junit.Assert.assertTrue("'" + orderStatus41 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus41.equals(com.boutique.enums.OrderStatus.CART));
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test380");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}", "Order{id='', customerId='hi!', status=CART}", "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}", (int) (short) 1, (double) 32);
        java.lang.String str6 = orderItem5.getProductId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}" + "'", str6, "OrderItem{productId='hi!', qty=0, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test381");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.lang.String str8 = order3.getProofImagePath();
        order3.setProofImagePath("Order{id='', customerId='hi!', status=null}");
        java.time.LocalDateTime localDateTime11 = order3.getOrderDate();
        com.boutique.model.Order order15 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus16 = null;
        order15.setStatus(orderStatus16);
        order15.setProofImagePath("");
        java.lang.String str20 = order15.toString();
        order15.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order26 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str27 = order26.getProofImagePath();
        order26.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime30 = order26.getOrderDate();
        order15.setTransactionDate(localDateTime30);
        java.lang.String str32 = order15.getDeliveryAddress();
        java.lang.String str33 = order15.getProofImagePath();
        com.boutique.model.Order order37 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus38 = null;
        order37.setStatus(orderStatus38);
        java.time.LocalDateTime localDateTime40 = order37.getTransactionDate();
        java.time.LocalDateTime localDateTime41 = order37.getTransactionDate();
        order37.setProofImagePath("Order{id='', customerId='hi!', status=CART}");
        com.boutique.model.Order order47 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str48 = order47.getProofImagePath();
        java.lang.String str49 = order47.getProofImagePath();
        com.boutique.enums.OrderStatus orderStatus50 = order47.getStatus();
        order37.setStatus(orderStatus50);
        order15.setStatus(orderStatus50);
        order3.setStatus(orderStatus50);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str32, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + orderStatus50 + "' != '" + com.boutique.enums.OrderStatus.CART + "'", orderStatus50.equals(com.boutique.enums.OrderStatus.CART));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test382");
        com.boutique.model.OrderItem orderItem5 = new com.boutique.model.OrderItem("hi!", "", "hi!", 0, (double) (short) 0);
        orderItem5.setQuantity((int) ' ');
        double double8 = orderItem5.getUnitPrice();
        java.lang.String str9 = orderItem5.toString();
        double double10 = orderItem5.getSubtotal();
        java.lang.String str11 = orderItem5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}" + "'", str9, "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}" + "'", str11, "OrderItem{productId='hi!', qty=32, unitPrice=0.0, subtotal=0.0}");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test383");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str4 = order3.getProofImagePath();
        order3.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime7 = order3.getOrderDate();
        java.time.LocalDateTime localDateTime8 = order3.getTransactionDate();
        java.time.LocalDateTime localDateTime9 = order3.getOrderDate();
        java.lang.Class<?> wildcardClass10 = localDateTime9.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test384");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        order3.setProofImagePath("");
        java.lang.String str8 = order3.toString();
        order3.setDeliveryAddress("Order{id='', customerId='hi!', status=null}");
        com.boutique.model.Order order14 = new com.boutique.model.Order("", "hi!", "hi!");
        java.lang.String str15 = order14.getProofImagePath();
        order14.setAssignedCourierId("hi!");
        java.time.LocalDateTime localDateTime18 = order14.getOrderDate();
        order3.setTransactionDate(localDateTime18);
        java.lang.String str20 = order3.toString();
        order3.setProofImagePath("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str8, "Order{id='', customerId='hi!', status=null}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order{id='', customerId='hi!', status=null}" + "'", str20, "Order{id='', customerId='hi!', status=null}");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test385");
        com.boutique.service.PaymentService paymentService1 = new com.boutique.service.PaymentService((long) (short) 0);
        com.boutique.service.PaymentService.PaymentResult paymentResult3 = paymentService1.process("Order{id='', customerId='hi!', status=null}");
        com.boutique.service.PaymentService.PaymentResult paymentResult5 = paymentService1.process("OrderItem{productId='OrderItem{productId='hi!', qty=100, unitPrice=0.0, subtotal=0.0}', qty=100, unitPrice=100.0, subtotal=10000.0}");
        org.junit.Assert.assertTrue("'" + paymentResult3 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult3.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
        org.junit.Assert.assertTrue("'" + paymentResult5 + "' != '" + com.boutique.service.PaymentService.PaymentResult.APPROVED + "'", paymentResult5.equals(com.boutique.service.PaymentService.PaymentResult.APPROVED));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Member3RegressionTest0.test386");
        com.boutique.model.Order order3 = new com.boutique.model.Order("", "hi!", "hi!");
        com.boutique.enums.OrderStatus orderStatus4 = null;
        order3.setStatus(orderStatus4);
        java.time.LocalDateTime localDateTime6 = order3.getOrderDate();
        com.boutique.enums.OrderStatus orderStatus7 = null;
        order3.setStatus(orderStatus7);
        java.lang.String str9 = order3.getOrderId();
        java.time.LocalDateTime localDateTime10 = order3.getOrderDate();
        order3.setProofImagePath("");
        order3.setDeliveryAddress("");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDateTime10);
    }
}

