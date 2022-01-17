package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<Users> findUserWithName(String username);
}