package com.bdd_dashboard_api.bdd_dashboard_api.modules.health.controller;

import com.bdd_dashboard_api.bdd_dashboard_api.modules.health.model.HealthStatus;
import com.bdd_dashboard_api.bdd_dashboard_api.modules.health.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bdd_dashboard_api.bdd_dashboard_api.shared.routes.ApiRoutes.HEALTH;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping(HEALTH)
    public HealthStatus healthCheck() {
        return healthService.checkHealth();
    }
}
