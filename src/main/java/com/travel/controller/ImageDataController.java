package com.travel.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.travel.entity.ImageData;
import com.travel.service.ImageDataService;


@RestController
@RequestMapping("/image")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageDataController {
	
	@Autowired
	private ImageDataService imageDataService;

	@PostMapping
	public ResponseEntity<?> uploadImage(@RequestParam("imageFile")MultipartFile file) throws IOException {

	    String originalFileName = file.getOriginalFilename();
	    String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1).toLowerCase();

	    if (!fileExtension.equals("png") && !fileExtension.equals("jpg") && !fileExtension.equals("jpeg")) {
	    	Map<String, String> errorResponse = new HashMap<>();
	        errorResponse.put("message", "Unsupported file format. Please upload a PNG or JPEG image.");
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
	            .body(errorResponse);	    	
	
	    }

		String uploadImage = imageDataService.uploadImage(file);
		Map<String, String> response = new HashMap<String, String>();

		response.put("message", "Image uploaded successfully");
	    response.put("fileName", uploadImage); // You can add more data if needed
	    return ResponseEntity.status(HttpStatus.OK)
	        .body(response);
	}
	

	@GetMapping("/{fileName}")
	public ResponseEntity<byte[]> downloadImage(@PathVariable String fileName) {
	    byte[] imageData = imageDataService.downloadImage(fileName);
	    String contentType = getContentTypeFromFileName(fileName);

	    return ResponseEntity.status(HttpStatus.OK)
	        .contentType(MediaType.valueOf(contentType))
	        .body(imageData);
	}

	
	
	//to be able to fetch both png and jpg images
	private String getContentTypeFromFileName(String fileName) {
	    if (fileName.endsWith(".png")) {
	        return "image/png";
	    } else if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) {
	        return "image/jpeg";
	    } else {
	        // Handle other formats as needed
	        return "application/octet-stream"; // Default to binary if format is unknown
	    }
	}

	@GetMapping("/getAllImage")
	public ResponseEntity<List<byte[]>> downloadAllImages() {
	    List<byte[]> imageList = imageDataService.getImageList();
	    return ResponseEntity.status(HttpStatus.OK)
	        .body(imageList);
	}

	//delete by id
	
}
