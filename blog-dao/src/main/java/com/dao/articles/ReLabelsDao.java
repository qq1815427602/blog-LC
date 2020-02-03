package com.dao.articles;

import com.domain.articles.ReLabels;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
* @Description:  标签数据访问层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@Repository
@Mapper
public interface ReLabelsDao {

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
    List<ReLabels> pagingFuzzyQueryLabels(Map<String, Object> map);

    /**
    * @Description:  分页模糊查询标签数量
    * @Author: 夜空
    * @Date: 2020/2/2
    */
    int pagingFuzzyQueryLabelsCount(Map<String, Object> map);

}