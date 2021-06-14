package com.stockproject.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.ipoEntity;

@Repository
public interface IPORepository extends JpaRepository<ipoEntity, Long> {
	public List<ipoEntity> findBycompanyName(String companyname);
}
