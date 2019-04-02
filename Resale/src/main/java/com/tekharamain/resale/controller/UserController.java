package com.tekharamain.resale.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tekharamain.resale.entity.User;
import com.tekharamain.resale.service.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/")
	public String sayAllah() {
		return "La Illaha Illaha, Muhammadur rasollullah";
	}

	@GetMapping(value = "/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}

	@GetMapping(value = "/user")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(value = "/user")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping(value = "/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping(value = "/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}

	@GetMapping(value = "/userByEmail")
	public String getUser(@RequestParam String email, @RequestParam String password) {
		return "{\"id\":\"" + userService.getUser(email, password) + "\"}";
	}
	@GetMapping(value = "/cityList")
	public String getCityListByUser() {
		return "{\"cities\":\"" + userService.getCityListByUser() + "\"}";
	}

}
