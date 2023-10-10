package com.travel.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String resourceName;

	private String feildName;
	
	private Object feildValue;
	
	
	public ResourceNotFound(String resourceName, String feildName, Object feildValue) {
		super(String.format("%s not found with %s : '%s'",resourceName,feildName,feildValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}	
}