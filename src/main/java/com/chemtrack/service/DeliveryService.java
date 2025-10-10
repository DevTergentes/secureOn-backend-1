package com.chemtrack.service;

import com.chemtrack.model.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    List<Delivery> getAllDeliveries();
    Delivery createDelivery(Delivery delivery);
    Optional<Delivery> findById(Long id);
    void deleteDelivery(Long id);  // New delete method
}
