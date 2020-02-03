package com.service.articles.impl;

import com.common.paging.Pagetion;
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
    public List<ReArticles> pagingFuzzyQueryEditorialFinishingArticles(Map<String, Object> map) {

        //获取Map中的page键对应的值
        Pagetion page =(Pagetion) map.get("pagetion");

        //设置总记录数
        page.setTotalCount(reArticlesDao.pagingFuzzyQueryEditorialFinishingArticlesAmount(map));

        //存入当前页码
        map.put("pageNo", (page.getPageNo() -1) * page.getPageSize());

        //每页显示数量
        map.put("pageSize", page.getPageSize());

        return reArticlesDao.pagingFuzzyQueryEditorialFinishingArticles(map);

    }
}