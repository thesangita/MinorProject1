package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.entity.LoginCredentials;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Integer> {


}
