package com.codify.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String getHelloWorld(){
        return "HelloWorld";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean getHelloWorldBean(){
        return new HelloWorldBean("Hello-threr");
    }

    @GetMapping(path = "/path-var/{name}")
    public HelloWorldBean getPathParamValue(@PathVariable String name){
        return new HelloWorldBean(String.format("The name is %s", name));
    }
    
}
