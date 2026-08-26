package com.tvs.claimassist.backend.controller;

public class Claim {
    private String id;
    private String vehicle;
    private String location;
    private String status;
    private String reason;

    public Claim(String id, String vehicle, String location, String status, String reason) {
        this.id = id;
        this.vehicle = vehicle;
        this.location = location;
        this.status = status;
        this.reason = reason;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getVehicle() { return vehicle; }
    public void setVehicle(String vehicle) { this.vehicle = vehicle; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}