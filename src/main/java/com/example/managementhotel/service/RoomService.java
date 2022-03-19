package com.example.managementhotel.service;

import com.example.managementhotel.entity.Room;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public interface RoomService {
    List<Room> getAll();

    Room create(Room room);

    Room update(int id, Room room);

    void delete(int id);

    Optional<Room> findById(int id);
}
