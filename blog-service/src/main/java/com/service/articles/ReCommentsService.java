package com.service.articles;

import com.domain.articles.ReComments;
import com.domain.articles.ReSorts;

import java.util.List;

/**
* @Description:  评论业务逻辑层接口
* @Author: 夜空
* @Date: 2020/1/29
*/

public interface ReCommentsService {

    /**
     * @Description:  获取文章的树形评论
     * @Author: 夜空
     * @Date: 2020/2/5
     */
    List<ReComments> ArticlesTreeComments(ReComments Comments);

    /**
     * @Description:  新增评论
     * @Author: 夜空
     * @Date: 2020/2/6
     */
    int addComments(ReComments Comments);

}