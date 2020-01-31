package com.domain.log;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  日志实体类
* @Author: 夜空
* @Date: 2020/1/31
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReLog implements Serializable {
    /**
     * 日志编号
     */
    private Long logId;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 日志说明
     */
    private String logInfo;

    /**
     * 创建时间
     */
    private Date logCreatetime;

}