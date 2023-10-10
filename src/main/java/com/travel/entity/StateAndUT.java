package com.travel.entity;

import java.util.List;

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

@Table(name="state_and_ut_details")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StateAndUT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateAndUtId;
	
	@Column(length = 50, nullable = false, unique = true)
	private String stateAndUtName;
}