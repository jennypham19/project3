package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Customer;
import com.example.managementhotel.repository.CustomerRepository;
import com.example.managementhotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer update(int id, Customer customer) {
        return null;
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }
}
