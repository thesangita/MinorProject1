package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.SeaBeachDto;
import com.travel.entity.SeaBeach;
@Component
public class SeaBeachConverter {
    
    // Converts SeaBeachDto to SeaBeach Entity
    public SeaBeach convertDtoToEntity(SeaBeachDto dto) {
        SeaBeach entity = new SeaBeach();

        if (dto != null) {
            // Copy properties from SeaBeachDto to SeaBeach entity
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    // Converts SeaBeach Entity to SeaBeachDto
    public SeaBeachDto convertEntityToDto(SeaBeach entity) {
        SeaBeachDto dto = new SeaBeachDto();

        if (entity != null) {
            // Copy properties from SeaBeach entity to SeaBeachDto
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
