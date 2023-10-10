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

import com.travel.dto.MountainDto;
import com.travel.entity.Mountain;
import com.travel.service.MountainService;
import com.travel.util.MountainConverter;

@RestController
public class MountainController {
	
	@Autowired
	MountainService mountainService;
	
	@Autowired
	MountainConverter mountainConverter;
	
	@PostMapping("/saveMountainDestination")
	public MountainDto saveMountain(@Valid @RequestBody MountainDto mountainDto)
	{
		final Mountain mountain = mountainConverter.convertDtoToEntity(mountainDto);
		
		return mountainService.saveMountain(mountain);
	}
	
	@DeleteMapping("/deleteMountainDestinationByName/{name}")
	public ResponseEntity<String> deleteMountainByName(@PathVariable("name") String name)
	{
		mountainService.deleteMountainByName(name);
		return new ResponseEntity<String>(name + "is deleted successfully!!", HttpStatus.OK);	
	}
}