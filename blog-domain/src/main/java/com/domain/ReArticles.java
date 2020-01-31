package com.domain;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  帖子实体类
* @Author: 夜空
* @Date: 2020/1/29
*/
public class ReArticles implements Serializable {
    /**
     * 帖子ID
     */
    private Long articleId;

    /**
     * 发表用户ID
     */
    private Long userId;

    /**
     * 浏览量
     */
    private Long articleViews;

    /**
     * 评论总数
     */
    private Long articleCommentCount;

    /**
     * 发表时间
     */
    private Date articleDate;

    /**
     * 点赞数量
     */
    private Long articleLikeCount;

    /**
     * 状态 1:展示中 2:草稿箱 3:垃圾箱
     */
    private Integer articleState;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }

    public Long getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Long articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Long getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Long articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Integer getArticleState() {
        return articleState;
    }

    public void setArticleState(Integer articleState) {
        this.articleState = articleState;
    }

    public ReArticles(Long articleId, Long userId, Long articleViews, Long articleCommentCount, Date articleDate, Long articleLikeCount, Integer articleState) {
        this.articleId = articleId;
        this.userId = userId;
        this.articleViews = articleViews;
        this.articleCommentCount = articleCommentCount;
        this.articleDate = articleDate;
        this.articleLikeCount = articleLikeCount;
        this.articleState = articleState;
    }

    public ReArticles() {
    }
}