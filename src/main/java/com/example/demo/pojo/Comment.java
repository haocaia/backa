package com.example.demo.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("comment")
public class Comment {
    /**id*/
    private String id;
    /**被评论id*/
    private String beReplyId;
    /**userId*/
    private String userId;
    /**主体*/
    private String content;
    /**发布时间*/
    private String time;
    /**点赞数*/
    private String  likeNumber;
    /**点踩数*/
    private String disLikeNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeReplyId() {
        return beReplyId;
    }

    public void setBeReplyId(String beReplyId) {
        this.beReplyId = beReplyId;
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

    public String getDisLikeNumber() {
        return disLikeNumber;
    }

    public void setDisLikeNumber(String disLikeNumber) {
        this.disLikeNumber = disLikeNumber;
    }
}
