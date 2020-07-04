package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author zyt
 */
@Document(value = "answertocomment")
public class AnswerToComment {
    private String id;
    String answerId;
    List<String> commentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public List<String> getCommentId() {
        return commentId;
    }

    public void setCommentId(List<String> commentId) {
        this.commentId = commentId;
    }
}
