package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.StateAndUTDto;
import com.travel.entity.StateAndUT;
import com.travel.repository.StateAndUTRepository;
import com.travel.service.StateAndUTService;
import com.travel.util.StateAndUTConverter;

@Service
public class StateAndUTServiceImpi implements StateAndUTService {
	
	@Autowired
	StateAndUTRepository stateAndUTRepository;
	
	@Autowired
	StateAndUTConverter stateAndUTConverter;

	@Override
	public StateAndUTDto saveStateAndUT(StateAndUT stateAndUT) {
		
		stateAndUTRepository.save(stateAndUT);
	    
	    return stateAndUTConverter.convertEntityToDto(stateAndUT);
	}
}