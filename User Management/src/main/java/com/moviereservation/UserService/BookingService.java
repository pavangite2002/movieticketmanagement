package com.moviereservation.UserService;

import com.moviereservation.Entity.Booking;
import com.moviereservation.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    public ResponseEntity<Booking> reserveTickets( Booking booking) {
        return new ResponseEntity<>(bookingRepository.save(booking), HttpStatus.CREATED);
    }

}
