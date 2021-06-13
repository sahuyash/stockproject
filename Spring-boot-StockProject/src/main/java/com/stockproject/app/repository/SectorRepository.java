package com.stockproject.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.sectorEntity;

@Repository
public interface SectorRepository extends JpaRepository<sectorEntity, Long> {

}
