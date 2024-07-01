package com.moviereservation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviereservation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 Optional<User> findByEmail(String email);
}

