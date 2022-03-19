package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Equipment;
import com.example.managementhotel.repository.EquipmentRepository;
import com.example.managementhotel.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class EquipmentServiceImpl implements EquipmentService {
    // trong cái này mình sẽ khai báo cái repository để nó chạy câu lệnh sql
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Override
    public List<Equipment> getAll() {
        return equipmentRepository.findAll();// cái này là select ra tất cả
    }

    @Override
    public Equipment create(Equipment equipment) {
        return null;
    }

    @Override
    public Equipment update(int id, Equipment equipment) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Equipment> findById(int id) {
        return Optional.empty();
    }
}
