package com.dao.articles;

import com.domain.articles.ReComments;
import com.domain.articles.ReSorts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @Description:  评论数据访问层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

@Repository
@Mapper
public interface ReCommentsDao {


    /**
     * @Description:  获取文章的树形评论
     * @Author: 夜空
     * @Date: 2020/2/5
     */
    List<ReComments> ArticlesTreeComments(ReComments Comments);

}