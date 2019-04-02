package com.tekharamain.resale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekharamain.resale.enums.Category;

@RequestMapping("/common")
@RestController
public class CommonController {

	@GetMapping(value = "/category")
	public Category[] getAllCategories() {
		return Category.values();
	}

}
