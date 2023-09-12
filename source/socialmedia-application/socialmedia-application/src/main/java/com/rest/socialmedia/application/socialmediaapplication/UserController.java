package com.rest.socialmedia.application.socialmediaapplication;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service){
        this.service = service;
    }
    
    @RequestMapping(path = "/users", method=RequestMethod.GET)
    public List<User> retrieveAllUser(){
        return service.findAllUser();
    }

    @GetMapping("/user/{id}")
    public User reterieveUser(@PathVariable Long id){
        User objUser = service.findOne(id);
        if(objUser == null){
            throw new UserNotFoundException("User does not exist for id: "+id);
        }
        return objUser;
    }

    @PostMapping("/user/add")
    public ResponseEntity createUser(@RequestBody User user){
        User addedUser = service.save(user);
        URI location = null;
        location = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(addedUser.getId())
                    .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/user/del/{id}")
    public void deleteUserById(@PathVariable Long id){
        service.remove(id);
    }
}
