package com.service.articles;

import com.domain.articles.ReArticles;

import java.util.List;
import java.util.Map;

/**
* @Description: 帖子业务逻辑层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

public interface ReArticlesService {

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
    List<ReArticles> pagingFuzzyQueryEditorialFinishingArticles(Map<String, Object> map);

}