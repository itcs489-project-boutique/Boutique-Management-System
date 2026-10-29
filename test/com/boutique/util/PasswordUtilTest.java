package com.boutique.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test

    void hash_returnsNonNullString() {

        String hash = PasswordUtil.hash("password123");

        assertNotNull(hash);

    }

    @Test

    void hash_returnsDifferentStringFromInput() {

        String hash = PasswordUtil.hash("password123");

        assertNotEquals("password123", hash);

    }

    @Test

    void hash_sameInputProducesSameHash() {

        String hash1 = PasswordUtil.hash("password123");

        String hash2 = PasswordUtil.hash("password123");

        assertEquals(hash1, hash2);

    }

    @Test

    void hash_differentInputsProduceDifferentHashes() {

        String hash1 = PasswordUtil.hash("password123");

        String hash2 = PasswordUtil.hash("password456");

        assertNotEquals(hash1, hash2);

    }

    @Test

    void verify_correctPassword_returnsTrue() {

        String hash = PasswordUtil.hash("mypassword");

        assertTrue(PasswordUtil.verify("mypassword", hash));

    }

    @Test

    void verify_wrongPassword_returnsFalse() {

        String hash = PasswordUtil.hash("mypassword");

        assertFalse(PasswordUtil.verify("wrongpassword", hash));

    }

    @Test

    void verify_emptyPassword_returnsFalse() {

        String hash = PasswordUtil.hash("mypassword");

        assertFalse(PasswordUtil.verify("", hash));

    }

    @Test

    void hash_emptyString_returnsHash() {

        String hash = PasswordUtil.hash("");

        assertNotNull(hash);

        assertFalse(hash.isEmpty());

    }

}
