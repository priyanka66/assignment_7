package com.hashedin.repository;

import java.util.List;
import java.util.Objects;

import com.hashedin.model.Movie;
import com.hashedin.model.MovieByProfession;
import com.hashedin.model.MoviesByProfession;
import com.hashedin.model.MoviesByReviews;
import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovie;
import com.hashedin.model.topRatedMovies;

public interface RatingsRepository {

	Ratings find(Long ratingId);

	List<Ratings> findAll();

	Ratings save(Ratings ratings);

	Ratings update(Ratings ratings, Long ratingId);

	Ratings delete(Long ratingId);

	List<topRatedMovie> getMovies();

	List<MovieByProfession> getMoviesByProfession();

//	List<Objects[]> getRatedMovies();

//	List<String> moviesByRate();

	//List<MoviesByReviews> getMoviesByRatings();
    
	
}
