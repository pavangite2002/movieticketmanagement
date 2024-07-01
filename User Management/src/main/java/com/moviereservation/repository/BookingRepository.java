package com.moviereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviereservation.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
