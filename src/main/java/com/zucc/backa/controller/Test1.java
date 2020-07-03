package com.zucc.backa.controller;
import com.zucc.backa.pojo.User;
import com.zucc.backa.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "测试模块")
public class Test1 {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    @ApiOperation(value = "通过用户Id来获取用户信息",notes = "RestFul风格，需要传用户Id")
    @ApiImplicitParam(name = "userId",value = "用户Id",required = true)
    public List<User> hello() {
        User u = new User();
//        u.setId("122");
        u.setName("ss");
        System.out.println(userService.insertUser(u));
        return userService.findAll();
    }
}
