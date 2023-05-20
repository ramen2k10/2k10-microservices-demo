package com.userinfoservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userinfoservice.model.UserInfo;

@Service
public class UserServiceImpl implements UserInfoService{

    List<UserInfo> listUserInfo = List.of(
        new UserInfo(111L, "Ramen", "Guchhait", "ramen2k110@gmail.com", "9986816542"),
        new UserInfo(112L, "Ramen1", "Guchhait", "ramen2k110@gmail.com", "9986816543"),
        new UserInfo(113L, "Ramen2", "Guchhait", "ramen2k110@gmail.com", "9986816544"),
        new UserInfo(114L, "Ramen3", "Guchhait", "ramen2k110@gmail.com", "9986816545"),
        new UserInfo(115L, "Ramen4", "Guchhait", "ramen2k110@gmail.com", "9986816546")

    );

    @Override
    public UserInfo getUserInfoById(Long userId) {
        //return this.listUserInfo.stream().filter(user->user.getId().).findAny().orElse(null);
        return this.listUserInfo.stream().filter(user->user.getId().equals(userId)).findAny().orElse(null);
    }
    
}
