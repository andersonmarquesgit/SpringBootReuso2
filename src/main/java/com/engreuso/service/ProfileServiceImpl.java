package com.engreuso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engreuso.exceptions.ProfileNotFoundException;
import com.engreuso.model.Profile;
import com.engreuso.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public Profile save(Profile profile) {
		return profileRepository.save(profile);
	}

	@Override
	public Iterable<Profile> findAll() {
		return profileRepository.findAll();
	}

	@Override
	public Profile findOne(Long id) {
		Profile profile = profileRepository.findOne(id);
		if (profile == null)
			throw new ProfileNotFoundException(id);

		return profile;
	}

	@Override
	public Profile update(Long id, Profile profileUpdated) {
		Profile profile = profileRepository.findOne(id);

		if (profile == null) {
			throw new ProfileNotFoundException(id);
		} else {
			profile.setInsertOperation(profileUpdated.getInsertOperation());
			profile.setUpdateOperation(profileUpdated.getUpdateOperation());
			profile.setViewOperation(profileUpdated.getViewOperation());
			profile.setDeleteOperation(profileUpdated.getDeleteOperation());
		}

		return profileRepository.save(profile);
	}

	@Override
	public void delete(Long id) {
		Profile profile = profileRepository.findOne(id);
		if (profile == null) {
			throw new ProfileNotFoundException(id);
		} else {
			profileRepository.delete(profile);
		}
	}

}
