package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.ForestDto;
import com.travel.entity.Forest;
@Component
public class ForestConverter {
    
    // Converts ForestDto to Forest Entity
    public Forest convertDtoToEntity(ForestDto dto) {
        Forest entity = new Forest();

        if (dto != null) {
            // Copy properties from ForestDto to Forest entity
            BeanUtils.copyProperties(dto, entity);
            
        }
        return entity;
    }

    // Converts Forest Entity to ForestDto
    public ForestDto convertEntityToDto(Forest entity) {
        ForestDto dto = new ForestDto();

        if (entity != null) {
            // Copy properties from Forest entity to ForestDto
            BeanUtils.copyProperties(entity, dto);
            
        }
        return dto;
    }
}
