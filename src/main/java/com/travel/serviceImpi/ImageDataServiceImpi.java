package com.travel.serviceImpi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.travel.dto.ImageDataDto;
import com.travel.entity.ImageData;
import com.travel.util.ImageDataComDecom;
import com.travel.repository.ImageDataRepository;
import com.travel.service.ImageDataService;


@Service
public class ImageDataServiceImpi implements ImageDataService {

	@Autowired
	private ImageDataRepository imageRepository;
	
	@Autowired
	private ImageDataComDecom imageDataComDecom;
	
	@Override
	public String uploadImage(MultipartFile file) throws IOException {
		ImageData imageData = imageRepository.save(ImageData.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(imageDataComDecom.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
		return null;
	}

	@Override
	public byte[] downloadImage(String fileName) {
		Optional<ImageData> dbImageData = imageRepository.findByName(fileName);
        byte[] images=imageDataComDecom.decompressImage(dbImageData.get().getImageData());
        return images;
		
	}

//	@Override
//	public List<byte[]> getImageList() {
//		
//		List<ImageData> imageData = imageRepository.findAll();
//		
//		List<byte[]> onlyImageData = new ArrayList();
//		
//		for(ImageData i : imageData)
//		{
//			onlyImageData.add(i.getImageData());
//		}
//		return onlyImageData;
//	}
	
	@Override
	public List<ImageData> getImageList() {
		
		List<ImageData> imageData = imageRepository.findAll();
		
		return imageData;
	}

}
