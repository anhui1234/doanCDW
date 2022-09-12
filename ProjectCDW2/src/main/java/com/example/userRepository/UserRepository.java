package com.example.userRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	@Query("SELECT u FROM User u WHERE u.accountName=?1 ")
	User findByAccountName(String accountName);
	@Query("SELECT u FROM User u WHERE u.accountName=?1 ")
	Optional<User> findByName(String username);
}
