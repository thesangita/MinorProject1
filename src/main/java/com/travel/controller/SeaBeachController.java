package com.travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.dto.SeaBeachDto;
import com.travel.entity.SeaBeach;
import com.travel.service.SeaBeachService;
import com.travel.util.SeaBeachConverter;

@RestController
public class SeaBeachController {
	
	@Autowired
	SeaBeachService seaBeachService;
	
	@Autowired
	SeaBeachConverter seaBeachConverter;
	
	@PostMapping("/saveSeaBeachDestination")
	public SeaBeachDto saveSeaBeach(@Valid @RequestBody SeaBeachDto seaBeachDto)
	{
		final SeaBeach seaBeach = seaBeachConverter.convertDtoToEntity(seaBeachDto);
		
		return seaBeachService.saveSeaBeach(seaBeach);
	}
	
	@DeleteMapping("/deleteForestDestinationByName/{name}")
	public ResponseEntity<String> deleteSeaBeachByName(@PathVariable("name") String name)
	{
		seaBeachService.deleteSeaBeachByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}