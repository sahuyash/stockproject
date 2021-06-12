package com.stockproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockproject.entity.Sector;

public interface SectorRepository extends JpaRepository<Sector, Long> {

}
