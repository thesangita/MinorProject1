package com.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.dto.DestinationsDto;
import com.travel.entity.StateAndUT;

public interface StateAndUTRepository extends JpaRepository<StateAndUT, Integer> {
	
	@Query("SELECT s FROM StateAndUT s WHERE s.stateAndUtName = :name")
	StateAndUT findStateAndUTByName(@Param("name") String name);
	
	@Query("from Destinations where state_ut=(from StateAndUT where stateAndUtName=:name)")
	List<DestinationsDto> getDestinationsList(@Param("name") String name);	
}