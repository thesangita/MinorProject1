package com.travel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageDataDto {

	private Long id;

	//adding validation
	@NotNull(message="image name is required")
	@Size( max=20, message="max 20 char allowed")
    private String name;
   
	private String type;
    
    private byte[] imageData; 

}
