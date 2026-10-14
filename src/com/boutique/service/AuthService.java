package com.boutique.service;

import com.boutique.data.UserDAO;
import com.boutique.enums.Role;
import com.boutique.model.Session;
import com.boutique.model.User;
import com.boutique.util.IdGenerator;
import com.boutique.util.PasswordUtil;
import com.boutique.util.Result;

import java.util.Optional;

/**
 * Business layer for authentication and user management.
 * Responsibilities: sign-up, sign-in, sign-out, change password.
 *                   Enforces duplicate-username checks, password validation,
 *                   failed-attempt tracking, and account locking.
 * Dependencies: UserDAO, PasswordUtil, IdGenerator, Session, Result
 */
public class AuthService {

    private static final int MAX_FAILED_ATTEMPTS = 3;
    private static final int MIN_PASSWORD_LENGTH  = 8;

    private final UserDAO userDAO = new UserDAO();

    /**
     * Registers a new user account.
     * Validates: username not taken; password meets minimum length.
     * @param username  Desired username (must be unique)
     * @param password  Plain-text password (min 8 characters)
     * @param fullName  Display name
     * @param role      Role to assign (ADMIN or STAFF; courier roles created separately)
     * @return Result.success with the new User, or Result.failure with an error message
     */
    public Result<User> signUp(String username, String password, String fullName, Role role) {
        // Validate inputs
        if (username == null || username.trim().isEmpty()) {
            return Result.failure("Username cannot be empty.");
        }
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            return Result.failure("Password must be at least " + MIN_PASSWORD_LENGTH + " characters.");
        }
        if (fullName == null || fullName.trim().isEmpty()) {
            return Result.failure("Full name cannot be empty.");
        }

        // Check for duplicate username (case-insensitive)
        if (userDAO.findByUsername(username).isPresent()) {
            return Result.failure("Username '" + username + "' is already taken.");
        }

        // Hash password and create user
        String passwordHash = PasswordUtil.hash(password);
        String userId = IdGenerator.nextUserId();
        User newUser = new User(userId, username.trim(), passwordHash, fullName.trim(), role);

        userDAO.save(newUser);
        return Result.success(newUser);
    }

    /**
     * Authenticates a user by username and password.
     * Increments failedLoginAttempts on each wrong password.
     * Locks the account (isActive = false) after MAX_FAILED_ATTEMPTS failures.
     * Resets the counter on successful sign-in.
     * @param username Plain-text username
     * @param password Plain-text password
     * @return Result.success with the User and Session set, or Result.failure with an error message
     */
    public Result<User> signIn(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            return Result.failure("Username cannot be empty.");
        }
        if (password == null || password.isEmpty()) {
            return Result.failure("Password cannot be empty.");
        }

        // Look up user
        Optional<User> found = userDAO.findByUsername(username);
        if (found.isEmpty()) {
            return Result.failure("Invalid username or password.");
        }

        User user = found.get();

        // Check account is active (not locked)
        if (!user.isActive()) {
            return Result.failure("Account is locked. Please contact an administrator.");
        }

        // Verify password
        if (!PasswordUtil.verify(password, user.getPasswordHash())) {
            user.incrementFailedLoginAttempts();

            // Lock account if threshold reached
            if (user.getFailedLoginAttempts() >= MAX_FAILED_ATTEMPTS) {
                user.setActive(false);
                userDAO.update(user);
                return Result.failure("Too many failed attempts. Account is now locked.");
            }

            userDAO.update(user);
            int remaining = MAX_FAILED_ATTEMPTS - user.getFailedLoginAttempts();
            return Result.failure("Invalid username or password. " + remaining + " attempt(s) remaining.");
        }

        // Success — reset counter and set session
        user.resetFailedLoginAttempts();
        userDAO.update(user);
        Session.setCurrentUser(user);
        return Result.success(user);
    }

    /**
     * Signs out the current user by clearing the session.
     */
    public void signOut() {
        Session.clear();
    }

    /**
     * Changes the password for the currently signed-in user.
     * Validates: user is signed in; current password matches; new passwords match; length requirement met.
     * Resets the failed-login counter and clears any lock on success.
     * @param currentPassword The user's existing plain-text password (for confirmation)
     * @param newPassword     The desired new plain-text password
     * @param confirmPassword Must match newPassword exactly
     * @return Result.success, or Result.failure with an error message
     */
    public Result<Void> changePassword(String currentPassword, String newPassword, String confirmPassword) {
        if (!Session.isSignedIn()) {
            return Result.failure("You must be signed in to change your password.");
        }

        User user = Session.getCurrentUser();

        // Verify current password
        if (!PasswordUtil.verify(currentPassword, user.getPasswordHash())) {
            return Result.failure("Current password is incorrect.");
        }

        // Validate new password
        if (newPassword == null || newPassword.length() < MIN_PASSWORD_LENGTH) {
            return Result.failure("New password must be at least " + MIN_PASSWORD_LENGTH + " characters.");
        }
        if (!newPassword.equals(confirmPassword)) {
            return Result.failure("New passwords do not match.");
        }

        // Apply change — also clears any lock
        user.setPasswordHash(PasswordUtil.hash(newPassword));
        user.resetFailedLoginAttempts();
        user.setActive(true);
        userDAO.update(user);

        return Result.success(null);
    }
}