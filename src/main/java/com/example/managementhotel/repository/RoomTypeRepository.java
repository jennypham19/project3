package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Room_Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface RoomTypeRepository extends JpaRepository<Room_Type,Integer> {
}
