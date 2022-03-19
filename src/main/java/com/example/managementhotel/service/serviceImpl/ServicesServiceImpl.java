package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Services;
import com.example.managementhotel.repository.ServiceRepository;
import com.example.managementhotel.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class ServicesServiceImpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public List<Services> getAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services create(Services services) {
        return null;
    }

    @Override
    public Services update(int id, Services services) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Services> findById(int id) {
        return Optional.empty();
    }
}
