package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface EquipmentRepository extends JpaRepository<Equipment,Integer> {
}
