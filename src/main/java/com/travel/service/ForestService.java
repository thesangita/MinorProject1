package com.travel.service;

import com.travel.dto.ForestDto;
import com.travel.entity.Forest;

public interface ForestService {
	
	ForestDto saveForest(Forest forest);
}