package br.com.udemy.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.udemy.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
