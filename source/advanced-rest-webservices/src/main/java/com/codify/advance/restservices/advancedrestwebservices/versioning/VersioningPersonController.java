package com.codify.advance.restservices.advancedrestwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    
    @GetMapping(path = "/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Ramen Guchhait");
    }

    @GetMapping(path = "/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Ramen", "Guchhait"));
    }
    @GetMapping(path = "/person", params="version1")
    public PersonV1 getFirstVersionOfPersonRequestParam(){
        return new PersonV1("Ramen Guchhait");
    }

    @GetMapping(path = "/person", params="version2")
    public PersonV2 getSecondVersionOfPersonRequestParam(){
        return new PersonV2(new Name("Ramen", "Guchhait"));
    }
    
    @GetMapping(path = "/person", headers="X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Ramen Guchhait");
    }

    @GetMapping(path = "/person", params="X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Ramen", "Guchhait"));
    }
}
