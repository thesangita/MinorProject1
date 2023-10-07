package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.ForestDto;
import com.travel.entity.Forest;
@Component
public class ForestConverter {
    
    // Converts ForestDto to Forest Entity
    public Forest convertDtoToEntity(ForestDto forestDto) {
        Forest forest = new Forest();

        if (forestDto != null) {
            // Copy properties from ForestDto to Forest entity
            BeanUtils.copyProperties(forestDto, forest);
            
        }
        return forest;
    }

    // Converts Forest Entity to ForestDto
    public ForestDto convertEntityToDto(Forest forest) {
        ForestDto forestDto = new ForestDto();

        if (forest != null) {
            // Copy properties from Forest entity to ForestDto
            BeanUtils.copyProperties(forest, forestDto);
            
        }
        return forestDto;
    }
}