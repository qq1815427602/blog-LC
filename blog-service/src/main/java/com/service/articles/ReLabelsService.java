package com.service.articles;

import com.domain.articles.ReLabels;

import java.util.List;
import java.util.Map;

/**
* @Description:  标签业务逻辑层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

public interface ReLabelsService {

    /**
     * @Description:  删除标签
     * @Author: 夜空
     * @Date: 2020/2/2
     */
    int deleteLabels(ReLabels reLabels);

    /**
     * @Description:  添加标签
     * @Author: 夜空
     * @Date: 2020/2/2
     */
    int addLabels(ReLabels reLabels);

    /**
     * @Description:  修改标签
     * @Author: 夜空
     * @Date: 2020/2/2
     */
    int updateLabels(ReLabels reLabels);

    /**
     * @Description:  分页模糊查询标签
     * @Author: 夜空
     * @Date: 2020/2/2
     */
    List<ReLabels> pagingFuzzyQueryLabels(ReLabels reLabels);

}