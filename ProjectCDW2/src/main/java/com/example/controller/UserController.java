package com.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.DTO.ProductDTO;
import com.example.DTO.UserDTO;
import com.example.entity.Category;
import com.example.entity.Product;
import com.example.entity.User;
import com.example.service.ProductService;
import com.example.service.UserService;
import com.example.userRepository.UserRepository;
@Controller
public class UserController {
//	
//	@Autowired
//	ParamService param;
	@Autowired
	private UserService us;
	
	@Autowired
	private ProductService service;
	@Autowired
	HttpSession session;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login(ModelMap model) {
		User user=new User();
		model.addAttribute("user",user);
		return "login";
	}
//	@GetMapping("/register")
//	public String register(Model model) {
//		model.addAttribute("user",new UserDTO());
//		return "register";
//	}
//	@PostMapping("/registersucess")
//	public String registersuccess(UserDTO userdto) {
//		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//		String encodedPassword=encoder.encode(userdto.getPassword());
//		userdto.setPassword(encodedPassword);
//		User user=new User(userdto.getAccountName(), userdto.getPhone(), userdto.getName(),userdto.getPassword());
//		us.save(user);
//		return "registerSuccess";
//	}
	@PostMapping("/loginSuccess")
	public ModelAndView loginSuccess(ModelMap model,
			@Valid @ModelAttribute("user")UserDTO userdto,
			BindingResult bingdingRessult) {
		if(bingdingRessult.hasErrors()) {
			
			return new ModelAndView("login",model);
		}
		User user=us.login(userdto.getAccountName(), userdto.getPassword());
			if(user==null) {
				model.addAttribute("message","Invalid username or password");
				return new ModelAndView("login",model);
			}
			session.setAttribute("USERNAME", user.getName());
			return new ModelAndView("indexAdmin",model);
		
		
	}
	
}
