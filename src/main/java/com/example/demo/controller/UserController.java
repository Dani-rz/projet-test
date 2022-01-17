package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Users users) {
		userRepository.save(users);
	}
}
