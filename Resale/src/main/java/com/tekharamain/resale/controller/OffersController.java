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
import org.springframework.web.bind.annotation.RestController;

import com.tekharamain.resale.entity.Offers;
import com.tekharamain.resale.service.OffersService;

@RestController
public class OffersController {

	@Autowired
	private OffersService offersService;

	@GetMapping(value = "/offers/{id}")
	public Optional<Offers> getoffers(@PathVariable Long id) {
		return offersService.getOffers(id);
	}

	@GetMapping(value = "/offers")
	public List<Offers> getAllofferss() {
		return offersService.getAllOfferss();
	}
	
	@PostMapping(value = "/offers")
	public Offers saveoffers(@RequestBody Offers offers) {
		return offersService.saveOffers(offers);
	}

	@PutMapping(value = "/offers")
	public Offers updateoffers(@RequestBody Offers offers) {
		return offersService.updateOffers(offers);
	}

	@DeleteMapping(value = "/offers/{id}")
	public void deleteoffers(@PathVariable Long id) {
		offersService.deleteOffers(id);
	}

}
