package com.moviereservation.UserService;



	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereservation.Entity.Movie;
import com.moviereservation.repository.MovieRepository;

	@Service
	public class MovieService {
	    @Autowired
	    private MovieRepository movieRepository;

	    public List<Movie> getAllMovies() {
	        return movieRepository.findAll();
	    }
	}



