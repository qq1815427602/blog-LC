package com.domain.log;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:  日志实体类
* @Author: 夜空
* @Date: 2020/1/31
*/
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

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public Date getLogCreatetime() {
        return logCreatetime;
    }

    public void setLogCreatetime(Date logCreatetime) {
        this.logCreatetime = logCreatetime;
    }

    public ReLog(Long logId, Long userId, String logInfo, Date logCreatetime) {
        this.logId = logId;
        this.userId = userId;
        this.logInfo = logInfo;
        this.logCreatetime = logCreatetime;
    }

    public ReLog() {
    }
}