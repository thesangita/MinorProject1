package com.travel.util;

import org.springframework.beans.BeanUtils;
import com.travel.dto.LoginCredentialsDto;
import com.travel.entity.LoginCredentials;

public class LoginCredentialsConverter {

	//converts LoginCredentials Dto to LoginCredentials Entity
	public LoginCredentials convertDtoToLoginCredEntity(LoginCredentialsDto lcDto)
	{
		LoginCredentials lc = new LoginCredentials();
		
		if(lcDto!=null)
		{
			BeanUtils.copyProperties(lcDto, lc);
		}	
		return lc;
	}
	
	//converts LoginCredentials Entity to LoginCredentials Dto
	public LoginCredentialsDto convertEntityToLoginCredDto(LoginCredentials lc)
	{
		LoginCredentialsDto lcDto = new LoginCredentialsDto();
		
		if(lc!=null)
		{
			BeanUtils.copyProperties(lc, lcDto);
		}	
		return lcDto;
	}
}