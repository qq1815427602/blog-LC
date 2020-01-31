package com.domain.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  文章实体类
* @Author: 夜空
* @Date: 2020/1/29
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReArticles implements Serializable {
    /**
     * 帖子ID
     */
    private Long articleId;

    /**
     * 发表用户ID
     */
    private Long userId;

    /**
     * 浏览量
     */
    private Long articleViews;

    /**
     * 评论总数
     */
    private Long articleCommentCount;

    /**
     * 发表时间
     */
    private Date articleDate;

    /**
     * 点赞数量
     */
    private Long articleLikeCount;

    /**
     * 状态 1:展示中 2:草稿箱 3:垃圾箱
     */
    private Integer articleState;

}