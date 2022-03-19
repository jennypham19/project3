package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.User;
import com.example.managementhotel.repository.UserRepository;
import com.example.managementhotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }
}
