package com.domain.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
* @Description:  分类实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    private String parentSortId;

    /**
     * 分类描述
     */
    private String sortDescription;

    /**
     * 子菜单
     */
    private List<ReSorts> sortsChildrenList;

}