package com.travel.serviceImpi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.exception.ResourceNotFound;
import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;
import com.travel.entity.ImageData;
import com.travel.repository.DestinationsRepository;
import com.travel.repository.ImageDataRepository;
import com.travel.repository.StateAndUTRepository;
import com.travel.service.DestinationsService;
import com.travel.util.DestinationsConverter;

@Service
public class DestinationsServiceImpi implements DestinationsService {
	
	@Autowired
	DestinationsRepository destinationsRepository;
	
	@Autowired
	DestinationsConverter destinationsConverter;
	
	@Autowired
	StateAndUTRepository stateAndUTRepository;
	
	@Autowired
	ImageDataRepository imageDataRepository;
	
	@Autowired
	FileDataService fileDataService;

	@Override
	public DestinationsDto saveDestinations(Destinations destinations) {
		
		destinationsRepository.save(destinations);
	    
	    return destinationsConverter.convertEntityToDto(destinations);
	}
	
	
	@Override
	public DestinationsDto updateDestinations(int destId, Destinations destinations) {
		
		Destinations exisDestinations =  destinationsRepository.findById(destId).orElseThrow(()-> new ResourceNotFound("Destination", "id", destId));
		
		
		exisDestinations.setDestName(destinations.getDestName());
		exisDestinations.setDestType(destinations.getDestType());
		exisDestinations.setImageDescription(destinations.getImageDescription());	

		destinationsRepository.save(exisDestinations);
		return destinationsConverter.convertEntityToDto(exisDestinations);
	}

	@Override
	public List<DestinationsDto> getDestinationList() {
		
		List<Destinations> destinations = destinationsRepository.findAll();
		
		List<DestinationsDto> destinationsDto = new ArrayList<>();
		
		for(Destinations d : destinations)
		{
			DestinationsDto destinationDto = destinationsConverter.convertEntityToDto(d);
			destinationsDto.add(destinationDto);
		}
		return destinationsDto;
	}


	@Override
	public void deleteDestinationById(int destId) {
		
		Destinations destination =  destinationsRepository.findById(destId).orElseThrow(()-> new ResourceNotFound("Destination", "id",destId));
		destinationsRepository.delete(destination);
		
		//call delete method for image as well
		fileDataService.imageDelete(destId);
		
	}
}