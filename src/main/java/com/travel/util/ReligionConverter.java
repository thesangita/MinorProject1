package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.ReligionDto;
import com.travel.entity.Religion;
@Component
public class ReligionConverter {
    
    // Converts ReligionDto to Religion Entity
    public Religion convertDtoToEntity(ReligionDto dto) {
        Religion entity = new Religion();

        if (dto != null) {
            // Copy properties from ReligionDto to Religion entity
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    // Converts Religion Entity to ReligionDto
    public ReligionDto convertEntityToDto(Religion entity) {
        ReligionDto dto = new ReligionDto();

        if (entity != null) {
            // Copy properties from Religion entity to ReligionDto
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
