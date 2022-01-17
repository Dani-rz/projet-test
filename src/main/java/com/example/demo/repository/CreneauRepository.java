package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Creneau;

public interface CreneauRepository extends JpaRepository<Creneau, Long> {
	Creneau findById(long id);
}
