package com.example.demo.service;

import com.example.demo.pojo.AnswerToComment;
import com.example.demo.pojo.Result;

import java.util.List;

public interface QuestionService {

    /**显示问题列表*/
    Result showQuestionList();

    /**发布问题*/
    Result appendQuestion(String questionTitle, String questionContent, String questionImage);

    /**显示问题及回答及评论*/
    Result showQuestion(String questionId);

    /**查询单个问题*/
    Result searchSingleQuestion(String questionId);

    /**修改单个问题*/
    Result alterSingleQuestion(String questionId, String questionTitle, String questionContent, String questionImage);

    /**删除问题*/
    Result deleteQuestion(String questionId);


}
