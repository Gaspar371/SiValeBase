package com.sivale.security.repository;

import java.util.Date;

import com.sivale.security.model.History;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Date> {
    
}
