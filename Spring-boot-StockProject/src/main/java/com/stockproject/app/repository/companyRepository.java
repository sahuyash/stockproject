package com.stockproject.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.companyEntity;


@Repository
public interface companyRepository extends JpaRepository<companyEntity, Long> {

	
    
}
