package com.travel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	//name of the image file eg: hotel.png
	@Column(length = 20, unique = true, nullable = false)
    private String name;
	
	//jpg or png format
	@Column(length = 20)
    private String type;
    
    
    @Lob // Specifies that the 'imageData' field should be treated as a Large Object (LOB).
    @Column(length = 1000) // Customizes the database column mapping for 'imageData'.
    private byte[] imageData; // Stores binary image data.

	@OneToOne
	private Destinations destination;
}
