package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.stockPrice;

public interface stockPriceRepository extends JpaRepository<stockPrice, Long> {

}
