package com.service.articles;

import com.domain.articles.ReSorts;

import java.util.List;

/**
* @Description: 分类业务逻辑层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

public interface ReSortsService {

    /**
     * @Description:  分类的分页模糊查询
     * @Author: 夜空
     * @Date: 2020/2/3
     */
    List<ReSorts> SortsPagingFuzzyQuery(String sortName);

}