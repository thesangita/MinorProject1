package com.travel.dto;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeritageDto extends DestinationsDto {

    @Size(max = 10, message = "Max. limit is 10")
    private String ageOfSite;
}
