package com.example.managementhotel.repository;

import com.example.managementhotel.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface PermissionRepository extends JpaRepository<Permission,Integer> {
}
