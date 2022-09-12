package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.detail.CustomUserDetail;
import com.example.entity.User;
import com.example.userRepository.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository ur;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=ur.findByAccountName(username);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}
		return new CustomUserDetail(user);
	}


}
