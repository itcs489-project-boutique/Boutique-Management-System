package com.boutique.data;

import com.boutique.model.User;
import com.boutique.util.DataStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Data Access Object (DAO) layer for User entities.
 * Responsibilities: raw CRUD operations against the DataStore's user list.
 * No business logic here — no validation, no password hashing, no role checks.
 * Dependencies: DataStore (singleton), User (model)
 */
public class UserDAO {

    private final DataStore store = DataStore.getInstance();

    /**
     * Saves a new User to the DataStore.
     * Does not check for duplicates — that is the Service layer's responsibility.
     * @param user The User object to save (must already have userId and passwordHash set)
     */
    public void save(User user) {
        store.getUsers().add(user);
    }

    /**
     * Finds a User by their unique username (case-insensitive).
     * @param username The username to search for
     * @return An Optional containing the User if found, or empty if not
     */
    public Optional<User> findByUsername(String username) {
        return store.getUsers().stream()
            .filter(u -> u.getUsername().equalsIgnoreCase(username))
            .findFirst();
    }

    /**
     * Finds a User by their unique userId.
     * @param userId The userId to search for (e.g. "USR-0001")
     * @return An Optional containing the User if found, or empty if not
     */
    public Optional<User> findById(String userId) {
        return store.getUsers().stream()
            .filter(u -> u.getUserId().equals(userId))
            .findFirst();
    }

    /**
     * Returns all Users currently in the DataStore.
     * Returns a defensive copy so callers cannot mutate the internal list directly.
     * @return A new List containing all User objects
     */
    public List<User> getAll() {
        return new ArrayList<>(store.getUsers());
    }

    /**
     * Updates an existing User in the DataStore by replacing the entry with the same userId.
     * Used for password changes, failed-login counter updates, and account locking.
     * @param updatedUser The User object with new values (userId must match an existing record)
     * @return true if a matching record was found and replaced; false if userId not found
     */
    public boolean update(User updatedUser) {
        List<User> users = store.getUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId().equals(updatedUser.getUserId())) {
                users.set(i, updatedUser);
                return true;
            }
        }
        return false;
    }
}