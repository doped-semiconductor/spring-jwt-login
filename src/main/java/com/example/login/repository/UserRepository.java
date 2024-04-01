package com.example.login.repository;

import com.example.login.model.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<LocalUser, Integer> {

    Optional<LocalUser> findByUsername(String username);
    Boolean existsByUsername(String username);
}
