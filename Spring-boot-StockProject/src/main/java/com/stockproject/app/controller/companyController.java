package com.stockproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stockproject.app.dto.IPODto;
import com.stockproject.app.dto.companyDto;
import com.stockproject.app.service.companyService;

@Controller
@RequestMapping("/company")
public class companyController {
    
	@Autowired
	private companyService companyService;
	
	//add company
	@PostMapping("/companies")
	public ResponseEntity<companyDto> addCompany(@RequestBody companyDto companyDto){
		
		return new ResponseEntity<companyDto> (companyService.addCompany(companyDto),HttpStatus.CREATED);
	}
	
	//get all company
	@GetMapping("/companies")
	public ResponseEntity<List<companyDto>> getAllCompanies(){
		
		return new ResponseEntity<> (companyService.getCompanyDetails(), HttpStatus.OK);
	}
	
	//ipodetails by company name
	@GetMapping("/companies/ipoDetails/{companyName}")
	public ResponseEntity<List<IPODto>> getAllIpoByCompanyName(@PathVariable("companyName") String name){
		
		return new ResponseEntity<> (companyService.findByCompanyName(name), HttpStatus.FOUND);
	}

	//update the company by id
	@PutMapping("/companies/{companyId}")
	public ResponseEntity<companyDto> updateCompany(@RequestBody companyDto companyDto,@PathVariable("companyId") String companyId){
		return new ResponseEntity<companyDto> (companyService.updateCompany(companyDto,companyId), HttpStatus.OK);
		
	}
	
}
