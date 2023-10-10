package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.ReligionDto;
import com.travel.entity.Religion;
import com.travel.repository.ReligionRepository;
import com.travel.service.ReligionService;
import com.travel.util.ReligionConverter;

@Service
public class ReligionServiceImpi implements ReligionService {
	
	@Autowired
	ReligionRepository religionRepository;
	
	@Autowired
	ReligionConverter religionConverter;

	@Override
	public ReligionDto saveReligion(Religion religion) {
		
		religionRepository.save(religion);
	    
	    return religionConverter.convertEntityToDto(religion);
	}

	@Override
	public void deleteReligiousPlaceByName(String ReligiousPlaceName) {
		
		Religion religion = religionRepository.findReligiousPlaceByName(ReligiousPlaceName);
		religionRepository.delete(religion);			
	}
}