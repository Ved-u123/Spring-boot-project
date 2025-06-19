package com.app.hospital.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.hospital.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

    // Check if username already exists
    boolean existsByUsername(String username);

    // Find user by username (used for login)
    Optional<User> findByUsername(String username);
}
