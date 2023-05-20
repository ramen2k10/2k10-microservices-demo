package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contacts = List.of(
        new Contact(1L, "9986816546", "Ramen", 111L),
        new Contact(2L, "9986816549", "Ramen", 145L),
        new Contact(3L, "9986816548", "Ramen", 140L),
        new Contact(4L, "9986816547", "Ramen", 111L)
    );

    @Override
    public List<Contact> getUserContact(Long userId) {
        return this.contacts.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
    
}
