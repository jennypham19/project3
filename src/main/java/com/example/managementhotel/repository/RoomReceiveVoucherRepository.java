package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Room_Receive_Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface RoomReceiveVoucherRepository extends JpaRepository<Room_Receive_Voucher,Integer> {
}
