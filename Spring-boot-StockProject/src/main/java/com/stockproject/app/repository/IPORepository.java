package com.stockproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.ipoEntity;

@Repository
public interface IPORepository extends JpaRepository<ipoEntity, Long> {

}
