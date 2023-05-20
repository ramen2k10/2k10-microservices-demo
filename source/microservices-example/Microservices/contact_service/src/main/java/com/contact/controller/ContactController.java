package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contact> getUserContacts(@PathVariable Long userId){
        return contactService.getUserContact(userId);

    }
}
