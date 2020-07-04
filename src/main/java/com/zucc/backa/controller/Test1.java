package com.zucc.backa.controller;
import com.zucc.backa.dao.UserDao;
import com.zucc.backa.pojo.Result;
import com.zucc.backa.pojo.User;
import com.zucc.backa.service.UserService;
import com.zucc.backa.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return ResultUtil.success(userService.findAll()); //success
    }
}
