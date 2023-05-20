package com.userinfoservice.model;

import java.util.List;

public class UserInfo {
    private Long id;
    private String fname;
    private String lname;
    private String email;
    private String phno;
    private List<PropertiesInfo> userProperties ;

    public List<PropertiesInfo> getUserProperties() {
        return userProperties;
    }

    public void setUserProperties(List<PropertiesInfo> userProperties) {
        this.userProperties = userProperties;
    }

    public UserInfo(Long id, String fname, String lname, String email, String phno,
            List<PropertiesInfo> userProperties) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phno = phno;
        this.userProperties = userProperties;
    }

    public UserInfo(Long id, String fname, String lname, String email, String phno) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phno = phno;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhno() {
        return phno;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
}
