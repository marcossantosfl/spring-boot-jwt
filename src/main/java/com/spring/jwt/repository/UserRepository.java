package com.spring.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jwt.model.Account;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByUsername(String username);

	Boolean existsByUsername(String username);

}