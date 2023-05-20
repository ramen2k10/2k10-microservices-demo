package com.propertiesservice.model;

public class PropertiesInfo {
    private Long propertyId;
    private String propertyType;
    private String yearOfPurchase;
    private String propertyValue;
    private Long ownerId;
    
    public PropertiesInfo(Long propertyId, String propertyType, String yearOfPurchase, String propertyValue,
            Long ownerId) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.yearOfPurchase = yearOfPurchase;
        this.propertyValue = propertyValue;
        this.ownerId = ownerId;
    }
    
    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(String yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

}
