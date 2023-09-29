package com.travel.service;

import com.travel.dto.HeritageDto;
import com.travel.entity.Heritage;

public interface HeritageService {
	
	HeritageDto saveHeritage(Heritage heritage);
}