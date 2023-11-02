package com.travel.service;

import java.util.List;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;

public interface DestinationsService {
	
	DestinationsDto saveDestinations(Destinations destinations);//works

	void deleteDestinationById(int destId);
	
	DestinationsDto updateDestinations(int destId, Destinations destinations);
	
	List<DestinationsDto> getDestinationList();
}