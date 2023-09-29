package com.travel.service;

import com.travel.dto.LoginCredentialsDto;
import com.travel.entity.LoginCredentials;

public interface LoginCredentialsService {
	
	LoginCredentialsDto saveLoginCredentials(LoginCredentials loginCredentials);
}