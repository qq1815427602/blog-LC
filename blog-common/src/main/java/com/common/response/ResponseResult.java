package com.common.response;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 夜空
 * @Description: 响应结果
 * @Date: Created in 14:13 2019年11月21日14:13:50
 */

public final class ResponseResult {

    public ResponseResult() {
    }

    /* layui数据表格渲染 规定格式封装 */
    public static Map<String, Object> layui_data(Object count , Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        resultMap.put("data", data);
        resultMap.put("count",count);
        return resultMap;

        // code 为状态码
        // msg 为提示信息
        // data 为数据
        // count 为数据长度

    }

    /* 成功访问 无参返回 */
    public static Map<String,Object> Access_Success_No_Parameter() {
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        return resultMap;

        //状态码 200
        //响应信息: 响应成功
    }

    /* 成功访问 有参返回 */
    public static Map<String, Object> Access_Success_Have_Parameter(Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", ResponseEnum.SUCCESS.getMsg());
        resultMap.put("data", data);
        return resultMap;

        //状态码 200
        //响应信息: 响应成功
    }

    /* 成功访问 有参返回 自定义信息 */
    public static Map<String, Object> Access_Success_Have_Parameter_Msg(String msg , Object data){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", msg);
        resultMap.put("data", data);
        return resultMap;

        //状态码 200
        //响应信息: 自定义信息
    }

    /* 成功访问 无参返回 返回自定义信息 */
    public static Map<String, Object> Access_Success_No_Parameter_Have_Msg(String msg){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SUCCESS.getCode());
        resultMap.put("msg", msg);
        return resultMap;

        //状态码 200
        //响应信息: 自定义信息
    }

    /* 错误访问 无参返回 */
    public static Map<String, Object> Access_Error_No_Parameter(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SERVER_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.SERVER_ERROR.getMsg());
        return resultMap;

        //状态码: 500
        //返回信息: 服务器错误
    }

    /* 错误访问 有参返回 自定义信息*/
    public static Map<String, Object> Access_Error_Have_Parameter(String msg){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SERVER_ERROR.getCode());
        resultMap.put("msg",msg);
        return resultMap;

        //状态码: 500
        //返回信息: 自定义信息
    }

    /* 错误访问 获取参数无效 */
    public static Map<String, Object> Access_Error_Parameter_Useless(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.PARAMETER_USELESS.getCode());
        resultMap.put("msg", ResponseEnum.PARAMETER_USELESS.getMsg());
        return resultMap;

        //状态码: 10001
        //返回信息: 参数无效
    }

    /* 错误访问 获取参数为空 */
    public static Map<String, Object> Access_Error_Parameter_Null(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.PARAMETER_NULL.getCode());
        resultMap.put("msg", ResponseEnum.PARAMETER_NULL.getMsg());
        return resultMap;

        //状态码: 10002
        //返回信息: 参数为空
    }

    /* 错误访问 获取参数类型不符 */
    public static Map<String, Object> Access_Error_Type_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.PARAMETER_TYPE_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.PARAMETER_TYPE_ERROR.getMsg());
        return resultMap;

        //状态码: 10003
        //返回信息: 参数类型错误
    }

    /* 错误访问 获取参数丢失 */
    public static Map<String, Object> Access_Error_Parameter_Deficiency(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.PARAMETER_DEFICIENCY.getCode());
        resultMap.put("msg", ResponseEnum.PARAMETER_DEFICIENCY.getMsg());
        return resultMap;

        //状态码: 10004
        //返回信息: 参数缺失
    }

    /* 错误访问 登录失败 */
    public static Map<String, Object> Access_Error_User_Login_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_LOGIN_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.USER_LOGIN_ERROR.getMsg());
        return resultMap;

        //状态码: 20001
        //返回信息: 用户名或者密码错误
    }

    /* 错误访问 用户无权限 */
    public static Map<String, Object> Access_Error_User_No_Right(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_NO_RIGHT.getCode());
        resultMap.put("msg", ResponseEnum.USER_NO_RIGHT.getMsg());
        return resultMap;

        //状态码: 20002
        //返回信息: 用户无权限
    }

    /* 错误访问 用户不存在 */
    public static Map<String, Object> Access_Error_User_No_Exist(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_NO_EXIST.getCode());
        resultMap.put("msg", ResponseEnum.USER_NO_EXIST.getMsg());
        return resultMap;

        //状态码: 20003
        //返回信息: 用户不存在
    }

    /* 错误访问 用户已存在 */
    public static Map<String, Object> Access_Error_User_Already_Exists(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_ALREADY_EXISTS.getCode());
        resultMap.put("msg", ResponseEnum.USER_ALREADY_EXISTS.getMsg());
        return resultMap;

        //状态码: 20004
        //返回信息: 用户已存在
    }

    /* 错误访问 用户被禁用 */
    public static Map<String, Object> Access_Error_User_Was_Disabled(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_WAS_DISABLED.getCode());
        resultMap.put("msg", ResponseEnum.USER_WAS_DISABLED.getMsg());
        return resultMap;

        //状态码: 20005
        //返回信息: 用户被禁用
    }

    /* 错误访问 用户无Token */
    public static Map<String, Object> Access_Error_User_No_Token(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_NO_TOKEN.getCode());
        resultMap.put("msg", ResponseEnum.USER_NO_TOKEN.getMsg());
        return resultMap;

        //状态码: 20006
        //返回信息: 用户无Token
    }

    /* 错误访问 用户无Token */
    public static Map<String, Object> Access_Error_User_Token_Expires(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.USER_TOKEN_EXPIRES.getCode());
        resultMap.put("msg", ResponseEnum.USER_TOKEN_EXPIRES.getMsg());
        return resultMap;

        //状态码: 20007
        //返回信息: 用户Token过期
    }

    /* 错误访问 业务错误 */
    public static Map<String, Object> Access_Error_Service_Appear_Problem(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SERVICE_APPEAR_PROBLEM.getCode());
        resultMap.put("msg", ResponseEnum.SERVICE_APPEAR_PROBLEM.getMsg());
        return resultMap;

        //状态码: 30001
        //返回信息: 业务出现问题
    }

    /* 错误访问 系统错误 */
    public static Map<String, Object> Access_Error_System_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.SYSTEM_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.SYSTEM_ERROR.getMsg());
        return resultMap;

        //状态码: 40001
        //返回信息: 系统错误
    }

    /* 错误访问 数据未找到 */
    public static Map<String, Object> Access_Error_Data_Null(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_NULL.getCode());
        resultMap.put("msg", ResponseEnum.DATA_NULL.getMsg());
        return resultMap;

        //状态码: 50001
        //返回信息: 数据未找到
    }

    /* 错误访问 数据错误 */
    public static Map<String, Object> Access_Error_Data_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.DATA_ERROR.getMsg());
        return resultMap;

        //状态码: 50002
        //返回信息: 数据有误
    }

    /* 错误访问 数据已存在 */
    public static Map<String, Object> Access_Error_Data_Already_Exists(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_ALREADY_EXISTS.getCode());
        resultMap.put("msg", ResponseEnum.DATA_ALREADY_EXISTS.getMsg());
        return resultMap;

        //状态码: 50003
        //返回信息: 数据已存在
    }

    /* 错误访问 数据查询出错 */
    public static Map<String, Object> Access_Error_Data_Query_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_QUERY_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.DATA_QUERY_ERROR.getMsg());
        return resultMap;

        //状态码: 50004
        //返回信息: 数据查询出错
    }

    /* 错误访问 数据类型错误 */
    public static Map<String, Object> Access_Error_Data_Type_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_TYPE_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.DATA_TYPE_ERROR.getMsg());
        return resultMap;

        //状态码: 50005
        //返回信息: 数据类型错误
    }

    /* 错误访问 数据文件太大 */
    public static Map<String, Object> Access_Error_Data_File_Too_Big(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.DATA_FILE_TOO_BIG.getCode());
        resultMap.put("msg", ResponseEnum.DATA_FILE_TOO_BIG.getMsg());
        return resultMap;

        //状态码: 50006
        //返回信息: 数据文件太大
    }

    /* 错误访问 内部系统接口错误 */
    public static Map<String, Object> Access_Error_Internal_System_Interface_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.INTERNAL_SYSTEM_INTERFACE_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.INTERNAL_SYSTEM_INTERFACE_ERROR.getMsg());
        return resultMap;

        //状态码: 60001
        //返回信息: 内部系统接口错误
    }

    /* 错误访问 外部系统接口错误 */
    public static Map<String, Object> Access_Error_External_System_Interface_Error(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.EXTERNAL_SYSTEM_INTERFACE_ERROR.getCode());
        resultMap.put("msg", ResponseEnum.EXTERNAL_SYSTEM_INTERFACE_ERROR.getMsg());
        return resultMap;

        //状态码: 60002
        //返回信息: 外部系统接口错误
    }

    /* 错误访问 接口禁止访问 */
    public static Map<String, Object> Access_Error_Interface_Forbidden_Access(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.INTERFACE_FORBIDDEN_ACCESS.getCode());
        resultMap.put("msg", ResponseEnum.INTERFACE_FORBIDDEN_ACCESS.getMsg());
        return resultMap;

        //状态码: 60003
        //返回信息: 接口禁止访问
    }

    /* 错误访问 接口地址无效 */
    public static Map<String, Object> Access_Error_Interface_Address_Invalid(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.INTERFACE_ADDRESS_INVALID.getCode());
        resultMap.put("msg", ResponseEnum.INTERFACE_ADDRESS_INVALID.getMsg());
        return resultMap;

        //状态码: 60004
        //返回信息: 接口地址无效
    }

    /* 错误访问 接口连接超时 */
    public static Map<String, Object> Access_Error_Interface_Request_Timeout(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.INTERFACE_REQUEST_TIMEOUT.getCode());
        resultMap.put("msg", ResponseEnum.INTERFACE_REQUEST_TIMEOUT.getMsg());
        return resultMap;

        //状态码: 60005
        //返回信息: 接口连接超时
    }

    /* 错误访问 接口负载过高 */
    public static Map<String, Object> Access_Error_Interface_Load_Overtop(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.INTERFACE_LOAD_OVERTOP.getCode());
        resultMap.put("msg", ResponseEnum.INTERFACE_LOAD_OVERTOP.getMsg());
        return resultMap;

        //状态码: 60006
        //返回信息: 接口负载过高
    }

    /* 错误访问 响应超时 */
    public static Map<String, Object> Access_Error_Response_Overtime(){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        resultMap.put("code", ResponseEnum.RESPONSE_OVERTIME.getCode());
        resultMap.put("msg", ResponseEnum.RESPONSE_OVERTIME.getMsg());
        return resultMap;

        //状态码: 70001
        //返回信息: 响应超时
    }
}
