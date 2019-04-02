package com.tekharamain.resale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekharamain.resale.entity.Offers;
import com.tekharamain.resale.repository.OffersRepository;

@Service
public class OffersService {

	@Autowired
	private OffersRepository offersRepository;

	public Offers saveOffers(Offers offers) {
		return offersRepository.save(offers);
	}

	public Optional<Offers> getOffers(Long id) {
		return offersRepository.findById(id);
	}

	public List<Offers> getAllOfferss() {
		return offersRepository.findAll();
	}

	public Offers updateOffers(Offers offers) {
		return offersRepository.save(offers);
	}

	public void deleteOffers(Long id) {
		offersRepository.deleteById(id);
	}

}
