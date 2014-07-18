package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Movie;
import com.hashedin.model.Ratings;
import com.hashedin.model.movieByYear;

@Repository("movieRepository")
public class MovieRepositoryImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager em;

	public Movie find(Long proId) {
		// Returns the Task for given taskId.
		return em.find(Movie.class, proId);
	}

	public Movie save(Movie movie) {
		// Saves the given task object and returns the same.
		em.persist(movie);
		em.flush();
		return movie;
	}

	// @Override
	public List<Movie> findAll() {
		// Returns all the tasks in our system.
		TypedQuery<Movie> query = em.createNamedQuery("Movie.findAll",
				Movie.class);
		List<Movie> results = query.getResultList();
		return results;
	}

	@Override
	public Movie update(Movie pro, Long proId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie delete(Long proId) {
		Movie taskToBeDeleted = em.find(Movie.class, proId);
		em.remove(taskToBeDeleted);
		return taskToBeDeleted;
	}

//	@Override
//	public List<int []> moviesbyYear() {
//		Query query = em.createNamedQuery("Movie.movieByYear");
//		List<int []> results = query.getResultList();
//		System.out.println(results);
//		return null;
//	}

	@Override
	public List<movieByYear> getMovieByYear() {
		TypedQuery<movieByYear> query = em.createNamedQuery("Movie.movieByYear",movieByYear.class);
//				.setParameter("startYear", "1992")
//				.setParameter("endYear", "1997");
		List<movieByYear> results = query.getResultList();
		System.out.println(results);
		return results;
	}

	

//	public List<Task> findTasksByMovieId(Long movieId) {
//
//		return em.find(Movie.class, movieId).getTasks();
//	}

}
