package com.pack.SpringBootJunit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pack.SpringBootJunit.Entity.Movie;

public interface MovieRespository extends JpaRepository<Movie,Integer>{

}
