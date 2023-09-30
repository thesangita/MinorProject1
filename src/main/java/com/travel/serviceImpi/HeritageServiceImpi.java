package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.HeritageDto;
import com.travel.entity.Heritage;
import com.travel.repository.HeritageRepository;
import com.travel.service.HeritageService;
import com.travel.util.HeritageConverter;

@Service
public class HeritageServiceImpi implements HeritageService {
	
	@Autowired
	HeritageRepository heritageRepository;
	
	@Autowired
	HeritageConverter heritageConverter;

	@Override
	public HeritageDto saveHeritage(Heritage heritage) {
		
		heritageRepository.save(heritage);
	    
	    return heritageConverter.convertEntityToDto(heritage);
	}
}
