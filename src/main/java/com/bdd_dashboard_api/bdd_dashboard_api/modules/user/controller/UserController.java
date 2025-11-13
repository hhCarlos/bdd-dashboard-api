package com.bdd_dashboard_api.bdd_dashboard_api.modules.user.controller;

import com.bdd_dashboard_api.bdd_dashboard_api.modules.user.model.User;
import com.bdd_dashboard_api.bdd_dashboard_api.modules.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.bdd_dashboard_api.bdd_dashboard_api.shared.routes.ApiRoutes.USERS;

/**
 * REST controller that exposes the public endpoints for managing users.
 * <p>
 * This controller handles the main read operations (list and find by ID)
 * for the User module. It is mapped under the base path defined in
 * {@link com.bdd_dashboard_api.bdd_dashboard_api.shared.routes.ApiRoutes#USERS},
 * allowing all its routes to be grouped and organized by module.
 * </p>
 *
 * <h2>Available Endpoints</h2>
 *
 * <ul>
 *     <li><b>GET /users</b> – Returns a list of all registered users.</li>
 *     <li><b>GET /users/{id}</b> – Returns a single user based on its UUID.</li>
 * </ul>
 *
 * <h2>Usage Example</h2>
 * <pre>
 *   GET /api/v1/users
 *   → [
 *        {
 *          "id": "c802c035-76db-4a8f-b5be-cba360fa4f2e",
 *          "name": "María",
 *          "lastName": "López",
 *          "email": "maria@example.com",
 *          "phone": "5549876543"
 *        },
 *        ...
 *     ]
 *
 *   GET /api/v1/users/c802c035-76db-4a8f-b5be-cba360fa4f2e
 *   → {
 *        "id": "c802c035-76db-4a8f-b5be-cba360fa4f2e",
 *        "name": "María",
 *        "lastName": "López",
 *        "email": "maria@example.com",
 *        "phone": "5549876543"
 *     }
 * </pre>
 *
 * <p>
 * This controller delegates all business logic to {@link UserService},
 * keeping the layer clean and focused only on request/response handling.
 * </p>
 *
 * @author Carlos
 * @since 1.0
 */
@RestController
@RequestMapping(USERS)
public class UserController {

    private final UserService userService;

    /**
     * Creates a new {@code UserController} instance and injects
     * a {@link UserService} implementation responsible for the user domain logic.
     *
     * @param userService injected service containing user-related operations
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Handles HTTP {@code GET} requests for retrieving all users.
     *
     * @return a list of {@link User} objects available in the system
     */
    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    /**
     * Handles HTTP {@code GET} requests for retrieving a user by UUID.
     * <p>
     * If a user with the provided ID exists, it is wrapped in an {@link Optional}.
     * Otherwise, the Optional will be empty, allowing the controller
     * or upper layers to decide how to manage the missing resource.
     * </p>
     *
     * @param id the UUID of the user to be retrieved
     * @return an {@code Optional<User>} containing the found user or empty if not found
     */
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable UUID id) {
        return this.userService.getUserById(id);
    }
}
