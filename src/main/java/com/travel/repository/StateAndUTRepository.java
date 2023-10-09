package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.StateAndUT;

public interface StateAndUTRepository extends JpaRepository<StateAndUT, Integer> {
	
	@Query("SELECT s FROM StateAndUT s WHERE s.stateAndUtName = :name")
	StateAndUT findStateAndUTByName(@Param("n") String name);

	
}