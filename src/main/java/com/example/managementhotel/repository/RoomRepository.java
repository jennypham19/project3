package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;

@Component
@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
}
