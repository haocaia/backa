package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author zyt
 */
@Document("question")
public class Question implements Serializable {
    /**id*/
    private String id;
    /**标题*/
    private String title;
    /**主体*/
    private String content;
    /**图片*/
    private String image;
    /**userId*/
    private String userId;
    /**发布时间*/
    private String time;
    /**点赞数*/
    private String likeNumber;
    /**点踩数*/
    private String disLikeNumber;
    /**回答数*/
    private String replyNumber;
    /**收藏数*/
    private String collectionNumber;
    /**问题推荐值数*/
    private double questionRate;
    /**标签*/
    private List<String> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getDisLikeNumber() {
        return disLikeNumber;
    }

    public void setDisLikeNumber(String disLikeNumber) {
        this.disLikeNumber = disLikeNumber;
    }

    public String getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }

    public String getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(String collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public double getQuestionRate() {
        return questionRate;
    }

    public void setQuestionRate(double questionRate) {
        this.questionRate = questionRate;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
