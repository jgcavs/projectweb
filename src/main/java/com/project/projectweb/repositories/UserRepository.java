package com.project.projectweb.repositories;

import com.project.projectweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
