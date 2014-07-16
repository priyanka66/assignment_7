package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Ratings;

import com.hashedin.model.User;

public interface UserRepository {

	User find(Long ratingId);

	List<User> findAll();

	User save(User ratings);

	User update(User ratings, Long ratingId);

	User delete(Long ratingId);

	
}
