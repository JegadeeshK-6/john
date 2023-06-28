package com.pack.SpringBootJunit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.SpringBootJunit.Entity.Movie;
import com.pack.SpringBootJunit.Repository.MovieRespository;
@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieRespository movieRepo;

	@Override
	public Movie insertMovie(Movie m) {
		
		return movieRepo.save(m);
	}

	@Override
	public List<Movie> getAllMovies() {
		
		return movieRepo.findAll();
	}

}