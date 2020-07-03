package com.zucc.backa.service;

import com.zucc.backa.pojo.User;
import com.zucc.backa.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public boolean insertUser(User user){
        try {
            userRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
