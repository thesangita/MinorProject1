package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.StateAndUT;

public interface StateAndUTRepository extends JpaRepository<StateAndUT, Integer> {
	
	@Query("from state_and_ut_details where stateAndUtName=:n")
	StateAndUT findStateAndUTByName(@Param("n") String name);

	
}