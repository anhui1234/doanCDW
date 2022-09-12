package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.DTO.UserDTO;
import com.example.detail.CustomUserDetail;
import com.example.entity.User;
import com.example.userRepository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository ur;
	@Autowired
	private BCryptPasswordEncoder bcpe;
	@Override
	public User save(User user) {
		
		return ur.save(user);
	}
	@Override
	public boolean existsById(Long id) {
		return ur.existsById(id);
	}
	@Override
	public <S extends User> boolean exists(Example<S> example) {
		return ur.exists(example);
	}
	@Override
	public Optional<User> findById(Long id) {
		return ur.findById(id);
	}
	@Override
	public Optional<User>findByName(String username){
		return ur.findByName(username);
	}
	@Override
	public User login(String username,String password) {
		Optional<User>userExist=findByName(username);
		if(userExist.isPresent()&&bcpe.matches(password, userExist.get().getPassword())) {
			userExist.get().setPassword("");
			return userExist.get();
		}
		return null;
	}
	@Override
	public User findByAccountName(String accountName) {
		return ur.findByAccountName(accountName);
	}
	@Override
	public <S extends User> Optional<S> findOne(Example<S> example) {
		return ur.findOne(example);
	}
	@Override
	public List<User> findAll() {
		return ur.findAll();
	}
	@Override
	public Page<User> findAll(Pageable pageable) {
		return ur.findAll(pageable);
	}
	@Override
	public List<User> findAll(Sort sort) {
		return ur.findAll(sort);
	}
	@Override
	public List<User> findAllById(Iterable<Long> ids) {
		return ur.findAllById(ids);
	}
	@Override
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		return ur.saveAll(entities);
	}
	@Override
	public void flush() {
		ur.flush();
	}
	@Override
	public <S extends User> S saveAndFlush(S entity) {
		return ur.saveAndFlush(entity);
	}
	@Override
	public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
		return ur.saveAllAndFlush(entities);
	}
	@Override
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		return ur.findAll(example, pageable);
	}
	@Override
	public void deleteInBatch(Iterable<User> entities) {
		ur.deleteInBatch(entities);
	}
	@Override
	public <S extends User> long count(Example<S> example) {
		return ur.count(example);
	}
	@Override
	public void deleteAllInBatch(Iterable<User> entities) {
		ur.deleteAllInBatch(entities);
	}
	@Override
	public long count() {
		return ur.count();
	}
	@Override
	public void deleteById(Long id) {
		ur.deleteById(id);
	}
	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		ur.deleteAllByIdInBatch(ids);
	}
	@Override
	public void delete(User entity) {
		ur.delete(entity);
	}
	@Override
	public <S extends User, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return ur.findBy(example, queryFunction);
	}
	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		ur.deleteAllById(ids);
	}
	@Override
	public void deleteAllInBatch() {
		ur.deleteAllInBatch();
	}
	@Override
	public User getOne(Long id) {
		return ur.getOne(id);
	}
	@Override
	public void deleteAll(Iterable<? extends User> entities) {
		ur.deleteAll(entities);
	}
	@Override
	public void deleteAll() {
		ur.deleteAll();
	}
	@Override
	public User getById(Long id) {
		return ur.getById(id);
	}
	@Override
	public User getReferenceById(Long id) {
		return ur.getReferenceById(id);
	}
	@Override
	public <S extends User> List<S> findAll(Example<S> example) {
		return ur.findAll(example);
	}
	@Override
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		return ur.findAll(example, sort);
	}
	@Override
	public int hashCode() {
		return bcpe.hashCode();
	}
	@Override
	public String encode(CharSequence rawPassword) {
		return bcpe.encode(rawPassword);
	}
	@Override
	public boolean equals(Object obj) {
		return bcpe.equals(obj);
	}
	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return bcpe.matches(rawPassword, encodedPassword);
	}
	@Override
	public boolean upgradeEncoding(String encodedPassword) {
		return bcpe.upgradeEncoding(encodedPassword);
	}
	@Override
	public String toString() {
		return bcpe.toString();
	}
	
}
