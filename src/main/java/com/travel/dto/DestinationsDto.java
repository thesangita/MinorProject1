package com.travel.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class DestinationsDto {

    private int destId;

    @NotBlank(message = "Destination name is required")
    @Size(max = 50, message = "Max. limit is 50")
    private String destName;

    @NotBlank(message = "location is required")
    @Size(max = 100, message = "Max. limit is 100")
    private String imageLocation;

    @Size(max = 150, message = "Max. limit is 150")
    private String imageDescription;

    @NotBlank(message = "Destination type is required")
    @Size(max = 50, message = "Max. limit is 50")
    private String destType;

    private float popularityScore;
    
    @NotBlank(message = "State or UT name is required")
    @Size(max = 60, message = "Max. limit is 60")
    private String stateAndUTName;
    
	private String imageFile;
}