package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Movie;
import com.hashedin.model.Ratings;
import com.hashedin.model.movieByYear;

public interface MovieService {

	Movie find(Long MovieId);

	List<Movie> findAll();

	Movie save(Movie movie);

	Movie update(Movie movie, Long movieId);

	Movie delete(Long movieId);
	
//	List<int[]> moviesByYear();
	
	List<movieByYear> getMovieByYear(String startDate, String endDate);

//	public List<Task> findTasksByMovieId(Long movieId);
//	
//	List<Task> findTasksOfMovieByStatus(Long movieId, String status);
}
