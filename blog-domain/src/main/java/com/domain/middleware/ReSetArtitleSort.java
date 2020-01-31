package com.domain.middleware;

import java.io.Serializable;

/**
* @Description:  文章所属分类实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
public class ReSetArtitleSort implements Serializable {
    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 分类ID
     */
    private Long sortId;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public ReSetArtitleSort(Long articleId, Long sortId) {
        this.articleId = articleId;
        this.sortId = sortId;
    }

    public ReSetArtitleSort() {
    }
}