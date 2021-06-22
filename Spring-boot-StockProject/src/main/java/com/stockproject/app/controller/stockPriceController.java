package com.stockproject.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockproject.app.entity.stockPriceEntity;
import com.stockproject.app.repository.stockPriceRepository;
import com.stockproject.app.service.stockPriceService;

@RestController
@RequestMapping("/stock")
@CrossOrigin
public class stockPriceController {
	@Autowired
	private stockPriceService stockpriceservice;
	@Autowired
	private stockPriceRepository stockpricedao;
	
	
	@GetMapping("/{companyid}/{stockexchange}")
	 public  ResponseEntity<List<stockPriceEntity>> getallstocks(@PathVariable("companyid") int companyid, @PathVariable("stockexchange") String stockexchangename )
			 
	 {
		 
		 return   new ResponseEntity<List<stockPriceEntity>>(stockpricedao.allStockPrice(companyid, stockexchangename),HttpStatus.OK);
		 
		
		 
	 }
}
