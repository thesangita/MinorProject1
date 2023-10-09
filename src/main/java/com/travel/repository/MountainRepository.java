package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.Mountain;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {
	
	@Query("SELECT m FROM Mountain m WHERE m.destName = :n")
	Mountain findMountainByName(@Param("n") String name);
}