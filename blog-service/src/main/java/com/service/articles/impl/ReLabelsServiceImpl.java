package com.service.articles.impl;

import com.dao.articles.ReLabelsDao;
import com.domain.articles.ReLabels;
import com.service.articles.ReLabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:  标签业务逻辑层接口实现
* @Author: 夜空
* @Date: 2020/1/29
*/

@Service
public class ReLabelsServiceImpl implements ReLabelsService {

    @Autowired
    ReLabelsDao reLabelsDao;

    /**
    * @Description:  删除标签
    * @Author: 夜空
    * @Date: 2020/2/2
    */
    @Override
    public int deleteLabels(ReLabels reLabels) {
        return reLabelsDao.deleteLabels(reLabels);
    }

    /**
    * @Description:  添加标签
    * @Author: 夜空
    * @Date: 2020/2/2
    */
    @Override
    public int addLabels(ReLabels reLabels) {
        return reLabelsDao.addLabels(reLabels);
    }

    /**
    * @Description: 修改标签
    * @Author: 夜空
    * @Date: 2020/2/2
    */
    @Override
    public int updateLabels(ReLabels reLabels) {
        return reLabelsDao.updateLabels(reLabels);
    }

    /**
    * @Description:  分页模糊查询标签
    * @Author: 夜空
    * @Date: 2020/2/2
    */
    @Override
    public List<ReLabels> pagingFuzzyQueryLabels(ReLabels reLabels) {
        return reLabelsDao.pagingFuzzyQueryLabels(reLabels);
    }

}