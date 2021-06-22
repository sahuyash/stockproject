package com.stockproject.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockproject.app.dto.IPODto;
import com.stockproject.app.dto.companyDto;
import com.stockproject.app.entity.ipoEntity;
import com.stockproject.app.service.IPOService;

@RestController
@CrossOrigin
public class IpoController {

private IPOService ipoDetailService;
	
	public IpoController(IPOService ipoDetailService) {
		super();
		this.ipoDetailService = ipoDetailService;
	}




	@GetMapping("/ipoDetails/{companyName}")
	public ResponseEntity<List<ipoEntity>> getIpoDetails(@PathVariable("companyName") String companyName){
		
		return new ResponseEntity<List<ipoEntity>>(ipoDetailService.getIpoDetails(companyName),HttpStatus.OK); 
	}
	
	@PostMapping("/ipoDetails")
	public ResponseEntity<ipoEntity> addIpoDetail(@RequestBody ipoEntity ipoDetail) {
		
		return new ResponseEntity<ipoEntity>(ipoDetailService.addIpoDetail(ipoDetail), HttpStatus.CREATED);
		
	}
	@GetMapping("/allipo")
	public ResponseEntity<List<IPODto>> getAllIPO(){
		
		return new ResponseEntity<> (ipoDetailService.getIPODetails(), HttpStatus.OK);
	}
	
}
