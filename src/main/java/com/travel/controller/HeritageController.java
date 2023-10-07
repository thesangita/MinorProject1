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

import com.travel.dto.HeritageDto;
import com.travel.entity.Heritage;
import com.travel.service.HeritageService;
import com.travel.util.HeritageConverter;

@RestController
public class HeritageController {
	
	@Autowired
	HeritageService heritageService;
	
	@Autowired
	HeritageConverter heritageConverter;
	
	@PostMapping("/saveHeritageDestination")
	public HeritageDto saveHeritageDest(@Valid @RequestBody HeritageDto heritageDto)
	{
		final Heritage heritage = heritageConverter.convertDtoToEntity(heritageDto);
		
		return heritageService.saveHeritage(heritage);
	}
	
	@DeleteMapping("/deleteHeritageDestinationByName/{name}")
	public ResponseEntity<String> deleteHeritageDestByName(@PathVariable("name") String name)
	{
		heritageService.deleteHeritagePlaceByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}