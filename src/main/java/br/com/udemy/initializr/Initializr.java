package br.com.udemy.initializr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.udemy.model.User;
import br.com.udemy.repository.UserRepository;

@Component
public class Initializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository repository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		System.out.println("init");
		User user = new User();
		user.setName("Felipe");
		user.setEmail("felipealex01@gmail.com");

		this.repository.save(user);

		System.out.println(this.repository.findAll());

	}
}
