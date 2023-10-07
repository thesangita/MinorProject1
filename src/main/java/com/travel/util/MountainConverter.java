package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.MountainDto;
import com.travel.entity.Mountain;
@Component
public class MountainConverter {
    
    // Converts MountainDto to Mountain Entity
    public Mountain convertDtoToEntity(MountainDto mountainDto) {
        Mountain mountain = new Mountain();

        if (mountainDto != null) {
            // Copy properties from MountainDto to Mountain entity
            BeanUtils.copyProperties(mountainDto, mountain);
            

        }
        return mountain;
    }

    // Converts Mountain Entity to MountainDto
    public MountainDto convertEntityToDto(Mountain mountain) {
        MountainDto mountainDto = new MountainDto();

        if (mountain != null) {
            // Copy properties from Mountain entity to MountainDto
            BeanUtils.copyProperties(mountain, mountainDto);
        }
        return mountainDto;
    }
}