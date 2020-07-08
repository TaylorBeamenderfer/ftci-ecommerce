package com.tts.eCommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.eCommerce.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
}
