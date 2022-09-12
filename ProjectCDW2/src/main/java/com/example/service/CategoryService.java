package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.entity.Category;

public interface CategoryService {

	void deleteAll();

	void deleteAll(List<Category> entities);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(Category entity);

	void deleteById(String id);

	long count();

	Iterable<Category> findAllById(Iterable<String> ids);

	List<Category> findAll();

	boolean existsById(String id);

	Optional<Category> findById(String id);

	List<Category> saveAll(List<Category> entities);

	Category save(Category entity);
	Category getCategory(String id);
	

}
