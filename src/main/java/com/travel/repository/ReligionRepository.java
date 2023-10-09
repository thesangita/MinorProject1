package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.Religion;

public interface ReligionRepository extends JpaRepository<Religion, Integer> {
	
	@Query("SELECT r FROM Religion r WHERE r.destName = :n")
	Religion findReligiousPlaceByName(@Param("n") String name);
}