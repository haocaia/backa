package com.zucc.backa.dao;

import com.zucc.backa.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, Long> {
}
