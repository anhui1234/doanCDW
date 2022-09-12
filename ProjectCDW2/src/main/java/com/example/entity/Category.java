package com.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(length=20)
	private String id_category;
	@Column(length=20)
	private String name_Category;
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "category")
	private Set<Product> product;

	public Category() {
		super();
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}


	public Category(String id_category, String name_Category) {
		super();
		this.id_category = id_category;
		this.name_Category = name_Category;
	}

	public String getId_category() {
		return id_category;
	}

	public void setId_category(String id_category) {
		this.id_category = id_category;
	}

	public String getName_Category() {
		return name_Category;
	}

	public void setName_Category(String name_Category) {
		this.name_Category = name_Category;
	}

	

}
