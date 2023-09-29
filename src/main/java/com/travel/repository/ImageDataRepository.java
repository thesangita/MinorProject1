package com.travel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.entity.ImageData;

public interface ImageDataRepository extends JpaRepository<ImageData, Long>{

	//fetch images from sql by name
	Optional<ImageData> findByName(String fileName);
}
