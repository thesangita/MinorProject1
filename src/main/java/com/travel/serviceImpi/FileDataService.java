package com.travel.serviceImpi;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.travel.entity.Destinations;
import com.travel.entity.FileData;
import com.travel.exception.ResourceNotFound;
import com.travel.repository.DestinationsRepository;
import com.travel.repository.FileDataRepository;
import com.travel.util.ImageDataComDecom;
import java.io.File;
import java.util.Optional;
import java.nio.file.Files;

@Service
public class FileDataService {
	
	@Autowired
    private FileDataRepository fileDataRepository;
	
	@Autowired
    private DestinationsRepository destinationsRepository;
	
	//@Autowired
	//private ImageDataComDecom imageDataComDecom;
	
	private final String FOLDER_PATH="S:/minor_project/frontenCopy/fontentcopy/src/assets/images/";
	
	public String uploadImageToFileSystem(MultipartFile file) throws IOException {
        String filePath=FOLDER_PATH+file.getOriginalFilename();

        FileData fileData=fileDataRepository.save(FileData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .filePath(filePath).build());

        file.transferTo(new File(filePath));

        if (fileData != null) {
        	//method to update the imageFile in destination table ('asset/images/+name')
        	
        	String destName =file.getOriginalFilename();
        	Destinations destination= destinationsRepository.findDestinationByName(destName.substring(0, destName.length() - 4));
        	//String name = file.getOriginalFilename();
        	
        	destination.setImageFile("assets/images/"+destName);
        	destinationsRepository.save(destination);
        	
            return "file uploaded successfully : " + filePath;
        }
        
        return null;
    }

    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
        Optional<FileData> fileData = fileDataRepository.findByName(fileName);
        String filePath=fileData.get().getFilePath();
        byte[] images = Files.readAllBytes(new File(filePath).toPath());
        return images;
    }
    
    public void imageDelete(int id) {
    	FileData fileData = fileDataRepository.findById(id)
    			.orElseThrow(()-> new ResourceNotFound("Image", "id",id));
    	fileDataRepository.delete(fileData);
    }

}
