package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.ReligionDto;
import com.travel.entity.Religion;
@Component
public class ReligionConverter {
    
    // Converts ReligionDto to Religion Entity
    public Religion convertDtoToEntity(ReligionDto religionDto) {
        Religion religion = new Religion();

        if (religionDto != null) {
            // Copy properties from ReligionDto to Religion entity
            BeanUtils.copyProperties(religionDto, religion);
        }
        return religion;
    }

    // Converts Religion Entity to ReligionDto
    public ReligionDto convertEntityToDto(Religion religion) {
        ReligionDto religionDto = new ReligionDto();

        if (religion != null) {
            // Copy properties from Religion entity to ReligionDto
            BeanUtils.copyProperties(religion, religionDto);
        }
        return religionDto;
    }
}