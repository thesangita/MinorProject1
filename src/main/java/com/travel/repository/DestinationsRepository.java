package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.Destinations;

public interface DestinationsRepository extends JpaRepository<Destinations, Integer> {
	
	@Query("SELECT d FROM Destinations d WHERE d.destName = :name")
	Destinations findDestinationByName(@Param("name") String name);
	

}
