package com.stockproject.app.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockproject.app.dto.IPODto;
import com.stockproject.app.dto.companyDto;
import com.stockproject.app.entity.ipoEntity;
import com.stockproject.app.repository.IPORepository;

@Service
public class IPOService {

	private IPORepository ipoDetailDao;
	private ModelMapper modelMapper;
	public IPOService(IPORepository ipoDetailDao,ModelMapper modelMapper) {
		super();
		this.ipoDetailDao = ipoDetailDao;
		this.modelMapper = modelMapper;
	}

	@Transactional
	public List<ipoEntity> getIpoDetails(String companyName) {
		return ipoDetailDao.findBycompanyName(companyName);
	}

	@Transactional
	public ipoEntity addIpoDetail(ipoEntity ipoDetail) {
		return ipoDetailDao.save(ipoDetail);
		
	}
	@Transactional
	public List<IPODto> getIPODetails() {

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	    Type listType = new TypeToken<List<IPODto>>(){}.getType();
	    List<IPODto> resDtoList = modelMapper.map(ipoDetailDao.findAll(),listType);
	    return resDtoList;
	}
	
}
