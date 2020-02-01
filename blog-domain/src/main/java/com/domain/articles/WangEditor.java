package com.domain.articles;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author 夜空
 * @Description: 富文本编辑器数据传输对象工具
 * @Date: 2019年12月23日07:35:20
 */

@Getter
@Setter
@ApiModel(value = "文章编辑器图片上传类")
public class WangEditor {

    @ApiModelProperty(value = "上传状态")
    private Integer errno; //错误代码，0 表示没有错误。

    @ApiModelProperty(value = "已上传的图片路径")
    private String[] data; //已上传的图片路径

    public WangEditor(String[] data) {
        super();
        this.errno = 0;
        this.data = data;
    }

}
