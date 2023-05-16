package com.practices.loginproject.samplelogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practices.loginproject.samplelogin.model.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
