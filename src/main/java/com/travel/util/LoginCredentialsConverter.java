package com.travel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.travel.dto.LoginCredentialsDto;
import com.travel.entity.LoginCredentials;

@Component
public class LoginCredentialsConverter {

	//converts LoginCredentials Dto to LoginCredentials Entity
	public LoginCredentials convertDtoToEntity(LoginCredentialsDto lcDto)
	{
		LoginCredentials lc = new LoginCredentials();
		
		if(lcDto!=null)
		{
			BeanUtils.copyProperties(lcDto, lc);
		}	
		return lc;
	}
	
	//converts LoginCredentials Entity to LoginCredentials Dto
	public LoginCredentialsDto convertEntityToDto(LoginCredentials lc)
	{
		LoginCredentialsDto lcDto = new LoginCredentialsDto();
		
		if(lc!=null)
		{
			BeanUtils.copyProperties(lc, lcDto);
		}	
		return lcDto;
	}
}