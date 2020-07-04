package com.example.demo.controller;


import com.example.demo.pojo.AnswerToComment;
import com.example.demo.pojo.Result;
import com.example.demo.service.QuestionService;
import com.example.demo.service.QuestionServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "问题模块")
public class QuestionController implements QuestionService {

    @Autowired
    QuestionServiceImpl questionService;

    @ApiOperation(value = "显示问题列表", notes = "方法的备注说明，如果有可以写在这里")
    @Override
    @PostMapping("showQuestionList")
    public Result showQuestionList() {
        return questionService.showQuestionList();
    }

    @ApiOperation(value = "发布问题", notes = "方法的备注说明，如果有可以写在这里")
    @ApiImplicitParams({
            @ApiImplicitParam(name="questionTitle",value="问题标题",required=true,dataType = "string"),
            @ApiImplicitParam(name="questionContent",value="问题内容",required=true,dataType = "string"),
            @ApiImplicitParam(name="questionImage",value="包含图片",required=false,dataType="String")
    })
    @Override
    @PostMapping("appendQuestion")
    public Result appendQuestion(String questionTitle, String questionContent, String questionImage) {
        return null;
    }

    @ApiOperation(value = "显示问题及回答及评论", notes = "方法的备注说明，如果有可以写在这里")
    @ApiImplicitParam(name="questionId",value="问题编号(ID)",required=true,dataType = "string")
    @Override
    @PostMapping("showQuestion")
    public Result showQuestion(String questionId) {
        return null;
    }

    @ApiOperation(value = "查询单个问题", notes = "方法的备注说明，如果有可以写在这里")
    @ApiImplicitParam(name="questionId",value="问题编号(ID)",required=true,dataType = "string")
    @Override
    @PostMapping("searchSingleQuestion")
    public Result searchSingleQuestion(String questionId) {
        return null;
    }

    @ApiOperation(value = "修改单个问题", notes = "方法的备注说明，如果有可以写在这里")
    @ApiImplicitParams({
            @ApiImplicitParam(name="questionId",value="问题编号(ID)",required=true,dataType = "string"),
            @ApiImplicitParam(name="questionTitle",value="问题标题",required=true,dataType = "string"),
            @ApiImplicitParam(name="questionContent",value="问题内容",required=true,dataType="String"),
            @ApiImplicitParam(name="questionImage",value="问题图片",required=false,dataType="String")
    })
    @Override
    @PostMapping("alterSingleQuestion")
    public Result alterSingleQuestion(String questionId, String questionTitle, String questionContent, String questionImage) {
        return null;
    }

    @ApiOperation(value = "删除问题", notes = "方法的备注说明，如果有可以写在这里")
    @ApiImplicitParam(name="questionId",value="问题编号(ID)",required=true,dataType = "string")
    @Override
    @PostMapping("deleteQuestion")
    public Result deleteQuestion(String questionId) {
        return null;
    }
}
