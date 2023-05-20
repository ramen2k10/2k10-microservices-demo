package com.contact.model;

public class Contact {
    private Long cID;
    private String phone;
    private String contactName;
    private Long userId;
    
    public Contact(Long cID, String phone, String contactName, Long userId) {
        this.cID = cID;
        this.phone = phone;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcID() {
        return cID;
    }

    public void setcID(Long cID) {
        this.cID = cID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
}