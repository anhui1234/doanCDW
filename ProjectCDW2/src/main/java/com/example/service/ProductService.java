package com.example.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.entity.Category;
import com.example.entity.Product;

public interface ProductService {

	
	void delete(Product entity);

	void deleteById(String id);

	long count();

	List<Product> findAllById(List<String> ids);

	Iterable<Product> findAll();

	boolean existsById(String id);

	Optional<Product> findById(String id);

	Product save(Product entity);

	List<Category> findAllCategory();

	Product getProductById(String id);

	List<Product> listAll(String name);


}
