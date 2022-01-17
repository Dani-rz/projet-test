package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Salle;
import com.example.demo.repository.SalleRepository;

@RestController
@RequestMapping("salles")
public class SalleController {

	@Autowired
	SalleRepository salleRepository;

	@PostMapping("/save")
	public void save(@RequestBody Salle salle) {
		salleRepository.save(salle);
	}

	@GetMapping("/all")
	public List<Salle> load() {
		return salleRepository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		salleRepository.delete(salleRepository.findById(id));
	}

}
