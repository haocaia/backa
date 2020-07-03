package com.zucc.backa.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "answer")
public class Answer {
    private String id;                  /*id*/
    private String image;               /*图片*/
    private String userId;              /*userId*/
    private String content;             /*主体*/
    private String time;                /*发布时间*/
    private String likeNumber;             /*点赞数*/
}
