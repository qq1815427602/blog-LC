package com.service.articles.impl;

import com.dao.articles.ReCommentsDao;
import com.domain.articles.ReComments;
import com.domain.articles.ReSorts;
import com.service.articles.ReCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @Description:  评论业务逻辑层接口实现
* @Author: 夜空
* @Date: 2020/1/29
*/

@Service
public class ReCommentsServiceImpl implements ReCommentsService {

    @Autowired
    ReCommentsDao reCommentsDao;

    /**
    * @Description:  获取文章的树形评论
    * @Author: 夜空
    * @Date: 2020/2/6
    */
    @Override
    public List<ReComments> ArticlesTreeComments(ReComments Comments) {

        //获取根数据(获取所有基础数据)
        List<ReComments> rootComments = reCommentsDao.ArticlesTreeComments(Comments);

        //经过处理后,最后的树形结果
        List<ReComments> TreeComments = new ArrayList<ReComments>();

        //循环存储(找出所有的根节点)
        for (ReComments reComments: rootComments){
            if (reComments.getParentCommentId().equals("0")){
                TreeComments.add(reComments);
            }
        }

        //为根节点设置子节点，getChild是递归调用的方法
        for (ReComments reComments : TreeComments){
            reComments.setCommentsChildrenList(getChild(String.valueOf(reComments.getCommentId()),rootComments));
        }

        return TreeComments;

    }

    /**
    * @Description:  新增评论
    * @Author: 夜空
    * @Date: 2020/2/6
    */
    @Override
    public int addComments(ReComments Comments) {
        return reCommentsDao.addComments(Comments);
    }

    /**
     * @Description:  获取父节点的子节点方法
     * @Author: 夜空
     * @Date: 2020/2/5
     */
    public List<ReComments> getChild(String id,List<ReComments> rootComments){

        //存放子菜单的集合
        List<ReComments> childList = new ArrayList<ReComments>();

        //遍历所有节点 ，将根元素ID与传过来的ID比较
        for (ReComments reComments : rootComments){
            if (reComments.getParentCommentId().equals(id)){
                childList.add(reComments);
            }
        }
        //把子节点的子节点再循环一遍
        for (ReComments reComments : childList){
            reComments.setCommentsChildrenList(getChild(String.valueOf((reComments.getCommentId())),rootComments));
        }

        //递归退出条件
        if (childList.size() == 0){
            return null;
        }

        return childList;
    }

}