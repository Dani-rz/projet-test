package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody User users) {
		userRepository.save(users);
	}
	
	@GetMapping("/all")
	public List<User> load(){
		return userRepository.findAll();
	}
}
