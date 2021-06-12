package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.ipo;

public interface IPORepository extends JpaRepository<ipo, Long> {

}
