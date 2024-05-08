// PredictionService.java
package com.example.device_price_project;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PredictionService {

    private final RestTemplate restTemplate;

    public PredictionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int predictPrice(DEVICES_DATA device) {
        String apiUrl = "http://localhost:5000/predict";

        // Prepare JSON data for prediction
        String jsonRequest = "{\"features\": [" +
                device.getBatteryPower() + "," +
                (device.isBlue() ? 1 : 0) + "," +
                device.getClockSpeed() + "," +
                (device.isDualSim() ? 1 : 0) + "," +
                device.getFc() + "," +
                (device.isFourG() ? 1 : 0) + "," +
                device.getIntMemory() + "," +
                device.getmDep() + "," +
                device.getMobileWt() + "," +
                device.getnCores() + "," +
                device.getPc() + "," +
                device.getPxHeight() + "," +
                device.getPxWidth() + "," +
                device.getRam() + "," +
                device.getScH() + "," +
                device.getScW() + "," +
                device.getTalkTime() + "," +
                (device.isThreeG() ? 1 : 0) + "," +
                (device.isTouchScreen() ? 1 : 0) + "," +
                (device.isWifi() ? 1 : 0) + "]}";

        // Send POST request to Flask API
        ResponseEntity<PredictionResponse> responseEntity = restTemplate.postForEntity(apiUrl, jsonRequest, PredictionResponse.class);

        // Extract prediction from response
        if (responseEntity.getStatusCode().is2xxSuccessful() && responseEntity.getBody() != null) {
            return responseEntity.getBody().getPrediction();
        } else {
            // Handle error case, return a default value for now
            return 0;
        }
    }
}