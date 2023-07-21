package com.codify.advance.restservices.advancedrestwebservices.versioning;

public class PersonV1 {
    private String name;

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    PersonV1(String name){
        this.name = name;
    }
}
