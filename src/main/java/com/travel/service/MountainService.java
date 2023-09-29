package com.travel.service;

import com.travel.dto.MountainDto;
import com.travel.entity.Mountain;

public interface MountainService {
	
	MountainDto saveMountain(Mountain mountain);
}