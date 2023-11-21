package com.travel.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileDataService {
	
	public String uploadImageToFileSystem(MultipartFile file) throws IOException;
	
	public byte[] downloadImageFromFileSystem(String fileName) throws IOException ;
	
	public void imageDelete(int id);
}