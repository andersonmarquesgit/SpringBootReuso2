package com.engreuso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engreuso.exceptions.UserNotFoundException;
import com.engreuso.model.Profile;
import com.engreuso.model.User;
import com.engreuso.repository.ProfileRepository;
import com.engreuso.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProfileRepository orderRepository;

	@Override
	public User save(User customer) {
		return userRepository.save(customer);
	}

	@Override
	public Iterable findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		User user = userRepository.findOne(id);
		if (user == null) throw new UserNotFoundException(id);
		
		return user;
	}

	@Override
	public User update(Long id, User customerUpdated) {
		User user = userRepository.findOne(id);
		
		if (user == null) {
			throw new UserNotFoundException(id);
		}else {
			user.setName(customerUpdated.getName());
		}
		
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		User user = userRepository.findOne(id);
		if (user == null) {
			throw new UserNotFoundException(id);
		}else {
			userRepository.delete(user);		
		}
		
	}

	@Override
	public User saveOrderByCustomerID(Long id, Profile profile) {
		User user = userRepository.findOne(id);
		if (user == null) {
			throw new UserNotFoundException(id);
		}else {
			profile.setCustomer(user);
			orderRepository.save(profile);
		}
		return user;
	}

}
