package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Bill;
import com.example.managementhotel.repository.BillRepository;
import com.example.managementhotel.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;
    @Override
    public List<Bill> getAll() {
        return billRepository.findAll();
    }

    @Override
    public Bill create(Bill bill) {
        return null;
    }

    @Override
    public Bill update(int id, Bill bill) {
        return null;
    }

    @Override
    public void delete(int id) {
        billRepository.deleteById(id);
    }

    @Override
    public Optional<Bill> findById(int id) {
        return Optional.empty();
    }
}
