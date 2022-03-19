package com.example.managementhotel.service;

import com.example.managementhotel.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public interface CustomerService {

    List<Customer> getAll();

    Customer create(Customer customer);

    Customer update(int id, Customer customer);

    void delete(int id);

    Optional<Customer> findById(int id);
}
