package com.service.articles.impl;

import com.dao.articles.ReSortsDao;
import com.domain.articles.ReSorts;
import com.service.articles.ReSortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description: 分类业务逻辑层接口实现
* @Author: 夜空
* @Date: 2020/1/29
*/

@Service
public class ReSortsServiceImpl implements ReSortsService {

    @Autowired
    ReSortsDao reSortsDao;

    /**
     * @Description:  分类的分页模糊查询
     * @Author: 夜空
     * @Date: 2020/2/3
     */
    @Override
    public List<ReSorts> SortsPagingFuzzyQuery(String sortName) {
        return reSortsDao.SortsPagingFuzzyQuery(sortName);
    }
}