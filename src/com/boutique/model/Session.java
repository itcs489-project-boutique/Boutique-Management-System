package com.boutique.model;

import com.boutique.enums.Role;

/**
 * Presentation/service layer session holder.
 * Responsibilities: holds the currently signed-in user for the lifetime of the session;
 *                   provides convenience checks for sign-in state and role.
 * Dependencies: User (model), Role (enum)
 */
public class Session {

    /** The currently signed-in user. Null when no one is signed in. */
    private static User currentUser = null;

    // Private constructor — static utility class, not instantiable
    private Session() {}

    /**
     * Sets the current user (called by AuthService on successful sign-in).
     * @param user The User who just signed in
     */
    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    /**
     * Returns the currently signed-in user.
     * @return The current User, or null if no one is signed in
     */
    public static User getCurrentUser() {
        return currentUser;
    }

    /**
     * Clears the session (called by AuthService on sign-out).
     */
    public static void clear() {
        currentUser = null;
    }

    /**
     * Returns true if a user is currently signed in.
     */
    public static boolean isSignedIn() {
        return currentUser != null;
    }

    /**
     * Returns true if the current user has the given role.
     * Returns false if no user is signed in.
     * @param role The role to check against
     */
    public static boolean hasRole(Role role) {
        return currentUser != null && currentUser.getRole() == role;
    }
}