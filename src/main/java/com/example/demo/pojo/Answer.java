package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author zyt
 */
@Document(value = "answer")
public class Answer {
    /**id*/
    private String id;
    /**图片*/
    private String image;
    /**userId*/
    private String userId;
    /**主体*/
    private String content;
    /**发布时间*/
    private String time;
    /**点赞数*/
    private String  likeNumber;
    /**点踩数*/
    private String dislikeNumber;
    /**收藏数*/
    private String collectNumber;
    /**回答推荐值*/
    private double answerRate;
    /**教师推荐*/
    private List<String> bestAnswer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(String likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getDislikeNumber() {
        return dislikeNumber;
    }

    public void setDislikeNumber(String dislikeNumber) {
        this.dislikeNumber = dislikeNumber;
    }

    public String getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(String collectNumber) {
        this.collectNumber = collectNumber;
    }

    public double getAnswerRate() {
        return answerRate;
    }

    public void setAnswerRate(double answerRate) {
        this.answerRate = answerRate;
    }

    public List<String> getBestAnswer() {
        return bestAnswer;
    }

    public void setBestAnswer(List<String> bestAnswer) {
        this.bestAnswer = bestAnswer;
    }
}
