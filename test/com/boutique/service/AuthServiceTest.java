package com.boutique.service;

import com.boutique.enums.Role;
import com.boutique.model.Session;
import com.boutique.model.User;
import com.boutique.util.DataStore;
import com.boutique.util.Result;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthServiceTest {

    private AuthService authService;

    @BeforeEach
    void setUp() {
        DataStore.getInstance().reset();
        Session.clear();
        authService = new AuthService();
    }

    @AfterEach
    void tearDown() {
        Session.clear();
    }

    @Test
    void signIn_validCredentials_returnsSuccess() {
        Result<User> result = authService.signIn("admin", "admin123");
        assertTrue(result.isSuccess());
        assertEquals("admin", result.getValue().getUsername());
    }

    @Test
    void signIn_wrongPassword_returnsFailure() {
        Result<User> result = authService.signIn("admin", "wrongpassword");
        assertFalse(result.isSuccess());
    }

    @Test
    void signIn_nonExistentUser_returnsFailure() {
        Result<User> result = authService.signIn("nobody", "password");
        assertFalse(result.isSuccess());
    }

    @Test
    void signIn_setsSession() {
        authService.signIn("admin", "admin123");
        assertTrue(Session.isSignedIn());
    }

    @Test
    void signOut_clearsSession() {
        authService.signIn("admin", "admin123");
        authService.signOut();
        assertFalse(Session.isSignedIn());
    }

    @Test
    void signUp_validInput_returnsSuccess() {
        authService.signIn("admin", "admin123");
        Result<User> result = authService.signUp(
                "newuser", "password123", "New User", Role.STAFF);
        assertTrue(result.isSuccess());
        assertEquals("newuser", result.getValue().getUsername());
    }

    @Test
    void signUp_duplicateUsername_returnsFailure() {
        authService.signIn("admin", "admin123");
        authService.signUp("dupuser", "password123", "User One", Role.STAFF);
        Result<User> result = authService.signUp(
                "dupuser", "password123", "User Two", Role.STAFF);
        assertFalse(result.isSuccess());
    }

    @Test
    void signUp_shortPassword_returnsFailure() {
        authService.signIn("admin", "admin123");
        Result<User> result = authService.signUp(
                "newuser", "short", "New User", Role.STAFF);
        assertFalse(result.isSuccess());
    }

    @Test
    void signIn_locksAfterMaxFailedAttempts() {
        authService.signIn("admin", "wrong");
        authService.signIn("admin", "wrong");
        authService.signIn("admin", "wrong");
        Result<User> result = authService.signIn("admin", "admin123");
        assertFalse(result.isSuccess());
        assertTrue(result.getErrorMessage().toLowerCase().contains("lock"));
    }

    @Test
    void changePassword_validInput_returnsSuccess() {
        authService.signIn("admin", "admin123");
        Result<Void> result = authService.changePassword(
                "admin123", "newpassword1", "newpassword1");
        assertTrue(result.isSuccess());
    }

    @Test
    void changePassword_wrongCurrentPassword_returnsFailure() {
        authService.signIn("admin", "admin123");
        Result<Void> result = authService.changePassword(
                "wrongpassword", "newpassword1", "newpassword1");
        assertFalse(result.isSuccess());
    }

    @Test
    void changePassword_mismatchedNewPasswords_returnsFailure() {
        authService.signIn("admin", "admin123");
        Result<Void> result = authService.changePassword(
                "admin123", "newpassword1", "newpassword2");
        assertFalse(result.isSuccess());
    }
}
