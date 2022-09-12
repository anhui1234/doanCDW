package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name="id_Product")
	private String id_Product;
	@Column(nullable = false,name="image")
	private String image;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_category")
	private Category category;
	@Column(nullable = false,name="nameProduct")
	private String name_Product;
	@Column(nullable = false,name="content")
	private String content;
	public Product() {
		super();
	}

	

	public Product(String id_Product, String image, Category category, String name_Product, String content) {
		super();
		this.id_Product = id_Product;
		this.image = image;
		this.category = category;
		this.name_Product = name_Product;
		this.content = content;
	}



	public String getId_Product() {
		return id_Product;
	}

	public void setId_Product(String id_Product) {
		this.id_Product = id_Product;
	}

	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName_Product() {
		return name_Product;
	}



	public void setName_Product(String name_Product) {
		this.name_Product = name_Product;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}

}
