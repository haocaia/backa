package com.example.demo.controller;
import com.example.demo.pojo.Result;
import com.example.demo.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@Api(tags = "测试接口")
@RestController
public class Test1 {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;

    @GetMapping("/hello")
    @ApiOperation(value="hello", notes="注意问题", produces="application/json")
    public Result hello() {

        User u = new User();
        u.setName("ssss");
        userService.insertUser(u);
        return ResultUtil.success(userService.findAll());
    }
}
