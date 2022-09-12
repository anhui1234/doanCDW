package com.example.userRepository;


import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	@Modifying
	@Query("delete from Product p where p.id_Product=?1 ")
	public void deleteById(String id);
	
	@Query("SELECT p FROM Product p WHERE p.name_Product LIKE %?1%")
	List<Product> findByNameContaining(String name);

	
	
}
