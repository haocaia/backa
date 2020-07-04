package com.example.demo.dao;

import com.example.demo.pojo.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zyt
 */
public interface QuestionDao extends MongoRepository<Question,Long> {
}
