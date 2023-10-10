package com.travel.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.entity.LoginCredentials;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, Integer> {
	
	Optional<LoginCredentials> findOneByUserNameAndPassword(String username, String password);

    LoginCredentials findByUserName(String email);
}