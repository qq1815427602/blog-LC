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
    List<ReSorts> SortsPagingFuzzyQuery(ReSorts reSorts);

    /**
     * @Description:  删除分类
     * @Author: 夜空
     * @Date: 2020/2/4
     */
    int deleteSorts (ReSorts reSorts);

    /**
     * @Description:  添加分类
     * @Author: 夜空
     * @Date: 2020/2/4
     */
    int addSorts(ReSorts reSorts);

    /**
     * @Description:  修改分类
     * @Author: 夜空
     * @Date: 2020/2/4
     */
    int updateSorts(ReSorts reSorts);

    /**
     * @Description:  获取分类树形菜单
     * @Author: 夜空
     * @Date: 2020/2/5
     */
    List<ReSorts> SortsTreeMenu();
}