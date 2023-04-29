package com.movie.moviecatalogue.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.moviecatalogue.models.Movie;
import com.movie.moviecatalogue.repo.Movierepository;

@Service
public class Movieservice {
	
	@Autowired 
	Movierepository movrepo;
	
	
	List<Movie> moviearray = Arrays.asList(new Movie("ABC","DEF","GHI",5), new Movie("singham","good","action",8));
	
	public boolean addmovie(Movie m) {
		System.out.println("sttt");

		
		movrepo.save(m);
		return true;

	}

	public boolean updatemovie(Movie m) {
		return true;

	}

	public Movie searchmovie(String title) {
		for(Movie mov:moviearray) {
			if(mov.getTitle().equals(title)) {
				return mov;
			}
		}
		return null;
	}

	public boolean deletemovie(String title) {
		

		List<Movie>temp= movrepo.findByTitle(title);
		
		movrepo.delete(temp.get(0));
		
		return false;

	}

	public List<Movie> veiwallmovie() {
		
		return movrepo.findAll();

	}
	

}
