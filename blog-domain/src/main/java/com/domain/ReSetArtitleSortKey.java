package com.domain;

import java.io.Serializable;

/**
 * re_set_artitle_sort
 * @author 
 */
public class ReSetArtitleSortKey implements Serializable {
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

    public ReSetArtitleSortKey(Long articleId, Long sortId) {
        this.articleId = articleId;
        this.sortId = sortId;
    }

    public ReSetArtitleSortKey() {
    }
}