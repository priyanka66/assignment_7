package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Movie;
import com.hashedin.model.MovieByProfession;
import com.hashedin.model.MoviesByProfession;
//import com.hashedin.model.MoviesByReviews;
import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovie;
import com.hashedin.model.topRatedMovies;

public interface RatingsService {

	Ratings find(Long ratingId);

	List<Ratings> findAll();

	Ratings save(Ratings ratings);

	Ratings update(Ratings ratings, Long ratingId);

	Ratings delete(Long ratingId);

	List<topRatedMovie> getMovies();
	
	List<MovieByProfession> getMoviesByProfession();
	
//	List<String> moviesByRate();
//	List<MoviesByReviews> getMoviesByRatings();
	
}
