package com.sivale.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sivale.entity.WParam;

@Transactional
public interface ParamDAO extends JpaRepository<WParam, Integer> {

}
