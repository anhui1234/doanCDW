package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.userRepository.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
CategoryRepository cr;

@Override
public Category save(Category entity) {
	return cr.save(entity);
}

@Override
public List<Category> saveAll(List<Category> entities) {
	return (List<Category>)cr.saveAll(entities);
}

@Override
public Optional<Category> findById(String id) {
	return cr.findById(id);
}

@Override
public boolean existsById(String id) {
	return cr.existsById(id);
}

@Override
public List<Category> findAll() {
	return (List<Category>)cr.findAll();
}

@Override
public List<Category> findAllById(Iterable<String> ids) {
	return (List<Category>)cr.findAllById(ids);
}

@Override
public long count() {
	return cr.count();
}

@Override
public void deleteById(String id) {
	cr.deleteById(id);
}

@Override
public void delete(Category entity) {
	cr.delete(entity);
}

@Override
public void deleteAllById(Iterable<? extends String> ids) {
	cr.deleteAllById(ids);
}

@Override
public void deleteAll(List<Category> entities) {
	cr.deleteAll(entities);
}

@Override
public void deleteAll() {
	cr.deleteAll();
}

@Override
public Category getCategory(String id) {
	
	return cr.findById(id).get();
}



}
