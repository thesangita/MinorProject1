package com.travel.service;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;

public interface DestinationsService {
	
	DestinationsDto saveDestinations(Destinations destinations);
}