package com.movie.moviecatalogue.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.moviecatalogue.models.Movie;
import com.movie.moviecatalogue.service.Movieservice;

@RestController
public class moviecontroller {

	@Autowired
	Movieservice movieservice;
	
	

	@PostMapping("/addmovie")
	public boolean addmovie(@RequestBody Movie mov) {
		
//		String title=map.get("title").toString();
//				String desc=map.get("description").toString();
//				
//				String Genre=map.get("genre").toString();
//				int rating=Integer.parseInt(map.get("rating").toString());
//				mov.setTitle(title);
//				mov.setDescription(desc);
//				mov.setGenre(Genre);
//				mov.setRating(rating);
			//	System.out.println(rating);
				
				return movieservice.addmovie(mov);

	}

	@PutMapping("/updatemovie")
	public boolean updatemovie(@PathVariable("title") String title ,@RequestBody Movie m) {
		return movieservice.updatemovie(m);

	}

	@GetMapping("/searchmovie/{title}")
	public Movie searchmovie(@PathVariable String title) {
		return movieservice.searchmovie(title);
	}

	@DeleteMapping("/deletemovie/{title}")
	public boolean deletemovie(@PathVariable("title") String title) {
		return movieservice.deletemovie(title);
		
		
	}

	@GetMapping("/viewallmovie")
	public List<Movie> veiwallmovie() {
		return movieservice.veiwallmovie();

	}
}