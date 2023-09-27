package com.travel.util;

import org.springframework.beans.BeanUtils;
import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;

public class DestinationsConverter {
    
    // Converts DestinationsDto to Destination Entity
    public Destinations convertDtoToEntity(DestinationsDto dto) {
        Destinations entity = new Destinations();

        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    // Converts Destination Entity to DestinationsDto
    public DestinationsDto convertEntityToDto(Destinations entity) {
        DestinationsDto dto = new DestinationsDto();

        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
