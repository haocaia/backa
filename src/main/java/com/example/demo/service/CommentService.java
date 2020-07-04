package com.example.demo.service;

public interface CommentService {

    /**发布评论*/
    boolean appendComment(String questionId, String answerId, String answerContent, String replyCommentId, String replyUserId);

    /**删除评论*/
    boolean deleteCommnet(String commentId);
}
