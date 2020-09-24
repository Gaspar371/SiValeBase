package com.sivale.security.repository;

import com.sivale.security.model.LastPassword;
import com.sivale.security.model.UsersSv;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LastPasswordRepository extends JpaRepository<LastPassword,UsersSv> {
    
}
