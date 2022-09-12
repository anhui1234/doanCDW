package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_user")
	private Long id_User;
	
	@Column(name="account_Name")
	private String accountName;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="name_user")
	private String name;
	@Column(name="password_Name")
	private String password;
	public User() {
		super();
	}
	public User( String accountName, String phone, String name, String password) {
		super();
		
		this.accountName = accountName;
		this.phone = phone;
		this.name = name;
		this.password = password;
	}
	public Long getId_User() {
		return id_User;
	}
	public void setId_User(Long id_User) {
		this.id_User = id_User;
	}

	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
