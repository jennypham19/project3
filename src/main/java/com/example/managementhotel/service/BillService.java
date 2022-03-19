package com.example.managementhotel.service;

import com.example.managementhotel.entity.Bill;
import com.example.managementhotel.entity.Permission;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public interface BillService {
    List<Bill> getAll();

    Bill create(Bill bill);

    Bill update(int id, Bill bill);

    void delete(int id);

    Optional<Bill> findById(int id);
}
