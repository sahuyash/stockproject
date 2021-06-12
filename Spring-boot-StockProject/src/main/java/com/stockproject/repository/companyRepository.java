package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.companyentity;

public interface companyRepository extends JpaRepository<companyentity, Long> {

}
