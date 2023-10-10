package com.travel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="destinations_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Destinations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int destId;
	
	@Column(length = 50, nullable = false, unique = true)
	private String destName;
		
	@Column(length = 100, nullable = false, unique = false)
	private String location;
	
	@Column(length = 150, nullable = true)
	private String imageDescription;
	
	@Column(length = 50, nullable = false)
	private String destType;
	
	private int rating;
	
	@ManyToOne
	private StateAndUT stateAndUT;
	
	@OneToOne
	private ImageData imageData;

}