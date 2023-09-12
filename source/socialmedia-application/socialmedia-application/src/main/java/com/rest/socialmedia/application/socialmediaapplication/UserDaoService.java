package com.rest.socialmedia.application.socialmediaapplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Long idCount = 100L;

    static{
        users.add(new User(++idCount, "Ramen", LocalDate.now().minusYears(20)));
        users.add(new User(++idCount, "Nimisha", LocalDate.now().minusYears(13)));
        users.add(new User(++idCount, "Ratul", LocalDate.now().minusYears(12)));
        users.add(new User(++idCount, "Piu", LocalDate.now().minusYears(6)));
    }
    
    public User save(User user){
        user.setId(++idCount);
        users.add(user);
        return user;
    }

    public List<User> findAllUser(){
        return users;
    }

    public User findOne(Long id){
        Predicate<? super User> item = user -> user.getId().equals(id);
        return users.stream().filter(item).findFirst().orElse(null);
    }

    public void remove(Long id){
        Predicate<? super User> item = user -> user.getId().equals(id);
        users.removeIf(item);
    }
}
