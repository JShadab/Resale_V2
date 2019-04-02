package com.tekharamain.resale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekharamain.resale.entity.Admin;
import com.tekharamain.resale.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	public Optional<Admin> getAdmin(Long id) {
		return adminRepository.findById(id);
	}

	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
	}

	public Admin getAdmin(String email, String password) {
		return adminRepository.findByEmailAndPassword(email,password);

	}
}
