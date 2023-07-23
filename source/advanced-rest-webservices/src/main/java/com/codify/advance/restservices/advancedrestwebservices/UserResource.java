package com.codify.advance.restservices.advancedrestwebservices;

import java.net.URI;
import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

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

    /*@GetMapping(path = "/user/{id}")
    public EntityModel<User> getUserById(@PathVariable int id){
        User user = daoService.findUserById(id);
        if(user == null){
            throw new UserNotFoundException("id: "+id);
        }

        EntityModel<User> entityModel =  EntityModel.of(user);
        WebMvcLinkBuilder mvcLinkBuilder = linkTo(null).retriveAllUsers();
        entityModel.add(mvcLinkBuilder.withRel("all-users"));
        return entityModel;
    }*/

    @GetMapping(path = "/user/{id}")
    public User getUserById(@PathVariable int id){
        User user = daoService.findUserById(id);
        if(user == null){
            throw new UserNotFoundException("id: "+id);
        }
        return user;
    }

    @PostMapping(path = "/add-user")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User saveUser = daoService.saveUser(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                    path("/{id}").
                    buildAndExpand(saveUser.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUserById(@PathVariable int id){
          daoService.deleteUser(id);
    }
}

