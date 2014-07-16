package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Movie;
import com.hashedin.model.movieByYear;

public interface MovieRepository {

	Movie find(Long ratingId);

	List<Movie> findAll();

	Movie save(Movie proejct);

	Movie update(Movie movie, Long movieId);

	Movie delete(Long taskId);

	

//	List<int []> moviesbyYear();

	List<movieByYear> getMovieByYear();

	//List<Ratings> findByMovieId(Long movieId);

}
