package com.bdd_dashboard_api.bdd_dashboard_api.modules.health.service;

import com.bdd_dashboard_api.bdd_dashboard_api.modules.health.model.HealthStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthStatus checkHealth() {
        return new HealthStatus(
                "ok",
                "API is running and healthy.",
                System.currentTimeMillis()
        );
    }
}
