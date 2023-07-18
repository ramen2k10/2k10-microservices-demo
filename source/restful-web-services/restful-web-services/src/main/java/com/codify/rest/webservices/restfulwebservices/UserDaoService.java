package com.codify.rest.webservices.restfulwebservices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static List<User> users =  new ArrayList<>();

    static{
        users.add(new User(1, "Ramen", LocalDate.now().minusYears(28)));
        users.add(new User(2, "Rajesh", LocalDate.now().minusYears(18)));
        users.add(new User(3, "Syam", LocalDate.now().minusYears(31)));
        users.add(new User(4, "Suren", LocalDate.now().minusYears(10)));
    }

    public List<User> findAllUsers(){
        return users;
    }

    public User findUserById(int id){
        Predicate<? super User> predicate = user-> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
