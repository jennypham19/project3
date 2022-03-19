package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Room;
import com.example.managementhotel.repository.RoomRepository;
import com.example.managementhotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room create(Room room) {
        return null;
    }

    @Override
    public Room update(int id, Room room) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Room> findById(int id) {
        return Optional.empty();
    }
}
