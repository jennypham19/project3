package com.example.managementhotel.service;

import com.example.managementhotel.entity.Equipment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public interface EquipmentService {
    List<Equipment> getAll();

    Equipment create(Equipment equipment);

    Equipment update(int id, Equipment equipment);

    void delete(int id);

    Optional<Equipment> findById(int id);
}
