package com.travel.serviceImpi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dto.LoginCredentialsDto;
import com.travel.entity.LoginCredentials;
import com.travel.repository.LoginCredentialsRepository;
import com.travel.service.LoginCredentialsService;
import com.travel.util.LoginCredentialsConverter;

@Service
public class LoginCredentialsServiceImpi implements LoginCredentialsService {
	
	@Autowired
	LoginCredentialsRepository loginCredentialsRepository;
	
	@Autowired
	LoginCredentialsConverter loginCredentialsConverter;

	@Override
	public LoginCredentialsDto saveLoginCredentials(LoginCredentials loginCredentials) {
		
		loginCredentialsRepository.save(loginCredentials);
	    
	    return loginCredentials.convertEntityToDto(loginCredentials);
	}
}
