package com.th3arock.Spring.Security.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Workers, Integer> {

    Optional<Workers> findByUsername(String username);
}
