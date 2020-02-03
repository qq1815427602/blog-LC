package com.domain.articles;

import com.domain.middleware.ReSetArtitleLabel;
import com.domain.user.ReRoles;
import com.domain.user.ReUsers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
     * 发表用户
     */
    private ReUsers reUsers;

    /**
     * 帖子标题
     */
    private String articleTitle;

    /**
     * 帖子内容
     */
    private String articleContent;

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
     * 状态 0:编辑完成 1:展示中 2:草稿箱 3:垃圾箱
     */
    private Integer articleState;

    /**
     * 标签
     */
    private ReLabels reLabels;

    /**
     * 文章标签一对多
     */
    private List<ReSetArtitleLabel> artitleLabelList;

}