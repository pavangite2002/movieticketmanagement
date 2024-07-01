package com.moviereservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviereservation.Entity.Booking;
import com.moviereservation.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping
	public ResponseEntity<Booking> reserveTickets(@RequestBody Booking booking) {
		return ResponseEntity.ok(bookingService.reserveTickets(booking));
	}
}
