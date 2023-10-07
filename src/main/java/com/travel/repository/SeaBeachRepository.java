package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.SeaBeach;

public interface SeaBeachRepository extends JpaRepository<SeaBeach, Integer> {
	
	@Query("from SeaBeach where destName=:n")
	SeaBeach findSeaBeachByName(@Param("n") String name);
}