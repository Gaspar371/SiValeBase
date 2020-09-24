package com.sivale.security.repository;

import com.sivale.security.model.CompanyRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRoleRepository extends JpaRepository<CompanyRole, Long> {
    
}
