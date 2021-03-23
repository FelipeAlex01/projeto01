package br.com.udemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.udemy.repository.UserRepository;
import br.com.udemy.service.UserService;

@Controller
@RequestMapping("/udemy")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("usersList", this.service.findAll());
		return "user";
	}
}
