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

import com.travel.dto.ForestDto;
import com.travel.entity.Forest;
import com.travel.service.ForestService;
import com.travel.util.ForestConverter;

@RestController
public class ForestController {
	
	@Autowired
	ForestService forestService;
	
	@Autowired
	ForestConverter forestConverter;
	
	@PostMapping("/saveForestDestination")
	public ForestDto saveForest(@Valid @RequestBody ForestDto forestDto)
	{
		final Forest forest = forestConverter.convertDtoToEntity(forestDto);
		
		return forestService.saveForest(forest);
	}
	
	@DeleteMapping("/deleteForestDestinationByName/{name}")
	public ResponseEntity<String> deleteForestByName(@PathVariable("name") String name)
	{
		forestService.deleteForestByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}