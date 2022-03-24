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
        if (permission.getPermission_name() == null || permission.getPermission_name().isEmpty()){
            return null;
        }
        return permissionRepository.save(permission);
    }

    @Override
    public Permission update(int id, Permission permission) {
        Permission per = permissionRepository.findById(id).orElse(null);
        if(per == null){
            return null;
        }
        per.setPermission_name(permission.getPermission_name());
        return permissionRepository.save(per);
    }

    @Override
    public void delete(int id) {
        permissionRepository.deleteById(id);
    }

    @Override
    public Optional<Permission> findById(int id) {

        return permissionRepository.findById(id);
    }
}
