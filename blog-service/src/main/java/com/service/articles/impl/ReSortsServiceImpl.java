package com.service.articles.impl;

import com.common.response.ResponseFormat;
import com.dao.articles.ReSortsDao;
import com.domain.articles.ReSorts;
import com.service.articles.ReSortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    /**
    * @Description:  获取分类树形菜单
    * @Author: 夜空
    * @Date: 2020/2/5
    */
    @Override
    public List<ReSorts> SortsTreeMenu() {

        //获取根数据(获取所有基础数据)
        List<ReSorts> rootSorts = reSortsDao.SortsTreeMenu();

        //经过处理后,最后的树形结果
        List<ReSorts> SortsTreeList = new ArrayList<ReSorts>();

        //循环存储(找出所有的根节点)
        for (ReSorts reSorts : rootSorts){
            if (("0").equals(reSorts.getParentSortId())){
                SortsTreeList.add(reSorts);
            }
        }

        //为根节点设置子节点，getChild是递归调用的方法
        for (ReSorts reSorts : SortsTreeList){
            reSorts.setSortsChildrenList(getChild(String.valueOf(reSorts.getSortId()),rootSorts));
        }

        return SortsTreeList;
    }

    /**
    * @Description:  获取父节点的子节点方法
    * @Author: 夜空
    * @Date: 2020/2/5
    */
    public List<ReSorts> getChild(String id,List<ReSorts> rootSorts){

        //存放子菜单的集合
        List<ReSorts> childList = new ArrayList<ReSorts>();

        //遍历所有节点 ，将根元素ID与传过来的ID比较
        for (ReSorts reSorts : rootSorts){
            if (reSorts.getParentSortId().equals(id)){
                childList.add(reSorts);
            }
        }
        //把子节点的子节点再循环一遍
        for (ReSorts reSorts : childList){
            reSorts.setSortsChildrenList(getChild(String.valueOf((reSorts.getSortId())),rootSorts));
        }

        //递归退出条件
        if (childList.size() == 0){
            return null;
        }

        return childList;
    }

}