package com.hashedin.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "movie")
@NamedQueries({
		@NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
		@NamedQuery(name = "Movie.movieByYear", query = "SELECT NEW com.hashedin.model.movieByYear(count(m.movieName),m.movieYear)"
				+ " from Movie m group by m.movieYear ")})
public class Movie {

/*	@XmlInverseReference(mappedBy="movie")
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "movie", targetEntity = Ratings.class)
	@XmlTransient
	private List<Ratings> ratings;
*/
	@Id
	private Long movieId;

	private String movieName;

	private String movieYear;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}

}