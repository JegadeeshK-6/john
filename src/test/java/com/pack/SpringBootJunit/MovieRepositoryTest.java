package com.pack.SpringBootJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pack.SpringBootJunit.Entity.Movie;
import com.pack.SpringBootJunit.Repository.MovieRespository;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieRepositoryTest {
    @Autowired
    MovieRespository moviRepo;
    //@Test
  /*  @Ignore
    public void testInsertMovie() {
    	Movie m=new Movie(103,"Big Bang","English","Comedy",6);
    	Movie savedInDb=moviRepo.save(m);
    	Optional opt=moviRepo.findById(savedInDb.getId());
    	Movie getFromDb=(Movie)opt.get();
    	assertEquals(savedInDb.getId(),getFromDb.getId());
    }*/
    @Test
    public void testGetAllMovie() {
    	List<Movie> l1=moviRepo.findAll();
    	List<Movie> l2=new ArrayList<>();
    	for(Movie m:l1) {
    		l2.add(m);
    	}
    	assertEquals(l1.size(),l2.size());
    }
}
