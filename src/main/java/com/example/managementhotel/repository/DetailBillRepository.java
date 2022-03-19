package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Detail_Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface DetailBillRepository extends JpaRepository<Detail_Bill,Integer> {
}
