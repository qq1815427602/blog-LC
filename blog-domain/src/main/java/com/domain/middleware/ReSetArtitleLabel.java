package com.domain.middleware;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
* @Description:  文章所属标签实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReSetArtitleLabel implements Serializable {

    /**
     * 编号ID
     */
    private Long articleLabelId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 标签ID
     */
    private Long labelId;

}