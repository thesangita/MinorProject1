package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.MountainDto;
import com.travel.entity.Mountain;
import com.travel.repository.MountainRepository;
import com.travel.service.MountainService;
import com.travel.util.MountainConverter;

@Service
public class MountainServiceImpi implements MountainService {
	
	@Autowired
	MountainRepository mountainRepository;
	
	@Autowired
	MountainConverter mountainConverter;

	@Override
	public MountainDto saveMountain(Mountain mountain) {
		
		mountainRepository.save(mountain);
	    
	    return mountainConverter.convertEntityToDto(mountain);
	}

	@Override
	public void deleteMountainByName(String mountainName) {
		
		Mountain mountain = mountainRepository.findMountainByName(mountainName);
		mountainRepository.delete(mountain);	
	}
}