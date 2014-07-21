package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class topRatedMovie {

	private int ratings;
	private Integer count;
	private String movieName;

	public topRatedMovie(String movieName, int ratings, Integer count) {
		this.ratings = ratings;
		this.count = count;
		this.movieName = movieName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public topRatedMovie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int movie) {
		this.ratings = movie;
	}

}
