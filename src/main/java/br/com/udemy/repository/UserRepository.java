package br.com.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
}
