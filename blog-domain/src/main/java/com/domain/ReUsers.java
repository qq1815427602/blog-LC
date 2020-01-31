package com.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * re_users
 * @author 
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReUsers implements Serializable {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户IP
     */
    private String userIp;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userProfilePhoto;

    /**
     * 注册时间
     */
    private Date userRegistrationTime;

    /**
     * 用户生日
     */
    private Date userBirthday;

    /**
     * 用户年龄
     */
    private Byte userAge;

    /**
     * 用户手机号
     */
    private Integer userTelephoneNumber;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 用户微信ID标识
     */
    private String userWechatId;

    /**
     * 状态 1:正常 2:冻结
     */
    private Integer userState;

    /**
     * 一对多角色
     */
    private List<ReRole> rolesList;
}