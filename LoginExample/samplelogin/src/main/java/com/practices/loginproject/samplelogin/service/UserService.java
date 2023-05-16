package com.practices.loginproject.samplelogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.practices.loginproject.samplelogin.controller.dto.UserRegistrationDto;
import com.practices.loginproject.samplelogin.model.User;

public interface UserService extends UserDetailsService{
    User saveUser(UserRegistrationDto registrationDto);
}
