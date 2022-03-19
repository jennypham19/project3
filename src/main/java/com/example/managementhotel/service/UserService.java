package com.example.managementhotel.service;

import com.example.managementhotel.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public interface UserService {
    List<User> getAll();

    User create(User user);

    User update(int id, User user);

    void delete(int id);

    Optional<User> findById(int id);
}
