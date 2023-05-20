package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;

@Service
public class UserServiceImpl implements UserService{

    List<User> users = List.of(
        new User(111L, "Ramen", "ramen2k10"),
        new User(123L, "Ramen G", "ramen2k10-3"),
        new User(145L, "Ramen ABC", "ramen2k10-1-2"),
        new User(140L, "Ramen CDF", "ramen2k10-2")
    );

    @Override
    public User getUser(Long id) {
        return this.users.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
    

}
