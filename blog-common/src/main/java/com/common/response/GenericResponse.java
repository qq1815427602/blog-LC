package com.common.response;

import cn.hutool.json.JSONUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

/**
 * api 接口的基础返回类
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "返回说明")
public class GenericResponse {
    @ApiModelProperty(value = "返回状态码")
    private int code;
    @ApiModelProperty("描述信息")
    private String message;
    @ApiModelProperty("返回数据")
    private Object data;

    @Override
    public String toString(){
        if (Objects.isNull(this.data)){
            this.setData(new Object());
        }
        return JSONUtil.parse(this).toString();//JSON.toJSONString(this);
    }
}
