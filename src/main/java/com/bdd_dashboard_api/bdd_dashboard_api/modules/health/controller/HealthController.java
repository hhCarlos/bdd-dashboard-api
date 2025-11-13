package com.bdd_dashboard_api.bdd_dashboard_api.modules.health.controller;

import com.bdd_dashboard_api.bdd_dashboard_api.modules.health.model.HealthStatus;
import com.bdd_dashboard_api.bdd_dashboard_api.modules.health.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bdd_dashboard_api.bdd_dashboard_api.shared.routes.ApiRoutes.HEALTH;

/**
 * REST controller that exposes a health-check endpoint for the API.
 * <p>
 * This endpoint is commonly used by monitoring tools, CI/CD pipelines, or
 * external load balancers to verify that the application is running and
 * responsive. It returns a structured {@link HealthStatus} object containing
 * system status and timestamp metadata.
 * </p>
 *
 * <p><b>Example usage:</b></p>
 * <pre>
 *   GET /api/health
 *   → {
 *        "status": "ok",
 *        "message": "Service is running",
 *        "timestamp": "2025-11-13T20:34:22Z"
 *      }
 * </pre>
 *
 * @author Carlos Hernandez
 * @since 1.0
 */
@RestController
public class HealthController {

    private final HealthService healthService;

    /**
     * Creates a new {@code HealthController} with the provided {@link HealthService}.
     *
     * @param healthService the service responsible for computing and returning the system health status
     */
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    /**
     * Handles HTTP {@code GET} requests to the {@link com.bdd_dashboard_api.bdd_dashboard_api.shared.routes.ApiRoutes#HEALTH} endpoint.
     * <p>
     * Invokes the {@link HealthService} to determine the current system health and returns
     * a serialized {@link HealthStatus} object.
     * </p>
     *
     * @return a {@link HealthStatus} representing the current health state of the system
     */
    @GetMapping(HEALTH)
    public HealthStatus healthCheck() {
        return healthService.checkHealth();
    }
}
