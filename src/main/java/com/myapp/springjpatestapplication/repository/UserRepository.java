package com.myapp.springjpatestapplication.repository;

import com.myapp.springjpatestapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
