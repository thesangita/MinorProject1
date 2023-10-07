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

import com.travel.dto.StateAndUTDto;
import com.travel.entity.StateAndUT;
import com.travel.service.StateAndUTService;
import com.travel.util.StateAndUTConverter;

@RestController
public class StateAndUTController {
	
	@Autowired
	StateAndUTService stateAndUTService;
	
	@Autowired
	StateAndUTConverter stateAndUTConverter;
	
	@PostMapping("/saveStateAndUT")
	public StateAndUTDto saveStateAndUT(@Valid @RequestBody StateAndUTDto stateAndUTDto)
	{
		final StateAndUT StateAndUT = stateAndUTConverter.convertDtoToEntity(stateAndUTDto);
		
		return stateAndUTService.saveStateAndUT(StateAndUT);
	}
	
	@DeleteMapping("/deleteStateAndUTByName/{name}")
	public ResponseEntity<String> deleteStateAndUTByName(@PathVariable("name") String name)
	{
		stateAndUTService.deleteStateAndUTByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}