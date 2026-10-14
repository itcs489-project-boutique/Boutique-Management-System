package com.boutique.model;

import java.time.LocalDateTime;

/**
 * Represents a customer of the boutique.
 */
public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;
    private LocalDateTime registrationDate;

    public Customer(String customerId, String fullName, String email,
                    String phone, String address) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isActive = true;
        this.registrationDate = LocalDateTime.now();
    }

    public String getCustomerId() { return customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    public LocalDateTime getRegistrationDate() { return registrationDate; }

    @Override
    public String toString() {
        return "Customer{id='" + customerId + "', name='" + fullName + "', email='" + email + "'}";
    }
}