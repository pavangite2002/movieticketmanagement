package com.moviereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviereservation.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
