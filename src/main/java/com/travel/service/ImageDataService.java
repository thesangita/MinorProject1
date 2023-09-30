package com.travel.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ImageDataService {

	//method for uploading image to database 
	String uploadImage(MultipartFile file) throws IOException;
	
	//method to show the image to the user
	byte[] downloadImage(String fileName);
}
