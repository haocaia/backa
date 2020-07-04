package com.example.demo.service;

import com.example.demo.pojo.Answer;

public interface AnswerService {
    /**发布回答*/
    boolean appendAnswer(String answerId, String answerTitle, String answerContent, String answerImage);

    /**删除回答*/
    boolean deleteAnswer(String answerId);

    /**查询单个回答*/
    Answer searchSingleAnswer(String answerId);

    /**修改单个回答*/
    boolean alterSingleAnswer(String answerId, String answerTitle, String answerContent, String answerImage);
}
