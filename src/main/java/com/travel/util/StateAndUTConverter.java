package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.StateAndUTDto;
import com.travel.entity.StateAndUT;

@Component
public class StateAndUTConverter {
    
    // Converts StateAndUTDto to StateAndUT Entity
    public StateAndUT convertDtoToEntity(StateAndUTDto stateAndUTDto) {
        StateAndUT stateAndUT = new StateAndUT();

        if (stateAndUTDto != null) {
            // Copy properties from StateAndUTDto to StateAndUT entity
            BeanUtils.copyProperties(stateAndUTDto, stateAndUT);
        }
        return stateAndUT;
    }

    // Converts StateAndUT Entity to StateAndUTDto
    public StateAndUTDto convertEntityToDto(StateAndUT stateAndUT) {
        StateAndUTDto stateAndUTDto = new StateAndUTDto();

        if (stateAndUT != null) {
            // Copy properties from StateAndUT entity to StateAndUTDto
            BeanUtils.copyProperties(stateAndUT, stateAndUTDto);
            
        }
        return stateAndUTDto;
    }
}