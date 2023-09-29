package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.StateAndUTDto;
import com.travel.entity.StateAndUT;
@Component
public class StateAndUTConverter {
    
    // Converts StateAndUTDto to StateAndUT Entity
    public StateAndUT convertDtoToEntity(StateAndUTDto dto) {
        StateAndUT entity = new StateAndUT();

        if (dto != null) {
            // Copy properties from StateAndUTDto to StateAndUT entity
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }

    // Converts StateAndUT Entity to StateAndUTDto
    public StateAndUTDto convertEntityToDto(StateAndUT entity) {
        StateAndUTDto dto = new StateAndUTDto();

        if (entity != null) {
            // Copy properties from StateAndUT entity to StateAndUTDto
            BeanUtils.copyProperties(entity, dto);
            
        }
        return dto;
    }
}
