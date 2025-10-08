package com.secureon.service;

import com.secureon.model.Service;

import java.util.List;

public interface ServiceServicio {
    List<Service> getAllServices();
    Service createService(Service service);
    void deleteService(Long id);
}