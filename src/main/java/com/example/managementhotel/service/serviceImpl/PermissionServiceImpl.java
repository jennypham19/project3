package com.example.managementhotel.service.serviceImpl;

import com.example.managementhotel.entity.Permission;
import com.example.managementhotel.repository.PermissionRepository;
import com.example.managementhotel.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;
    @Override
    public List<Permission> getAll() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission create(Permission permission) {
        return null;
    }

    @Override
    public Permission update(String id, Permission permission) {
        return null;
    }

    @Override
    public void delete(String id) {
        permissionRepository.deleteById(Integer.valueOf(id));
    }

    @Override
    public Optional<Permission> findById(String id) {
        return Optional.empty();
    }
}
