package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travel.entity.Forest;

public interface ForestRepository extends JpaRepository<Forest, Integer> {
	
	@Query("SELECT f FROM Forest f WHERE f.destName = :n")
	Forest findForestByName(@Param("n") String name);
}