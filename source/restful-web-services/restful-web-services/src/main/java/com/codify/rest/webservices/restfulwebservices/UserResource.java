package com.codify.rest.webservices.restfulwebservices;

import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
    
    private UserDaoService daoService;

    public UserResource(UserDaoService daoService){
        this.daoService = daoService;
    }

    @GetMapping(path = "/users")
    public List<User> getUsers(){
        return daoService.findAllUsers();
    }

    @GetMapping(path = "/user/{id}")
    public User getUserById(@PathVariable int id){
        return daoService.findUserById(id);
    }

    @PostMapping(path = "/add-user")
    public void createUser(@RequestBody User user){
        daoService.saveUser(user);
    }
}
