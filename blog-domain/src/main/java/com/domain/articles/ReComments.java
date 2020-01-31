package com.domain.articles;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  评论实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
public class ReComments implements Serializable {
    /**
     * 评论ID
     */
    private Long commentId;

    /**
     * 发表用户ID
     */
    private Long userId;

    /**
     * 评论博文ID
     */
    private Long articleId;

    /**
     * 点赞数
     */
    private Long commentLikeCount;

    /**
     * 评论日期
     */
    private Date commentDate;

    /**
     * 父评论ID
     */
    private Long parentCommentId;

    /**
     * 状态 1:正常展示 2:冻结中 3:黑名单封禁
     */
    private Integer commentState;

    /**
     * 评论内容
     */
    private String commentContent;

    private static final long serialVersionUID = 1L;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCommentLikeCount() {
        return commentLikeCount;
    }

    public void setCommentLikeCount(Long commentLikeCount) {
        this.commentLikeCount = commentLikeCount;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public ReComments(Long commentId, Long userId, Long articleId, Long commentLikeCount, Date commentDate, Long parentCommentId, Integer commentState, String commentContent) {
        this.commentId = commentId;
        this.userId = userId;
        this.articleId = articleId;
        this.commentLikeCount = commentLikeCount;
        this.commentDate = commentDate;
        this.parentCommentId = parentCommentId;
        this.commentState = commentState;
        this.commentContent = commentContent;
    }

    public ReComments() {
    }
}