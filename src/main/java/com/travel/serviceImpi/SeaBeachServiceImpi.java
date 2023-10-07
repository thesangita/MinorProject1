package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.SeaBeachDto;
import com.travel.entity.SeaBeach;
import com.travel.repository.SeaBeachRepository;
import com.travel.service.SeaBeachService;
import com.travel.util.SeaBeachConverter;

@Service
public class SeaBeachServiceImpi implements SeaBeachService {
	
	@Autowired
	SeaBeachRepository seaBeachRepository;
	
	@Autowired
	SeaBeachConverter seaBeachConverter;

	@Override
	public SeaBeachDto saveSeaBeach(SeaBeach seaBeach) {
		
		seaBeachRepository.save(seaBeach);
	    
	    return seaBeachConverter.convertEntityToDto(seaBeach);
	}

	@Override
	public void deleteSeaBeachByName(String seaBeachName) {
		
		SeaBeach seaBeach = seaBeachRepository.findSeaBeachByName(seaBeachName);
		seaBeachRepository.delete(seaBeach);		
	}
}