package com.example.DTO;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class UserDTO {
	@NotEmpty
	private String accountName;

	private String phone;

	private String name;
	@NotEmpty
	@Length(message="Nhập tối thiểu 6 kí tự",min=6)
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(String accountName, String phone, String name, String password) {
		super();
		this.accountName = accountName;
		this.phone = phone;
		this.name = name;
		this.password = password;
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
