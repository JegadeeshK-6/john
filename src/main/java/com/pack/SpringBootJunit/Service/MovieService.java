package com.pack.SpringBootJunit.Service;

import java.util.List;

import com.pack.SpringBootJunit.Entity.Movie;

public interface MovieService {
    public Movie insertMovie(Movie m);

	public List<Movie> getAllMovies();
}
