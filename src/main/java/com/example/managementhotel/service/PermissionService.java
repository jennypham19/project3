package com.example.managementhotel.service;

import com.example.managementhotel.entity.Permission;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public interface PermissionService {
    List<Permission> getAll();

    Permission create(Permission permission);

    Permission update(int id,Permission permission);

    void delete(int id);

    Optional<Permission> findById(int id);

}
