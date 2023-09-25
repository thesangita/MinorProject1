package com.travel.dto;

import javax.validation.constraints.Size;

import com.travel.entity.Destinations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForestDto  extends Destinations {
	
    @Size(max = 10, message = "Max. limit is 10")
    private String forestType;
}
