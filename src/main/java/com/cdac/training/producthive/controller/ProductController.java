package com.cdac.training.producthive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.training.producthive.model.Product;
import com.cdac.training.producthive.service.ProductService;

/**
*Author :HP
*Date : 31-Dec-2024
*Time : 5:34:18 pm
*/

@RestController
@RequestMapping("/api") //mapping for the class
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/products")
	public Product postMethod(@RequestBody Product p) {
		return productService.saveProduct(p);
	} 
}
