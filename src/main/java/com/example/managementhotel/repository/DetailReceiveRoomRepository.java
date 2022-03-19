package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Detail_Receive_Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface DetailReceiveRoomRepository extends JpaRepository<Detail_Receive_Room,Integer> {
}
