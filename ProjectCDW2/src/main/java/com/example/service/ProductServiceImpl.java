package com.example.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Category;
import com.example.entity.Product;
import com.example.userRepository.CategoryRepository;
import com.example.userRepository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository pr;
	@Autowired
	CategoryRepository cr;
	
	@Override
	public List<Category> findAllCategory() {
		
		return (List<Category>)cr.findAll();
	}
	@Override
	public Product save(Product entity) {
		return pr.save(entity);
	}

	@Override
	public Optional<Product> findById(String id) {
		return pr.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return pr.existsById(id);
	}

	@Override
	public Iterable<Product> findAll() {
		return pr.findAll();
	}

	@Override
	public List<Product>findAllById(List<String> ids) {
		return (List<Product>)pr.findAllById(ids);
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(String id) {
		pr.deleteById(id);
	}

	@Override
	public void delete(Product entity) {
		pr.delete(entity);
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}
	@Override
	public List<Product> listAll(String name) {
		if(name!=null) {
			return pr.findByNameContaining(name);
		}
		return pr.findAll();
	}


}
