package com.hashedin.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;







import com.hashedin.model.MovieByProfession;
//import com.hashedin.model.Movie;
import com.hashedin.model.MoviesByProfession;
///import com.hashedin.model.MoviesByReviews;
//import com.hashedin.model.MoviesByReviews;
import com.hashedin.model.Ratings;
import com.hashedin.model.topRatedMovie;
import com.hashedin.model.topRatedMovies;

@Repository("ratingsRepository")
public class RatingsRepositoryImpl implements RatingsRepository {

	@PersistenceContext
	private EntityManager em;

	public Ratings find(Long ratingId) {
		// Returns the Ratings for given ratingId.
		return em.find(Ratings.class, ratingId);
	}

	public Ratings save(Ratings ratings) {
		// Saves the given ratings object and returns the same.
		em.persist(ratings);
		em.flush();
		return ratings;
	}

	@Override
	public List<Ratings> findAll() {
		// Returns all the ratings in our system.
		TypedQuery<Ratings> query = em
				.createNamedQuery("Ratings.findAll", Ratings.class);
		List<Ratings> results = query.setFirstResult(0).setMaxResults(2).getResultList();
		return results;
	}

	@Override
	public Ratings update(Ratings ratings, Long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ratings delete(Long ratingId) {
		Ratings ratingsToBeDeleted = em.find(Ratings.class, ratingId);
		em.remove(ratingsToBeDeleted);
		return ratingsToBeDeleted;
	}

	@Override
	public List<topRatedMovie> getMovies() {
		TypedQuery<topRatedMovies> query = em
				.createNamedQuery("Ratings.getMovies", topRatedMovies.class);
		List<topRatedMovies> results = query.getResultList();
		
		List<topRatedMovie> myList = new ArrayList<topRatedMovie>();
		List<topRatedMovie> topMovies = new ArrayList<topRatedMovie>();
		
		for(topRatedMovies movieList : results){
			myList.add(new topRatedMovie(movieList.getMovieName(),movieList.getRatings(),((int)(long)movieList.getCount())));
		}
		
		Collections.sort(myList, new Comparator<topRatedMovie>(){
			public int compare(topRatedMovie first, topRatedMovie second){
				return second.getCount().compareTo(first.getCount());
			}
		}
				);
		
		for(int topMov=0;topMov<20;topMov++){
			topMovies.add(myList.get(topMov));
		}
		
				System.out.println("\n\n\nList of movies " + results);
		return topMovies;
		
	}

	@Override
	public List<MovieByProfession> getMoviesByProfession() {
		TypedQuery<MoviesByProfession> query = em
				.createNamedQuery("Ratings.getMovieByProfession", MoviesByProfession.class);
		List<MoviesByProfession> results = query.getResultList();
		
		List<MovieByProfession> myList = new ArrayList<MovieByProfession>();
		List<MovieByProfession> topMovies = new ArrayList <MovieByProfession>();
		
		for(MoviesByProfession movieList : results){
			myList.add(new MovieByProfession(movieList.getProfession(),((int)(long)movieList.getCount())));
		}
		
		
		Collections.sort(myList, new Comparator<MovieByProfession>(){
			public int compare(MovieByProfession first, MovieByProfession second){
				return second.getCount().compareTo(first.getCount());
			}
		}
				);
		
		for(int topMov=0;topMov<20;topMov++){
			topMovies.add(myList.get(topMov));
		}
		
				System.out.println("\n\n\nList of movies " + results);
		return topMovies;
	}

//	@Override
//	public List<String> moviesByRate() {
//		Query query = em
//				.createQuery("Ratings.getMoviesByRating");
//		List<String> results = query.setFirstResult(0).setMaxResults(5).getResultList();
//		System.out.println("\n\n\nList of movies " + results);
//		return results;
//	}

//	@Override
//	public List<MoviesByReviews> getMoviesByRatings() {
//		TypedQuery<MoviesByReviews> query = em
//				.createNamedQuery("Ratings.getMoviesByRatings", MoviesByReviews.class);
//		List<MoviesByReviews> results = query.setFirstResult(0).setMaxResults(5).getResultList();
//		System.out.println("\n\n\nList of movies " + results);
//		return results;
//	}
//	

}


