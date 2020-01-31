package com.domain;

import java.io.Serializable;

/**
 * re_set_artitle_label
 * @author 
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