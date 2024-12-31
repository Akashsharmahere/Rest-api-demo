package com.cdac.training.producthive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.training.producthive.model.Product;

/**
*Author :HP
*Date : 31-Dec-2024
*Time : 5:26:24 pm
*/

/*
 * JPA Repository is mainly used for managing the data in a Spring Boot Application. 
 * JpaRepository is particularly a JPA specific extension for Repository.
 * Jpa Repository contains the APIs for basic CRUD operations, the APIS for 
 * pagination, and the APIs for sorting.
 * This Layer interacts with Database
 */

//Wrapper class- primitive data types considered as Objects
//Integer, Float, Long, Double

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	/* Long is data type of @Id field of Product Class
	 * 
	 * This interface has save(),findAll(),findById(),deleteById(),count()
       etc.. inbuilt methods of jpa repository for various database operations.
       
       This interface will be implemented by class automatically
	 */
	 
}
