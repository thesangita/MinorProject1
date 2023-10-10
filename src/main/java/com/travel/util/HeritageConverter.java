package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.HeritageDto;
import com.travel.entity.Heritage;
@Component
public class HeritageConverter {
    
    // Converts HeritageDto to Heritage Entity
    public Heritage convertDtoToEntity(HeritageDto heritageDto ) {
        Heritage heritage = new Heritage();

        if (heritageDto != null) {
            // Copy properties from HeritageDto to Heritage entity
            BeanUtils.copyProperties(heritageDto, heritage);
        }
        return heritage;
    }

    // Converts Heritage Entity to HeritageDto
    public HeritageDto convertEntityToDto(Heritage heritage) {
        HeritageDto heritageDto = new HeritageDto();

        if (heritage != null) {
            // Copy properties from Heritage entity to HeritageDto
            BeanUtils.copyProperties(heritage, heritageDto);
        }
        return heritageDto;
    }
}