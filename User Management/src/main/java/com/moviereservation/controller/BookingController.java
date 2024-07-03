package com.moviereservation.controller;

import com.moviereservation.UserService.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviereservation.Entity.Booking;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;


	@PostMapping
	public ResponseEntity<Booking> reserveTickets(@RequestBody Booking booking) {
		return  new ResponseEntity<Booking>(bookingService.reserveTickets(booking).getBody(), HttpStatus.CREATED);

	}
}
