package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.entity.Mountain;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {

}
