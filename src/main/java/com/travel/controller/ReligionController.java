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

import com.travel.dto.ReligionDto;
import com.travel.entity.Religion;
import com.travel.service.ReligionService;
import com.travel.util.ReligionConverter;

@RestController
public class ReligionController {
	
	@Autowired
	ReligionService religionService;
	
	@Autowired
	ReligionConverter religionConverter;
	
	@PostMapping("/saveReligiousDestination")
	public ReligionDto saveReligion(@Valid @RequestBody ReligionDto religionDto)
	{
		final Religion religion = religionConverter.convertDtoToEntity(religionDto);
		
		return religionService.saveReligion(religion);
	}
	
	@DeleteMapping("/deleteReligiousDestinationByName/{name}")
	public ResponseEntity<String> deleteReligionByName(@PathVariable("name") String name)
	{
		religionService.deleteReligiousPlaceByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}