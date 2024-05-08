package com.example.device_price_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<DEVICES_DATA> getAllDevices() {
        return deviceRepository.findAll();
    }

    public DEVICES_DATA getDeviceById(Long id) {
        Optional<DEVICES_DATA> deviceOptional = deviceRepository.findById(id);
        return deviceOptional.orElse(null);
    }

    public DEVICES_DATA saveDevice(DEVICES_DATA device) {
        return deviceRepository.save(device);
    }

    public void deleteDeviceById(Long id) {
        deviceRepository.deleteById(id);
    }
    // Add a new device
    public DEVICES_DATA addDevice(DEVICES_DATA device) {
        return deviceRepository.save(device);
    }
}
