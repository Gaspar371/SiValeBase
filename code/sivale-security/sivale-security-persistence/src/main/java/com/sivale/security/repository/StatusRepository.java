package com.sivale.security.repository;

import com.sivale.security.model.Status;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
    
}
