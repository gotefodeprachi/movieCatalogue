package com.movie.moviecatalogue.models;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="catalogue")
public class Movie {
	private int id;
 private String title;
 private String description;
 private String genre;
 private int rating;

 @Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public Movie(String title, String description, String genre, int rating) {
	super();
	this.title = title;
	this.description = description;
	this.genre = genre;
	this.rating = rating;
}
public String getTitle() {
	
	return title;
}
@Override
public String toString() {
	return "Movie [id=" + id + ", title=" + title + ", description=" + description + ", genre=" + genre + ", rating="
			+ rating + "]";
}
public Movie() {
	
	// TODO Auto-generated constructor stub
}

 



 
}
