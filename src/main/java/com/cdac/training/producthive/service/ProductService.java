package com.cdac.training.producthive.service;

import org.springframework.stereotype.Service;

import com.cdac.training.producthive.model.Product;
import com.cdac.training.producthive.repository.ProductRepository;

/**
*Author :HP
*Date : 31-Dec-2024
*Time : 5:30:13 pm
*/

@Service
public class ProductService {
	
	private final ProductRepository productRepo;

	//Constructor Dependency Injection
	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	public Product saveProduct(Product product) {
		return productRepo.save(product); //invokes pre-defined method of JPA Repository
	}
	
	
}
