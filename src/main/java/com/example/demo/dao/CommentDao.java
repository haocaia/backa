package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zyt
 */
public interface CommentDao extends MongoRepository<Comment,Long> {
}
