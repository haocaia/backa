package com.example.demo.dao;

import com.example.demo.pojo.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zyt
 */
public interface AnswerDao extends MongoRepository<Answer, Long> {
}
