package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;
import com.travel.repository.DestinationsRepository;
import com.travel.service.DestinationsService;
import com.travel.util.DestinationsConverter;

@Service
public class DestinationsServiceImpi implements DestinationsService {
	
	@Autowired
	DestinationsRepository destinationsRepository;
	
	@Autowired
	DestinationsConverter destinationsConverter;

	@Override
	public DestinationsDto saveDestinations(Destinations destinations) {
		
		destinationsRepository.save(destinations);
	    
	    return destinationsConverter.convertEntityToDto(destinations);
	}
}

