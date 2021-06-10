package com.javasampleapproach.springrest.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Tranings;
import com.javasampleapproach.springrest.mysql.repo.CustomerRepository;
import com.javasampleapproach.springrest.mysql.repo.TrainingsRepository;

@CrossOrigin(origins = "*")
@RestController
public class TraningsRestController {
	@Autowired
	TrainingsRepository repository;
	
	@GetMapping("/getCompletedTrainings")
	List<Tranings> getCompletedTranings()
	{
		return repository.findByStatusAndUserId(5, 1);
	}
}
