package com.domain.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
* @Description:  标签实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}