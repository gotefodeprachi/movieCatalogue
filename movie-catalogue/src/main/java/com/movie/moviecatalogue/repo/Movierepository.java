package com.movie.moviecatalogue.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.moviecatalogue.models.Movie;


@Repository
public interface Movierepository extends JpaRepository<Movie,Integer>{

	List<Movie> findByTitle(String title);
	List<Movie> deleteByTitle(String title);

	//boolean deleteByTitle(String title);
	
}
