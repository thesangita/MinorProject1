package com.travel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
	@Size(max = 15, message="Max. limit is 15")
	@Size(min = 5, message="Min. limit is 5")
	@NotNull(message="username is required")
	private String userName;
	
	@Size(max = 10, message="Max. limit is 10")
	@Size(min = 6, message="Min. limit is 6")
	@NotNull(message="password is required")
	private String password;
}