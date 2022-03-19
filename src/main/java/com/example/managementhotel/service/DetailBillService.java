package com.example.managementhotel.service;

import com.example.managementhotel.entity.Detail_Bill;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public interface DetailBillService {
    List<Detail_Bill> getAll();

    Detail_Bill create(Detail_Bill detail_bill);

    Detail_Bill update(int id,Detail_Bill detail_bill);

    void delete(int id);

    Optional<Detail_Bill> findById(int id);
}
