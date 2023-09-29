package com.travel.service;

import com.travel.dto.ReligionDto;
import com.travel.entity.Religion;

public interface ReligionService {
	
	ReligionDto saveReligion(Religion religion);
}