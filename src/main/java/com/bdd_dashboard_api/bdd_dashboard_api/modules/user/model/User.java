package com.bdd_dashboard_api.bdd_dashboard_api.modules.user.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public User(String name, String lastName, String email, String phone) {
        this.id = UUID.randomUUID();;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public UUID getId() {
        return  id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
