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

    Permission update(String id,Permission permission);

    void delete(String id);

    Optional<Permission> findById(String id);

}
