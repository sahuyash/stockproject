package com.stockproject.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.companyEntity;


@Repository
public interface companyRepository extends JpaRepository<companyEntity, Long> {

	public Optional<companyEntity> findBycompanyId(String id);
	public Optional<companyEntity> findBycompanyName(String name);
    
}
