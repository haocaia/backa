package com.example.demo.controller;


import com.example.demo.pojo.AnswerToComment;
import com.example.demo.pojo.Result;
import com.example.demo.service.QuestionService;
import com.example.demo.service.QuestionServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("QuestionConreoller")
public class QuestionController implements QuestionService {

    @Autowired
    QuestionServiceImpl questionService;

    @Override
    @PostMapping("showQuestionList")

    public Result showQuestionList() {
        return questionService.showQuestionList();
    }

    @Override
    public Result appendQuestion(String questionTitle, String questionContent, String questionImage) {
        return null;
    }

    @Override
    public Result showQuestion(String questionId) {
        return null;
    }

    @Override
    public Result searchSingleQuestion(String questionId) {
        return null;
    }

    @Override
    public Result alterSingleQuestion(String questionId, String questionTitle, String questionContent, String questionImage) {
        return null;
    }

    @Override
    public Result deleteQuestion(String questionId) {
        return null;
    }
}
