package com.travel.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;
import com.travel.service.DestinationsService;
import com.travel.util.DestinationsConverter;

@RestController
public class DestinationsController {
	
	@Autowired
	DestinationsService destinationsService;
	
	@Autowired
	DestinationsConverter destinationsConverter;
	
	@PostMapping("/saveDestination")
	public DestinationsDto saveDestination(@Valid @RequestBody DestinationsDto destinationsDto)
	{
		final Destinations destinations = destinationsConverter.convertDtoToEntity(destinationsDto);
		
		return destinationsService.saveDestinations(destinations);
	}
	
	@DeleteMapping("/deleteDestinationByName/{name}")
	public ResponseEntity<String> deleteDestinationByName(@PathVariable("name") String name)
	{
		destinationsService.deleteDestinationByName(name);
		return new ResponseEntity<String>(name + " is deleted successfully!!", HttpStatus.OK);	
	}
	
	@GetMapping("/getDestinationByName/{name}")
	public DestinationsDto getDestinationByName(@PathVariable("name") String name)
    {
    	return destinationsService.getDestinationByName(name);
    }
	
//	@PostMapping("/createDestination/{destName}/{destType}/{location}/{stateAndUTName}/{rating}/{description}")
//	public DestinationsDto createDestination(@PathVariable("destName") String destName,@PathVariable("destType") String destType,@PathVariable("location") String location,@PathVariable("stateAndUTName") String stateAndUTName,@PathVariable("rating") int rating,@PathVariable("description") String description)
//	{
//		return destinationsService.createDestination(destName, destType, location, stateAndUTName, description,rating);
//	}
	
	@GetMapping("/getDestinationListByType/{destType}")
	public List<DestinationsDto> getDestinationByType(@PathVariable("destType") String destType)
	{
		return destinationsService.getDestinationByType(destType);
	}
	
	@PostMapping("/assImg/{iId}/ToDest/{dId}")
	public String assignImageToDest(@PathVariable("iId") Long imageId, @PathVariable("dId") int destinationId)
	{
		destinationsService.assImgToDest(imageId, destinationId);
		
		return "Image assigned to Destination Successfully!";
	}
	
	@PutMapping("/updateDestination/{id}")
	public DestinationsDto updateDestination(@PathVariable("id") int destinationId, @Valid @RequestBody DestinationsDto destinationsDto)
	{
		final Destinations destinations = destinationsConverter.convertDtoToEntity(destinationsDto);
		return destinationsService.updateDestinations(destinationId, destinations);
	}
}