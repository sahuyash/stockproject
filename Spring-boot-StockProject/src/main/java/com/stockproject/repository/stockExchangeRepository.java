package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.stockExchange;

public interface stockExchangeRepository extends JpaRepository<stockExchange, Long> {

}
