package com.example.device_price_project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// DeviceController.java
@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
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
}
