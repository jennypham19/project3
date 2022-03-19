package com.example.managementhotel.service;

import com.example.managementhotel.entity.Services;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public interface ServiceService {
    List<Services> getAll();

    Services create(Services services);

    Services update(int id, Services services);

    void delete(int id);

    Optional<Services> findById(int id);
}
