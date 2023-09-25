package com.travel.dto;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeaBeachDto extends DestinationsDto {

    private boolean coralOrNot;

    @Size(max = 50, message = "Max. limit is 50")
    private String waveStrength;
}