package com.domain;

import java.io.Serializable;

/**
 * re_sorts
 * @author 
 */
public class ReSorts implements Serializable {
    /**
     * 分类ID
     */
    private Long sortId;

    /**
     * 分类名称
     */
    private String sortName;

    /**
     * 分类别名
     */
    private String sortAlias;

    /**
     * 父分类ID
     */
    private Long parentSortId;

    /**
     * 分类描述
     */
    private String sortDescription;

    private static final long serialVersionUID = 1L;

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortAlias() {
        return sortAlias;
    }

    public void setSortAlias(String sortAlias) {
        this.sortAlias = sortAlias;
    }

    public Long getParentSortId() {
        return parentSortId;
    }

    public void setParentSortId(Long parentSortId) {
        this.parentSortId = parentSortId;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public ReSorts(Long sortId, String sortName, String sortAlias, Long parentSortId, String sortDescription) {
        this.sortId = sortId;
        this.sortName = sortName;
        this.sortAlias = sortAlias;
        this.parentSortId = parentSortId;
        this.sortDescription = sortDescription;
    }

    public ReSorts() {
    }
}