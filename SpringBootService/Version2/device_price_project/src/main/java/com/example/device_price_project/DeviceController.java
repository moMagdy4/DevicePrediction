package com.example.device_price_project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// DeviceController.java
@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;
    private final PredictionService predictionService;

    public DeviceController(DeviceService deviceService,PredictionService predictionService) {

        this.deviceService = deviceService;
        this.predictionService = predictionService;
    }

    // Retrieve a list of all devices
    @GetMapping("/test")
    public ResponseEntity<List<DEVICES_DATA>> getAllDevices() {
        List<DEVICES_DATA> devices = deviceService.getAllDevices();
        return ResponseEntity.ok(devices);
    }

    // Retrieve details of a specific device by ID
    @GetMapping("/{id}")
    public ResponseEntity<DEVICES_DATA> getDeviceById(@PathVariable Long id) {
        DEVICES_DATA device = deviceService.getDeviceById(id);
        if (device == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(device);
    }

    // Add a new device
    @PostMapping
    public ResponseEntity<DEVICES_DATA> addDevice(@RequestBody DEVICES_DATA device) {
        DEVICES_DATA savedDevice = deviceService.addDevice(device);
        return ResponseEntity.ok(savedDevice);
    }
    // POST /api/predict/{deviceId}
    // Endpoint for predicting and saving price for a device
    @PostMapping("/predict/{deviceId}")
    public ResponseEntity<String> predictPriceAndSave(@PathVariable Long deviceId) {
        DEVICES_DATA device = deviceService.getDeviceById(deviceId);
        if (device == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Device not found with ID: " + deviceId);
        }

        // Call Python Flask API for prediction
        int predictedPrice = predictionService.predictPrice(device);

        // Save predicted price in device entity
        //device.setPredictedPrice(predictedPrice);
        deviceService.saveDevice(device);

        return ResponseEntity.ok("Predicted price saved successfully for device ID: " + deviceId);
    }
}
