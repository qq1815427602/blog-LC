package com.common.response;


import java.util.HashMap;
import java.util.Map;

/**
 * 返回客户端格式
 */
public class ResponseFormat {
    private static Map<Integer,String> messageMap= new HashMap<>();
    //初始化状态码与文字说明
    static {
        messageMap.put(200, "成功");
        messageMap.put(401, "用户未登录或者账号密码错误");
        messageMap.put(403, "无权限访问");
        messageMap.put(404,"没有找到");
        messageMap.put(500,"服务器错误");

        messageMap.put(10001,"账号已存在");
    }

    public static GenericResponse retParam(Integer status,Object data){
        return new GenericResponse(status,messageMap.get(status),data);
    }
}
