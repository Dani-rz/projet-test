package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long>{
	Salle findById(long id);

}
