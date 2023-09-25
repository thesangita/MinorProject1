package com.travel.dto;

import java.util.List;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.travel.entity.Destinations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateAndUTDto {

    private int stateAndUtId;

    @Size(max = 50, message = "Max. limit is 50")
    @NotNull(message = "State or UT name is required")
    private String stateAndUtName;
    
    @OneToMany
	private List<Destinations> destinations;  
}