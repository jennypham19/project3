package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Detail_Bill;
import com.example.managementhotel.repository.DetailBillRepository;
import com.example.managementhotel.service.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class DetailBillServiceImpl implements DetailBillService {

    @Autowired
    private DetailBillRepository detailBillRepository;
    @Override
    public List<Detail_Bill> getAll() {
        return detailBillRepository.findAll();
    }

    @Override
    public Detail_Bill create(Detail_Bill detail_bill) {
        return null;
    }

    @Override
    public Detail_Bill update(int id, Detail_Bill detail_bill) {
        return null;
    }

    @Override
    public void delete(int id) {
        detailBillRepository.deleteById(id);
    }

    @Override
    public Optional<Detail_Bill> findById(int id) {
        return Optional.empty();
    }
}
