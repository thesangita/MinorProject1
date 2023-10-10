package com.travel.service;

import com.travel.dto.SeaBeachDto;
import com.travel.entity.SeaBeach;

public interface SeaBeachService {
	
	SeaBeachDto saveSeaBeach(SeaBeach seaBeachDto);
	void deleteSeaBeachByName(String seaBeachName) ;
}