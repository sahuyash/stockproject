package com.stockproject.app.service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockproject.app.dto.IPODto;
import com.stockproject.app.dto.companyDto;
import com.stockproject.app.entity.companyEntity;
import com.stockproject.app.entity.ipoEntity;
import com.stockproject.app.repository.IPORepository;
import com.stockproject.app.repository.companyRepository;

@Service
public class companyService {
	
private companyRepository companyDao;

private ModelMapper modelMapper;
	
private IPORepository ipoDao;


public companyService(companyRepository companyDao, ModelMapper modelMapper, IPORepository ipoDao) {
	super();
	this.companyDao = companyDao;
	this.modelMapper = modelMapper;
	this.ipoDao = ipoDao;
}


@Transactional
public List<companyDto> getCompanyDetails() {

	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    Type listType = new TypeToken<List<companyDto>>(){}.getType();
    List<companyDto> resDtoList = modelMapper.map(companyDao.findAll(),listType);
    return resDtoList;
}
@Transactional
public companyDto addCompany(companyDto companyDto) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    companyEntity company =companyDao.save(modelMapper.map(companyDto,companyEntity.class));
    return modelMapper.map(company,companyDto.class);
}
@Transactional
public List<IPODto> findByCompanyName(String name) {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    Type listType = new TypeToken<List<IPODto>>(){}.getType();
    List<ipoEntity> ipoDetails = ipoDao.findBycompanyName(name);
    if(!ipoDetails.isEmpty()) {
    	List<IPODto> resDtoList = modelMapper.map(ipoDetails, listType);
    	return resDtoList;
    }
	return null;
}

@Transactional
public List<companyDto> searchByPattern(String pattern)
{
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    Type listType = new TypeToken<List<companyDto>>(){}.getType();
    List<companyDto> postDtoList = modelMapper.map(companyDao.findByCompanyNameContaining(pattern),listType);
    return postDtoList;
	
}


@Transactional
public companyDto updateCompany(companyDto companyDto, String companyId) {
	companyEntity company = companyDao.findBycompanyId(companyId).get();
	company.setCompanyId(companyDto.getCompanyId());
	company.setCompanyName(companyDto.getCompanyName());
	company.setCeo(companyDto.getCeo());
	company.setBriefDescription(companyDto.getBriefDescription());
	company.setSector(companyDto.getSector());
	company.setTurnover(companyDto.getTurnover());
	companyDao.save(company);
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	return modelMapper.map(company,companyDto.class);
	
}
@Transactional
public companyDto findCompanyById(String id) {
	// TODO Auto-generated method stub
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    Optional<companyEntity> company = companyDao.findBycompanyId(id);
	if(company.isPresent()) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		System.out.println(id);
		companyDto companyDto = modelMapper.map(company, companyDto.class);
		
		return companyDto;
	}
	return null;
}
}
