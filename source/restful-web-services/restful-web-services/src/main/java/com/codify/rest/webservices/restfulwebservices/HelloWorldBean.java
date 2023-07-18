package com.codify.rest.webservices.restfulwebservices;

public class HelloWorldBean {
    
    private String message;

    public HelloWorldBean(String mesString){
        this.message = mesString;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
