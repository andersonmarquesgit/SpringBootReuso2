package com.engreuso.service;

import com.engreuso.model.Profile;
import com.engreuso.model.User;

public interface UserService {

	User save(User customer);
	Iterable findAll();
	User findOne(Long id);
	User update(Long id, User userUpdated);
	void delete(Long id);

}
