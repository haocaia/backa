package com.zucc.backa.pojo;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    private String id;                  /*id*/
    private String title;               /*标题*/
    private String content;             /*主体*/
    private String image;               /*图片*/
    private String userId;              /*userId*/
    private String time;                /*发布时间*/
    private String likeNumber;             /*点赞数*/
    private String replyNumber;         /*回答数*/
    private String collectionNumber;    /*收藏数*/
}
