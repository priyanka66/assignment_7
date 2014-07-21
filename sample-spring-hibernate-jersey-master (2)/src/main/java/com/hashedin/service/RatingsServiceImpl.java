package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Movie;
import com.hashedin.model.MovieByProfession;
import com.hashedin.model.MoviesByProfession;
//import com.hashedin.model.MoviesByReviews;
import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovie;
import com.hashedin.model.topRatedMovies;
import com.hashedin.repository.RatingsRepository;

@Service("ratingsService")
public class RatingsServiceImpl implements RatingsService {

	@Autowired
	private RatingsRepository ratingsRepository;

	public Ratings find(Long ratingId) {
		// Returns the Ratings for given ratingId.
		return ratingsRepository.find(ratingId);
	}

	@Transactional
	public Ratings save(Ratings ratings) {
		// Saves the given ratings object and returns the same.
		ratingsRepository.save(ratings);
		return ratings;
	}

	@Override
	public List<Ratings> findAll() {
		// Returns all the ratings in our system.
		return ratingsRepository.findAll();
	}

	@Override
	public Ratings update(Ratings ratings, Long ratingId) {
		// Updates the ratings with the given ratingId;
		return null;
	}

	@Transactional
	public Ratings delete(Long ratingId) {
		// Deletes the ratings with the give ratingId and returns the same.
		return ratingsRepository.delete(ratingId);
	}

	@Override
	public List<topRatedMovie> getMovies() {
		// TODO Auto-generated method stub
		return ratingsRepository.getMovies();
	}

	@Override
	public List<MovieByProfession> getMoviesByProfession() {
		// TODO Auto-generated method stub
		return ratingsRepository.getMoviesByProfession();
	}

//	@Override
//	public List<String> moviesByRate() {
//		return ratingsRepository.moviesByRating();
//	}

//	@Override
//	public List<MoviesByReviews> getMoviesByRatings() {
//		return ratingsRepository.getMoviesByRatings();
//	}

}
