package com.hashedin.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "ratings")
@NamedQueries({
		@NamedQuery(name = "Ratings.findAll", query = "SELECT r FROM Ratings r"),
		@NamedQuery(name="Ratings.getMovies",query = "select NEW com.hashedin.model.topRatedMovies(r.ratings, count(r.user)) from Ratings r group by r.ratings")})
public class Ratings {

	@ManyToOne
	@JoinColumn(name="userId",referencedColumnName="userId")
	private User user;

	@ManyToOne
	@JoinColumn(name="movieId",referencedColumnName="movieId")
	private Movie movie;
	
	@Id
	private Long ratingId;

	private int  ratings;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	

}
