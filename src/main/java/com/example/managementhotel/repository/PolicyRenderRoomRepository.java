package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Policy_Render_Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface PolicyRenderRoomRepository extends JpaRepository<Policy_Render_Room,Integer> {
}
