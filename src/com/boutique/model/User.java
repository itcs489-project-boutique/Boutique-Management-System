package com.boutique.model;

import com.boutique.enums.Role;
import java.time.LocalDateTime;

/**
 * Represents a system user (staff, admin, or courier).
 */
public class User {
    private String userId;
    private String username;
    private String passwordHash;
    private String fullName;
    private Role role;
    private boolean isActive;
    private int failedLoginAttempts;
    private LocalDateTime createdAt;

    public User(String userId, String username, String passwordHash,
                String fullName, Role role) {
        this.userId = userId;
        this.username = username;
        this.passwordHash = passwordHash;
        this.fullName = fullName;
        this.role = role;
        this.isActive = true;
        this.failedLoginAttempts = 0;
        this.createdAt = LocalDateTime.now();
    }

    public String getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    public int getFailedLoginAttempts() { return failedLoginAttempts; }
    public void setFailedLoginAttempts(int failedLoginAttempts) { this.failedLoginAttempts = failedLoginAttempts; }
    public void incrementFailedLoginAttempts() { this.failedLoginAttempts++; }
    public void resetFailedLoginAttempts() { this.failedLoginAttempts = 0; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "User{id='" + userId + "', username='" + username + "', role=" + role + "}";
    }
}