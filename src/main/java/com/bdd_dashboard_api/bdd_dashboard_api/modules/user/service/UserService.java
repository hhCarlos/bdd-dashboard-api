package com.bdd_dashboard_api.bdd_dashboard_api.modules.user.service;

import com.bdd_dashboard_api.bdd_dashboard_api.modules.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final List<User> mockUsers = List.of(
        new User("Carlos", "Hernández", "carlos.hdz@example.com", "5512345678"),
        new User("María", "Lopez", "maria.lopez@example.com", "5549876543"),
        new User("José", "Ramírez", "jose.ramirez@example.com", "5532167845"),
        new User("Ana", "García", "ana.garcia@example.com", "5576541230"),
        new User("Luis", "Pérez", "luis.perez@example.com", "5587654321")
    );


    public List<User> getUsers() {
        return mockUsers;
    }

    public Optional<User> getUserById(UUID id) {
        return mockUsers.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
