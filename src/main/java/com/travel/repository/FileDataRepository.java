package com.travel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.entity.FileData;

public interface FileDataRepository extends JpaRepository<FileData,Integer> {

    Optional<FileData> findByName(String fileName);
}
