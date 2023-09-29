package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.entity.Destinations;

public interface DestinationsRepository extends JpaRepository<Destinations, Integer> {

}
