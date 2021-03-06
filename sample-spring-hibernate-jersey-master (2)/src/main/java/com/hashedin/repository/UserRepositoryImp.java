package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.hashedin.model.Ratings;
import com.hashedin.model.User;

@Repository("userRepository")
public class UserRepositoryImp implements UserRepository {

	@PersistenceContext
	private EntityManager em;

	public User find(Long userId) {
		// Returns the Ratings for given ratingsId.
		return em.find(User.class, userId);
	}

	public User save(User user) {
		// Saves the given ratings object and returns the same.
		em.persist(user);
		em.flush();
		return user;
	}

	@Override
	public List<User> findAll() {
		// Returns all the ratings in our system.
		TypedQuery<User> query = em
				.createNamedQuery("User.findAll", User.class);
		List<User> results = query.getResultList();
		return results;
	}

	@Override
	public User update(User user, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(Long userId) {
		User ratingsToBeDeleted = em.find(User.class, userId);
		em.remove(ratingsToBeDeleted);
		return ratingsToBeDeleted;
	}

	
	}


