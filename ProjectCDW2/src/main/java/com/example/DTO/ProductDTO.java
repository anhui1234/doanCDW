package com.example.DTO;

import org.springframework.web.multipart.MultipartFile;


public class ProductDTO {
	private String id_Product;
	private MultipartFile photo;
	private String categoryId;
	private String name_Product;
	private String content;
	
	
	public ProductDTO() {
		
	}


	public ProductDTO(String id_Product, MultipartFile photo, String categoryId, String name_Product, String content) {
		super();
		this.id_Product = id_Product;
		this.photo = photo;
		this.categoryId = categoryId;
		this.name_Product = name_Product;
		this.content = content;
	}


	public String getId_Product() {
		return id_Product;
	}


	public void setId_Product(String id_Product) {
		this.id_Product = id_Product;
	}


	public MultipartFile getPhoto() {
		return photo;
	}


	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
