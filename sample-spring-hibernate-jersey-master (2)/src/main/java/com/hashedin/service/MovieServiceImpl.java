package com.hashedin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Movie;
import com.hashedin.model.Ratings;
import com.hashedin.model.movieByYear;
import com.hashedin.repository.MovieRepository;

@Service("MovieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository MovieRepository;

	public Movie find(Long movieId) {
		// Returns the Movie for given MovieId.
		return MovieRepository.find(movieId);
	}

	@Transactional
	public Movie save(Movie movie) {
		// Saves the given Movie object and returns the same.
		MovieRepository.save(movie);
		return movie;
	}

	@Override
	public List<Movie> findAll() {
		// Returns all the Movies in our system.
		return MovieRepository.findAll();
	}

	@Override
	public Movie update(Movie movie, Long movieId) {
		// Updates the Movie with the given MovieId;
		return null;
	}

	@Transactional
	public Movie delete(Long movieId) {
		// Deletes the Movie with the give MovieId and returns the same.
		return MovieRepository.delete(movieId);
	}

//	@Override
//	public List<int[]> moviesByYear() {
//		return MovieRepository.moviesbyYear();
//	}
//
	@Override
	public List<movieByYear> getMovieByYear() {
		return MovieRepository.getMovieByYear();
	}


//	@Override
//	public List<Task> findTasksByMovieId(Long movieId) {
//
//		return MovieRepository.findTasksByMovieId(movieId);
//	}
//	@Override
//	public List<Task> findTasksOfMovieByStatus(Long movieId,String status) {
//
//		Movie movie = MovieRepository.find(movieId);
//		List<Task> tasks = new ArrayList<Task>();
//		System.out.println("sauraV************************************" + movie.getTasks());
//		for (Task task : movie.getTasks()) {
//			
//			if (task.getStatus().equals(status)) {
//				tasks.add(task);
//			}
//		}
//		return tasks;
//	}

}
