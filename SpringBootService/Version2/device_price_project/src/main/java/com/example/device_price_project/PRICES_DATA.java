package com.example.device_price_project;

import jakarta.persistence.*;

@Entity
@Table(name = "PRICES_DATA")
public class PRICES_DATA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long deviceId;
    private int prediction;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public int getPrediction() {
        return prediction;
    }

    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }
}
