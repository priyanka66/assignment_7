package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Movie;
import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovies;

public interface RatingsRepository {

	Ratings find(Long ratingId);

	List<Ratings> findAll();

	Ratings save(Ratings ratings);

	Ratings update(Ratings ratings, Long ratingId);

	Ratings delete(Long ratingId);

	List<topRatedMovies> getMovies();
    
	
}