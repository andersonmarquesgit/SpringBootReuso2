package com.engreuso.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.engreuso.model.User;

public interface UserService {

	User save(User user);
	Iterable<User> findAll();
	User findOne(Long id);
	User update(Long id, User userUpdated);
	void delete(Long id);
	List<User> findAll(Specification<User> spec);

}
