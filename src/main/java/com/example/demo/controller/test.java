package com.example.demo.controller;

import com.example.demo.dao.QuestionDao;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

@Api()
public class test {
    @Autowired
    QuestionDao questionDao;



}
