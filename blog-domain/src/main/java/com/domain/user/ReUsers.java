package com.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* @Description:  角色实体类
* @Author: 夜空
* @Date: 2020/1/31
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

<<<<<<< HEAD
    /**
     * 用户角色一对多
     */
    private List<ReRoles> rolesList;

=======
    private List<ReRoles> rolesList;
>>>>>>> 4ec7fa918f87ff1144d56661d1db6cd7deeb7cf9
}