package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MoviesByReviews {

	private Long count;
	private String movieName;

	
	public MoviesByReviews(String movieName,Long count ) {
		this.count += count;
		this.movieName = movieName;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public MoviesByReviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}