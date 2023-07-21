package com.codify.advance.restservices.advancedrestwebservices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
    
    private static List<User> users =  new ArrayList<>();
    private static Integer userCount = 0;

    static{
        users.add(new User(++userCount, "Ramen", LocalDate.now().minusYears(28)));
        users.add(new User(++userCount, "Rajesh", LocalDate.now().minusYears(18)));
        users.add(new User(++userCount, "Syam", LocalDate.now().minusYears(31)));
        users.add(new User(++userCount, "Suren", LocalDate.now().minusYears(10)));
    }

    public List<User> findAllUsers(){
        return users;
    }

    public User findUserById(int id){
        Predicate<? super User> predicate = user-> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveUser(User user){
        user.setId(++userCount);
        users.add(user );
        return user;
    }

    public void deleteUser(int id){
        Predicate<? super User> predicate = user-> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
