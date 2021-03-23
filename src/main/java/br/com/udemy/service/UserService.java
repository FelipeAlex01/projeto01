package br.com.udemy.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.udemy.model.User;
import br.com.udemy.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public Collection<User> findAll() {
		return this.repository.findAll();
	}
}
