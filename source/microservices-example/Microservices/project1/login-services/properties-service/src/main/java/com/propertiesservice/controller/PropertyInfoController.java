package com.propertiesservice.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.propertiesservice.model.PropertiesInfo;
import com.propertiesservice.service.PropertyService;

@RestController
@RequestMapping("/propertyInfo")
public class PropertyInfoController {

    @Autowired
    private PropertyService propertyService;
    
    @GetMapping("/{id}")
    public List<PropertiesInfo> getPropertiesInfoById(@PathVariable Long id){
        return propertyService.getPropertyInfoById(id);
    }
}
