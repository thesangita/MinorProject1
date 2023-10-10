package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.ForestDto;
import com.travel.entity.Forest;
import com.travel.repository.ForestRepository;
import com.travel.service.ForestService;
import com.travel.util.ForestConverter;

@Service
public class ForestServiceImpi implements ForestService {
	
	@Autowired
	ForestRepository forestRepository;
	
	@Autowired
	ForestConverter forestConverter;

	@Override
	public ForestDto saveForest(Forest forest) {
		
		forestRepository.save(forest);
	    
	    return forestConverter.convertEntityToDto(forest);
	}

	@Override
	public void deleteForestByName(String forestName) {
		
		Forest forest = forestRepository.findForestByName(forestName);
		forestRepository.delete(forest);		
	}
}