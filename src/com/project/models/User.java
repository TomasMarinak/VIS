package com.project.models;

import com.project.models.Enums.EUser;

public class User {
    private Long Id;
    private EUser role;
    private String name;
    private String lastName;
    private String email;

    public User() {
    }

    public User(EUser role, String name, String lastName, String email, String address) {
        this.role = role;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public EUser getRole() {
        return role;
    }

    public void setRole(EUser role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    @Override
    public String toString() {
        return "User{" +
                "role=" + role +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
