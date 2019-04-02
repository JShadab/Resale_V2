package com.tekharamain.resale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.tekharamain.resale.entity.Offers;
import com.tekharamain.resale.entity.Product;
import com.tekharamain.resale.repository.OffersRepository;
import com.tekharamain.resale.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OffersRepository offersRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Optional<Product> getProduct(Long id) {
		Optional<Product> product = productRepository.findById(id);
		List<Offers> offers = offersRepository.getOfferByProductId(product.get().getId());
		if(!CollectionUtils.isEmpty(offers)) {
			product.get().setOffers(offers.get(0));
		}
		return product;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public List<Product> getProductByUserId(Long userId) {
		List<Product> products = productRepository.getProductByUserId(userId);
		if(!CollectionUtils.isEmpty(products)) {
			for (Product product : products) {
				List<Offers> offers = offersRepository.getOfferByProductId(product.getId());
				if(!CollectionUtils.isEmpty(offers)) {
					product.setOffers(offers.get(0));
				}
			}
		}
		return products;
	}

	public List<Product> getProductByCategory(String category, String city) {
		List<Product> products = productRepository.getProductByCategory(category, city);
		if(!CollectionUtils.isEmpty(products)) {
			for (Product product : products) {
				List<Offers> offers = offersRepository.getOfferByProductId(product.getId());
				if(!CollectionUtils.isEmpty(offers)) {
					product.setOffers(offers.get(0));
				}
			}
		}
		return products;
	}

}
