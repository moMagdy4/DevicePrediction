package com.example.device_price_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public PRICES_DATA savePrice(PRICES_DATA price) {
        return priceRepository.save(price);
    }
/*
    public Optional<Price> getPriceByDeviceId(Long deviceId) {
        return priceRepository.findByDeviceId(deviceId);
    }

 */
}
