package com.example.controller;

import java.awt.print.Pageable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.DTO.ProductDTO;
import com.example.entity.Category;
import com.example.entity.Product;
import com.example.service.CategoryService;
import com.example.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private CategoryService cs;
	
	@GetMapping("/new")
	public String newProduct(ModelMap model) {
		ProductDTO productdto=new ProductDTO();
		model.addAttribute("PRODUCTDTO", productdto);
		model.addAttribute("ACTION", "/saveAndUpdate");
		
		return "addProduct";
	}
	@PostMapping("/saveAndUpdate")
	public String save(ModelMap model, @ModelAttribute("PRODUCTDTO") ProductDTO dto) {
		Optional<Product> optionalProduct=service.findById(dto.getId_Product());
		Product product=null;
		String image="Logo.png";
		Path path=Paths.get("imagesp/");
		if(optionalProduct.isPresent()) {
			if(dto.getPhoto().isEmpty()) {
				image=optionalProduct.get().getImage();
				
			}else {
				try {
					InputStream inputStream=dto.getPhoto().getInputStream();
					Files.copy(inputStream, path.resolve(dto.getPhoto().getOriginalFilename()),
							StandardCopyOption.REPLACE_EXISTING);
					image=dto.getPhoto().getOriginalFilename().toString();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}else {
			if(!dto.getPhoto().isEmpty()) {
				try {
					InputStream inputStream=dto.getPhoto().getInputStream();
					Files.copy(inputStream, path.resolve(dto.getPhoto().getOriginalFilename()),
							StandardCopyOption.REPLACE_EXISTING);
					image=dto.getPhoto().getOriginalFilename().toString();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		product=new Product(dto.getId_Product(), image, new Category(dto.getCategoryId()," "), dto.getName_Product(), dto.getContent());
		service.save(product);
		return "addProduct";
		
	}
	@RequestMapping("/edit/{id_Product}")
	public String edit(ModelMap model,@PathVariable(name="id_Product")String id) {
		Optional<Product>opProduct=service.findById(id);
		ProductDTO dto=null;
		if(opProduct.isPresent()) {
			Product p=opProduct.get();
			File file=new File("imagesp/"+p.getImage());
			FileInputStream input;
			try {
				input=new FileInputStream(file);
				MultipartFile multiImage=
						new MockMultipartFile("file", file.getName(),"text/plain"
								,org.apache.commons.io.IOUtils.toByteArray(input));
				dto=new ProductDTO(p.getId_Product(), multiImage, p.getCategory().getId_category(), p.getName_Product(), p.getContent());
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("PRODUCTDTO", dto);
		}else {
			model.addAttribute("PRODUCTDTO", new ProductDTO());
		}
		model.addAttribute("ACTION", "/saveAndUpdate");
		return "addProduct";
	}
	@RequestMapping("/delete/{id_Product}")
	public String delete(@PathVariable(value="id_Product") String id,ModelMap model) {
		
			service.deleteById(id);
			model.addAttribute("listProducts", service.findAll());
			return "productAdmin";
		
	}
	@RequestMapping("/detail/{id_Product}")
	public String showProduct(@PathVariable(name="id_Product") String id,ModelMap model) {
		Product product=service.getProductById(id);
		model.addAttribute("listProducts", product);
		return "detail";
	}
	@RequestMapping("/detailAdmin/{id_Product}")
	public String showProductAdmin(@PathVariable(name="id_Product") String id,ModelMap model) {
		Product product=service.getProductById(id);
		model.addAttribute("listProducts", product);
		return "detailAdmin";
	}
	@RequestMapping("/product")
	public String viewHome(ModelMap model) {
		model.addAttribute("listProducts", service.findAll());
		return "product";
	}
	@GetMapping("/productAdmin")
	public String productAdmin(Model model) {
		model.addAttribute("listProducts", service.findAll());
		return "productAdmin";
		
	}
	@RequestMapping("/search")
	public String search(Model model,@Param(value="name") String name) {
		List<Product>list=service.listAll(name);
		model.addAttribute("listProducts", list);
		model.addAttribute("name",name);
		return "product";
	}
	@RequestMapping("/searchAdmin")
	public String searchAdmin(Model model,@Param(value="name") String name) {
		List<Product>list=service.listAll(name);
		model.addAttribute("listProducts", list);
		model.addAttribute("name",name);
		return "productAdmin";
	}
	@ModelAttribute(name="CATEGORYS")
	public List<Category> getAllCategorys(){
		return service.findAllCategory();
	}

}
