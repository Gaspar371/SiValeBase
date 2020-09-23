package com.sivale.security.repository;

import com.sivale.security.model.CompaniesRole;
import com.sivale.security.model.CompaniesRolePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompaniesRepository extends JpaRepository<CompaniesRole, CompaniesRolePK> {
    
}
