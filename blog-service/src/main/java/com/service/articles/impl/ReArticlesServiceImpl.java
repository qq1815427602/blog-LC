package com.service.articles.impl;

import com.dao.articles.ReArticlesDao;
import com.domain.articles.ReArticles;
import com.service.articles.ReArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Description: 帖子业务逻辑层接口实现
* @Author: 夜空
* @Date: 2020/1/29
*/

@Service
public class ReArticlesServiceImpl implements ReArticlesService {

    @Autowired
    ReArticlesDao reArticlesDao;

    /**
     * @Description: 保存文章为编辑完成状态
     * @author: 夜空
     * @date: 2020/2/1
     */
    @Override
    public int ArticleSavedAsEditComplete(ReArticles reArticles) {
        return reArticlesDao.ArticleSavedAsEditComplete(reArticles);
    }

    /**
     * @Description:  模糊分页查询编辑完成文章
     * @Author: 夜空
     * @Date: 2020/2/1
     */
    @Override
    public List<ReArticles> pagingFuzzyQueryEditorialFinishingArticles(ReArticles reArticles) {
        return reArticlesDao.pagingFuzzyQueryEditorialFinishingArticles(reArticles);
    }

    /**
    * @Description:  永久删除垃圾箱文章
    * @Author: 夜空
    * @Date: 2020/2/4
    */
    @Override
    public int deleteTrashArticles(ReArticles reArticles) {
        return reArticlesDao.deleteTrashArticles(reArticles);
    }
}