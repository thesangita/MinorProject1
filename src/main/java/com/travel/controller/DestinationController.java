package com.travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;
import com.travel.service.DestinationsService;
import com.travel.util.DestinationsConverter;

@RestController
@RequestMapping("/dest")
@CrossOrigin(origins = "http://localhost:4200")
public class DestinationController {

	@Autowired
	private DestinationsService destService;
	
	@Autowired
	private DestinationsConverter destConvertor;
	
	@PostMapping 
	public DestinationsDto saveStudent( @RequestBody DestinationsDto destDto)//mapps jason to this
	{
		final Destinations dest = destConvertor.convertDtoToEntity(destDto);
		return destService.saveDestinations(dest);
	}
	
}
