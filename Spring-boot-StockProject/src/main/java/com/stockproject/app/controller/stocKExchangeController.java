package com.stockproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockproject.app.dto.stockexchangeDto;
import com.stockproject.app.entity.stockExchangeEntity;
import com.stockproject.app.service.stockExchangeService;

@RestController
@RequestMapping("/stock")
@CrossOrigin
public class stocKExchangeController {
  
	
	@Autowired
	private stockExchangeService stockexchangeService;
	
	@GetMapping("/stockexchanges")
	public ResponseEntity<List<stockexchangeDto>> findAllStockExchanges(){
		

		return ResponseEntity.status(HttpStatus.OK).body(stockexchangeService.findAllStockExchanges());
	}
	
	@PostMapping("/stockexchanges/add")
	public ResponseEntity<stockexchangeDto> addStock(@RequestBody stockexchangeDto stockDto) {
		return new ResponseEntity<stockexchangeDto>(stockexchangeService.createStock(stockDto), HttpStatus.CREATED);

	}
}
