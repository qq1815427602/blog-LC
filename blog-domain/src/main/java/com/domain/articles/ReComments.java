package com.domain.articles;

import com.domain.user.ReUsers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* @Description:  评论实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReComments implements Serializable {
    /**
     * 评论ID
     */
    private Long commentId;

    /**
     * 发表用户ID
     */
    private ReUsers reUsers;

    /**
     * 评论文章ID
     */
    private ReArticles reArticles;

    /**
     * 点赞数
     */
    private Long commentLikeCount;

    /**
     * 评论日期
     */
    private Date commentDate;

    /**
     * 父评论ID
     */
    private String parentCommentId;

    /**
     * 状态 1:正常展示 2:冻结中 3:黑名单封禁
     */
    private Integer commentState;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 子评论
     */
    private List<ReComments> commentsChildrenList;

}