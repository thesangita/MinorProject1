package com.travel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MountainDto extends DestinationsDto {

    private double height;
    private double distance;
    private int accessibility;
}
