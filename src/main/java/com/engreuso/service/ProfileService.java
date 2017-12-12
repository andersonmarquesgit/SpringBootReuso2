package com.engreuso.service;

import com.engreuso.model.Profile;

public interface ProfileService {
	
	Profile save(Profile profile);
	Iterable<Profile> findAll();
	Profile findOne(Long id);
	Profile update(Long id, Profile profileUpdated);
	void delete(Long id);
}
