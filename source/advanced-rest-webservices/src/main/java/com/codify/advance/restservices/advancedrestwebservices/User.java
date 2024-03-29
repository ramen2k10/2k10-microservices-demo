package com.codify.advance.restservices.advancedrestwebservices;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity(name = "user-details")
public class User {
    
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 2, message="Name should be two charecter")
    private String name;
    @Past(message="Birth day should be past")
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }

    

}