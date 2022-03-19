package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {
}
