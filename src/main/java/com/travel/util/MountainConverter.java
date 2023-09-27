package com.travel.util;

import org.springframework.beans.BeanUtils;
import com.travel.dto.MountainDto;
import com.travel.entity.Mountain;

public class MountainConverter {
    
    // Converts MountainDto to Mountain Entity
    public Mountain convertDtoToEntity(MountainDto dto) {
        Mountain entity = new Mountain();

        if (dto != null) {
            // Copy properties from MountainDto to Mountain entity
            BeanUtils.copyProperties(dto, entity);
            

        }
        return entity;
    }

    // Converts Mountain Entity to MountainDto
    public MountainDto convertEntityToDto(Mountain entity) {
        MountainDto dto = new MountainDto();

        if (entity != null) {
            // Copy properties from Mountain entity to MountainDto
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
