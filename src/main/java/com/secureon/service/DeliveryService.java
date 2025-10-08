package com.secureon.service;

import com.secureon.model.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    List<Delivery> getAllDeliveries();
    Delivery createDelivery(Delivery delivery);
    Optional<Delivery> findById(Long id);
    void deleteDelivery(Long id);  // New delete method
}
