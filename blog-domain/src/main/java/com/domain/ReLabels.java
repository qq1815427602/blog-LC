package com.domain;

import java.io.Serializable;

/**
 * re_labels
 * @author 
 */
public class ReLabels implements Serializable {
    /**
     * 标签ID
     */
    private Long labelId;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 标签别名
     */
    private String labelAlias;

    /**
     * 标签描述
     */
    private String labelDescription;

    private static final long serialVersionUID = 1L;

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelAlias() {
        return labelAlias;
    }

    public void setLabelAlias(String labelAlias) {
        this.labelAlias = labelAlias;
    }

    public String getLabelDescription() {
        return labelDescription;
    }

    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription;
    }

    public ReLabels(Long labelId, String labelName, String labelAlias, String labelDescription) {
        this.labelId = labelId;
        this.labelName = labelName;
        this.labelAlias = labelAlias;
        this.labelDescription = labelDescription;
    }

    public ReLabels() {
    }
}