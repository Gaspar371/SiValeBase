package com.sivale.security.repository;

import com.sivale.security.model.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    
}
