package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class topRatedMovies {

	private int ratings;
	private Long count;
	private String movieName;

	public topRatedMovies(String movieName, int ratings, Long count) {
		this.ratings = ratings;
		this.count = count;
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public topRatedMovies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int movie) {
		this.ratings = movie;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

}
