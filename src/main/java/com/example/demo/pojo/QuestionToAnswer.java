package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author zyt
 */
@Document("questiontoanswer")
public class QuestionToAnswer {
    private String id;
    List<String> answerId;
    String questionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAnswerId() {
        return answerId;
    }

    public void setAnswerId(List<String> answerId) {
        this.answerId = answerId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
