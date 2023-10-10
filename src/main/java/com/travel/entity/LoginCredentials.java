package com.travel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="user_details")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class LoginCredentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 60, nullable = false, unique = true)
	private String email;
	
	@Column(length = 15, nullable = false, unique = true)
	private String userName;
	
	@Column(nullable = false, unique = true)
	private String password;
}