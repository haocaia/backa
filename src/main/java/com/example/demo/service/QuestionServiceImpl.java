package com.example.demo.service;

import com.example.demo.dao.QuestionDao;
import com.example.demo.pojo.Question;
import com.example.demo.pojo.Result;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionDao questionDao;

    @Override
    public Result showQuestionList() {
        List<Question> list =  null;
        try {
            list = questionDao.findAll();
        }catch (Exception e){
            return ResultUtil.error(-1,"连接错误");
        }
        return ResultUtil.success(list);
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
