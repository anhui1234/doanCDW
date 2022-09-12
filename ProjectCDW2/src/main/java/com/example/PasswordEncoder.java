package com.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
public static void main(String[] args) {
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	String rawPass="123456";
	String encodePassword=encoder.encode(rawPass);
	System.out.println(encodePassword);
}
}
