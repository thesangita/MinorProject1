package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.SeaBeachDto;
import com.travel.entity.SeaBeach;
@Component
public class SeaBeachConverter {
    
    // Converts SeaBeachDto to SeaBeach Entity
    public SeaBeach convertDtoToEntity(SeaBeachDto seaBeachDto) {
        SeaBeach seaBeach = new SeaBeach();

        if (seaBeachDto != null) {
            // Copy properties from SeaBeachDto to SeaBeach entity
            BeanUtils.copyProperties(seaBeachDto, seaBeach);
        }
        return seaBeach;
    }

    // Converts SeaBeach Entity to SeaBeachDto
    public SeaBeachDto convertEntityToDto(SeaBeach seaBeach) {
        SeaBeachDto seaBeachDto = new SeaBeachDto();

        if (seaBeach != null) {
            // Copy properties from SeaBeach entity to SeaBeachDto
            BeanUtils.copyProperties(seaBeach, seaBeachDto);
        }
        return seaBeachDto;
    }
}