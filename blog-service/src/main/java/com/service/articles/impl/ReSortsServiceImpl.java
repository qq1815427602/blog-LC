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
    public List<ReSorts> SortsPagingFuzzyQuery(ReSorts reSorts) {
        return reSortsDao.SortsPagingFuzzyQuery(reSorts);
    }

    /**
    * @Description:  删除分类
    * @Author: 夜空
    * @Date: 2020/2/4
    */
    @Override
    public int deleteSorts(ReSorts reSorts) {
        return reSortsDao.deleteSorts(reSorts);
    }

    /**
    * @Description:  添加分类
    * @Author: 夜空
    * @Date: 2020/2/4
    */
    @Override
    public int addSorts(ReSorts reSorts) {
        return reSortsDao.addSorts(reSorts);
    }

    /**
    * @Description:  修改分类
    * @Author: 夜空
    * @Date: 2020/2/4
    */
    @Override
    public int updateSorts(ReSorts reSorts) {
        return reSortsDao.updateSorts(reSorts);
    }
}