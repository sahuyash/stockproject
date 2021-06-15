package com.stockproject.app.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockproject.app.dto.stockexchangeDto;
import com.stockproject.app.entity.stockExchangeEntity;
import com.stockproject.app.repository.stockExchangeRepository;

@Service
public class stockExchangeService {

	private stockExchangeRepository stockExchangeRepo;
	private ModelMapper modelMapper;
	public stockExchangeService(stockExchangeRepository stockExchangeRepo, ModelMapper modelMapper) {
		super();
		this.stockExchangeRepo = stockExchangeRepo;
		this.modelMapper = modelMapper;
	}
	
	@Transactional
	public List<stockexchangeDto> findAllStockExchanges() {
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 List<stockExchangeEntity> stockExchanges = stockExchangeRepo.findAll();
		 Type listType = new TypeToken<List< stockexchangeDto>>() {}.getType();
		 return modelMapper.map(stockExchanges,listType);
	}
	@Transactional
	public stockexchangeDto addStockExchange(stockExchangeEntity stockExchange) {
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 return modelMapper.map(stockExchangeRepo.save(stockExchange), stockexchangeDto.class);
	}
}
