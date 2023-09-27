package com.travel.util;

import org.springframework.beans.BeanUtils;
import com.travel.dto.HeritageDto;
import com.travel.entity.Heritage;

public class HeritageConverter {
    
    // Converts HeritageDto to Heritage Entity
    public Heritage convertDtoToEntity(HeritageDto dto) {
        Heritage entity = new Heritage();

        if (dto != null) {
            // Copy properties from HeritageDto to Heritage entity
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    // Converts Heritage Entity to HeritageDto
    public HeritageDto convertEntityToDto(Heritage entity) {
        HeritageDto dto = new HeritageDto();

        if (entity != null) {
            // Copy properties from Heritage entity to HeritageDto
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
