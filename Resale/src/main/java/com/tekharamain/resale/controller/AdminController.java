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

import com.tekharamain.resale.entity.Admin;
import com.tekharamain.resale.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping(value = "/admin/{id}")
	public Optional<Admin> getAdmin(@PathVariable Long id) {
		return adminService.getAdmin(id);
	}

	@GetMapping(value = "/admin")
	public List<Admin> getAllAdmins() {
		return adminService.getAllAdmins();
	}

	@PostMapping(value = "/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return adminService.saveAdmin(admin);
	}

	@PutMapping(value = "/admin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminService.updateAdmin(admin);
	}

	@DeleteMapping(value = "/admin/{id}")
	public void deleteAdmin(@PathVariable Long id) {
		adminService.deleteAdmin(id);
	}

	@GetMapping(value = "/adminByEmail")
	public Admin getAdmin(@RequestParam String email, @RequestParam String password) {
		return adminService.getAdmin(email, password);
	}

}
