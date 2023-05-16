package com.practices.loginproject.samplelogin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.practices.loginproject.samplelogin.config.CommonConfig;
import com.practices.loginproject.samplelogin.controller.dto.UserRegistrationDto;
import com.practices.loginproject.samplelogin.model.Role;
import com.practices.loginproject.samplelogin.model.User;
import com.practices.loginproject.samplelogin.repository.UserRepositories;

@Service
public class UserServiceImpl implements UserService{
    
    public UserRepositories userRepositories;
    
    @Autowired(required=true)
   public CommonConfig commonConfig;

    public UserServiceImpl( UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }


    @Override
    public User saveUser(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
        registrationDto.getEmail(), commonConfig.getEncoder().encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
        return userRepositories.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepositories.findByEmail(username);
        if( user == null){
            throw new UsernameNotFoundException("User Not available");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRoleAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRoleAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
