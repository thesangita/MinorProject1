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

	@Override
	public DestinationsDto saveDestinations(Destinations destinations) {
		
		destinationsRepository.save(destinations);
	    
	    return destinationsConverter.convertEntityToDto(destinations);
	}
	
	@Override
	public void deleteDestinationByName(String destinationName) {
		
		Destinations destinations = destinationsRepository.findDestinationByName(destinationName);
		destinationsRepository.delete(destinations);		
	}

	@Override
	public DestinationsDto getDestinationByName(String destinationName) {
		
		Destinations destinations = destinationsRepository.findDestinationByName(destinationName);
		return destinationsConverter.convertEntityToDto(destinations);
	}

	@Override
	public List<DestinationsDto> getDestinationByType(String destinationtype) {
		
		List<Destinations> destinations = destinationsRepository.findAll();
		
		List<DestinationsDto> destinationsDto = new ArrayList<>();
		
		for(Destinations d : destinations)
		{
			if(d.getDestType().equals(destinationtype))
			{
				DestinationsDto destinationDto = destinationsConverter.convertEntityToDto(d);
				destinationsDto.add(destinationDto);
		    }
		}
		return destinationsDto;
	}

//	@Override
//	public DestinationsDto createDestination(String destName, String destType, String location, String stateAndUT, String description, int rating) {
//		
//		Destinations destination = new Destinations();
//		destination.setDestName(destName);
//		destination.setDestType(destType);
//		destination.setImageDescription(description);
//		destination.setLocation(location);
//		
//		List<StateAndUT> stateAndUTs = stateAndUTRepository.findAll();
//		for(StateAndUT su : stateAndUTs)
//		{
//			if(su.getStateAndUtName().equalsIgnoreCase(stateAndUT))
//			{
//				destination.setStateAndUT(su);
//			}
//		}
//		destinationsRepository.save(destination);
//		return destinationsConverter.convertEntityToDto(destination);
//	}

//	@Override
//	public void assImgToDest(Long iId, int dId) {
//		
//		Destinations destinations = destinationsRepository.findById(dId).orElseThrow(()-> new ResourceNotFound("Destination", "id", dId));
//		
//		ImageData imageData = imageDataRepository.findById(iId).orElseThrow(()-> new ResourceNotFound("Image", "id", iId));
//		
//		destinations.setImageData(imageData);
//		
//		destinationsRepository.save(destinations);
//	}
	
	@Override
	public DestinationsDto updateDestinations(int destId, Destinations destinations) {
		
		Destinations exisDestinations =  destinationsRepository.findById(destId).orElseThrow(()-> new ResourceNotFound("Destination", "id", destId));
		
		exisDestinations.setDestId(destinations.getDestId());
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
}