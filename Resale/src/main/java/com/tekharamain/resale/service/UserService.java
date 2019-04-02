package com.tekharamain.resale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekharamain.resale.entity.User;
import com.tekharamain.resale.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public Long getUser(String email, String password) {
		User user = new User();
		user = userRepository.findByEmailAndPassword(email,password);
		if(user != null) {
			return user.getId();
		}
		return null;

	}

	public String  getCityListByUser() {
		List<String> cities = userRepository.findCity();
		return String.join(",", cities);
	}
}
