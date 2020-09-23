package com.sivale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sivale.entity.KUser;

@Transactional
public interface UserDAO extends JpaRepository<KUser, Integer>{

}