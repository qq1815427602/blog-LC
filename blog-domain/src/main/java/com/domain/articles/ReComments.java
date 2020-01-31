package com.domain.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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
    private Long userId;

    /**
     * 评论博文ID
     */
    private Long articleId;

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
    private Long parentCommentId;

    /**
     * 状态 1:正常展示 2:冻结中 3:黑名单封禁
     */
    private Integer commentState;

    /**
     * 评论内容
     */
    private String commentContent;

}