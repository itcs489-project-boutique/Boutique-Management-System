package com.boutique.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Utility layer for password hashing and verification.
 * Responsibilities: SHA-256 hashing of plain-text passwords; constant-time comparison
 *                   to prevent timing attacks.
 * Dependencies: java.security.MessageDigest (JDK built-in, no external libs)
 */
public class PasswordUtil {

    private PasswordUtil() {}

    /**
     * Hashes a plain-text password using SHA-256.
     * @param password The plain-text password to hash
     * @return A 64-character lowercase hex string representing the SHA-256 digest
     */
    public static String hash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not available", e);
        }
    }

    /**
     * Verifies a plain-text input against a stored SHA-256 hash.
     * Uses MessageDigest.isEqual for constant-time comparison to resist timing attacks.
     * @param input      The plain-text password to check
     * @param storedHash The stored 64-character hex hash to compare against
     * @return true if the input hashes to the same value as storedHash; false otherwise
     */
    public static boolean verify(String input, String storedHash) {
        if (input == null || storedHash == null) return false;
        String inputHash = hash(input);
        return MessageDigest.isEqual(
            inputHash.getBytes(java.nio.charset.StandardCharsets.UTF_8),
            storedHash.getBytes(java.nio.charset.StandardCharsets.UTF_8)
        );
    }
}