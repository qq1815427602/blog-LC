package com.dao.articles;

import com.domain.articles.ReSorts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Description: 分类数据访问层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@Repository
@Mapper
public interface ReSortsDao {

    /**
    * @Description:  分类的分页模糊查询
    * @Author: 夜空
    * @Date: 2020/2/3
    */
    List<ReSorts> SortsPagingFuzzyQuery(String sortName);

}