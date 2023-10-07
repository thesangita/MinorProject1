package com.travel.service;

import com.travel.dto.StateAndUTDto;
import com.travel.entity.StateAndUT;

public interface StateAndUTService {
	
	StateAndUTDto saveStateAndUT(StateAndUT stateAndUT);
	void deleteStateAndUTByName(String stateAndUTName);
}