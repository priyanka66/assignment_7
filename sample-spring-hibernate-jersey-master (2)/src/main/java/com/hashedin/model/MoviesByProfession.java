package com.hashedin.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MoviesByProfession {

	
	private Long count;
	private String movieName;

	public MoviesByProfession(String movieName, Long count) {
		this.count = count;
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

	public MoviesByProfession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}