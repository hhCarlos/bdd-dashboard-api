package com.bdd_dashboard_api.bdd_dashboard_api.modules.health.model;

public class HealthStatus {
    private String status;
    private String message;
    private long timestamp;

    public HealthStatus(String status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return  timestamp;
    }
}
