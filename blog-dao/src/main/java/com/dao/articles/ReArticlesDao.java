package com.dao.articles;

import com.domain.articles.ReArticles;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
* @Description: 帖子数据访问层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@Repository
@Mapper
public interface ReArticlesDao {

    /**
     * @Description: 文章保存为编辑完成
     * @author: 夜空
     * @date: 2020/2/1
     */
    int ArticleSavedAsEditComplete(ReArticles reArticles);

    /**
    * @Description:  模糊分页查询编辑完成文章
    * @Author: 夜空
    * @Date: 2020/2/1
    */
    List<ReArticles> pagingFuzzyQueryEditorialFinishingArticles(ReArticles reArticles);

    /**
    * @Description:  永久删除垃圾箱文章
    * @Author: 夜空
    * @Date: 2020/2/4
    */
    int deleteTrashArticles(ReArticles reArticles);

}