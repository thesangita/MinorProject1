package com.travel.service;

import com.travel.dto.LoginCredentialsDto;
import com.travel.dto.LoginDto;
import com.travel.entity.LoginMessage;

public interface LoginCredentialsService {
	
	String addUser(LoginCredentialsDto lcDto);

    LoginMessage loginUser(LoginDto lDto);

}