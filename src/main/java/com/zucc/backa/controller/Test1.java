package com.zucc.backa.controller;
import com.zucc.backa.pojo.User;
import com.zucc.backa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test1 {


    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public List<User> hello() {
        User u = new User();
        u.setId("12");
        u.setName("sss");
        System.out.println(userService.insertUser(u));
        return userService.findAll();
    }
}
