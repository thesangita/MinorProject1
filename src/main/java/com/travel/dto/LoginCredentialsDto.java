package com.travel.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginCredentialsDto {
	
	private int userId;
	
	@Size(max = 50, message="Max. limit is 50")
	@NotNull(message="name is required")
	private String name;
	
	@Size(max = 60, message="Max. limit is 60")
	@NotNull(message="email is required")
	private String email;
	
	@Size(max = 15, message="Max. limit is 15")
	@Size(min = 5, message="Min. limit is 5")
	@NotNull(message="username is required")
	private String userName;
	
	@Size(max = 10, message="Max. limit is 10")
	@Size(min = 6, message="Min. limit is 6")
	@NotNull(message="password is required")
	private String password;
}