package com.travel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.travel.entity.LoginCredentials;
@EnableJpaRepositories
@Repository
public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Integer> {
	
	Optional<LoginCredentials> findOneByUserNameAndPassword(String username, String password);

    LoginCredentials findByUserName(String email);
}