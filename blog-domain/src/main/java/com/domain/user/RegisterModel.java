package com.domain.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value = "注册实体类")
public class RegisterModel {
    @ApiModelProperty(value = "邮箱",required = true)
    private String userEmail;

    @ApiModelProperty(value = "密码")
    private String userPassword;
}
