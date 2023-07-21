package com.codify.advance.restservices.advancedrestwebservices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
    

    UserNotFoundException(String message){
        super(message);
    }

}
