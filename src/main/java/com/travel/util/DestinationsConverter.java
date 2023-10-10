package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.DestinationsDto;
import com.travel.entity.Destinations;
@Component
public class DestinationsConverter {
    
    // Converts DestinationsDto to Destination Entity
    public Destinations convertDtoToEntity(DestinationsDto destDto) {
        Destinations dest = new Destinations();

        if (destDto != null) {
            BeanUtils.copyProperties(destDto, dest);
        }
        return dest;
    }

    // Converts Destination Entity to DestinationsDto
    public DestinationsDto convertEntityToDto(Destinations dest) {
        DestinationsDto destDto = new DestinationsDto();

        if (dest != null) {
            BeanUtils.copyProperties(dest, destDto);
        }
        return destDto;
    }
}