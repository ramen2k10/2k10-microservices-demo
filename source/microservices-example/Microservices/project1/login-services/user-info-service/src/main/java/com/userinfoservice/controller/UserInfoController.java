package com.userinfoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userinfoservice.model.PropertiesInfo;
import com.userinfoservice.model.UserInfo;
import com.userinfoservice.services.UserInfoService;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public UserInfo getUserInfoById(@PathVariable Long userId){
         UserInfo userInfo =  userInfoService.getUserInfoById(userId);
         List<PropertiesInfo> propertyInfo = restTemplate.getForObject("http://propertyinfo-service/propertyInfo/"+userId, List.class);
         userInfo.setUserProperties(propertyInfo);
        return userInfo;
    }
}
