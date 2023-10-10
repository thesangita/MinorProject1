package com.travel.service;

import java.util.List;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;

public interface DestinationsService {
	
	DestinationsDto saveDestinations(Destinations destinations);
	
	void deleteDestinationByName(String destinationName) ;
	
	DestinationsDto getDestinationByName(String destinationName);
	
	List<DestinationsDto> getDestinationByType(String destinationtype);
	
	//DestinationsDto createDestination(String destName, String destType, String location, String stateAndUT, String description, int rating);
	
	void assImgToDest(Long iId, int dId);
	
	DestinationsDto updateDestinations(int destId, Destinations destinations);
	
	List<DestinationsDto> getDestinationList();
}