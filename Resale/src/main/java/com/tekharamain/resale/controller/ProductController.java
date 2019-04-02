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

import com.tekharamain.resale.entity.Product;
import com.tekharamain.resale.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}

	@GetMapping(value = "/product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping(value = "/product/byUserId")
	public List<Product> getProductByUserId(@RequestParam("userId") Long userId) {
		return productService.getProductByUserId(userId);
	}
	
	@GetMapping(value = "/product/byCategory")
	public List<Product> getProductByCategory(@RequestParam("category") String category, @RequestParam("city") String city) {
		return productService.getProductByCategory(category, city);
	}
	
	@PostMapping(value = "/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PutMapping(value = "/product")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping(value = "/product/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}

}
