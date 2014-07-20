package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


//import com.hashedin.model.Movie;
import com.hashedin.model.MoviesByProfession;
///import com.hashedin.model.MoviesByReviews;
//import com.hashedin.model.MoviesByReviews;
import com.hashedin.model.Ratings;
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
	public List<topRatedMovies> getMovies() {
		TypedQuery<topRatedMovies> query = em
				.createNamedQuery("Ratings.getMovies", topRatedMovies.class);
		List<topRatedMovies> results = query.setFirstResult(0).setMaxResults(6).getResultList();
		System.out.println("\n\n\nList of movies " + results);
		return results;
		
	}

	@Override
	public List<MoviesByProfession> getMoviesByProfession() {
		TypedQuery<MoviesByProfession> query = em
				.createNamedQuery("Ratings.getMovieByProfession", MoviesByProfession.class);
		List<MoviesByProfession> results = query.setFirstResult(0).setMaxResults(5).getResultList();
		System.out.println("\n\n\nList of movies " + results);
		return results;
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


