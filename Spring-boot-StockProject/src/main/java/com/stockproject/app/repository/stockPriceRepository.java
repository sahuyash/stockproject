package com.stockproject.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stockproject.app.entity.stockPriceEntity;

@Repository
public interface stockPriceRepository extends JpaRepository<stockPriceEntity, Long> {
	@Query("select s from  stockPriceEntity s where s.companyCode=?1 and s.stockExchange=?2" )
	List<stockPriceEntity>allStockPrice(int Companycode,String exchangename);
}
