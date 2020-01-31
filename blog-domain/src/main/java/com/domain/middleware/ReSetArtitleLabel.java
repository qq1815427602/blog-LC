package com.domain.middleware;

import java.io.Serializable;

/**
* @Description:  文章所属标签实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
public class ReSetArtitleLabel implements Serializable {
    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 标签ID
     */
    private Long labelId;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public ReSetArtitleLabel(Long articleId, Long labelId) {
        this.articleId = articleId;
        this.labelId = labelId;
    }

    public ReSetArtitleLabel() {
    }
}