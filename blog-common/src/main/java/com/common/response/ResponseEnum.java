package com.common.response;

/**
 * @Author 罗斯基
 * @Description: 响应枚举
 * @Date: Created in 7:41 2019年11月21日07:41:25
 */

public enum ResponseEnum {

    /* 正常访问 */
    SUCCESS(200,"响应成功"),

    /* 服务器错误 */
    SERVER_ERROR(500," 服务器错误"),

    /* 参数错误 10001-19999 */

    //获取参数无效
    PARAMETER_USELESS(10001,"参数无效"),

    //获取参数为空
    PARAMETER_NULL(10002,"参数为空"),

    //获取参数类型不符
    PARAMETER_TYPE_ERROR(10003,"参数类型错误"),

    //获取参数丢失
    PARAMETER_DEFICIENCY(10004,"参数缺失"),

    /* 用户错误：20001-29999 */

    //登录失败
    USER_LOGIN_ERROR(20001,"用户名或者密码错误"),

    //用户无权限
    USER_NO_RIGHT(20002,"用户无权限"),

    //用户不存在
    USER_NO_EXIST(20003,"用户不存在 请您先登录用户 !"),

    //用户已存在
    USER_ALREADY_EXISTS(20004,"用户已存在 请勿重复登录 !"),

    //用户被禁用
    USER_WAS_DISABLED(20005,"用户被禁用 无法登录用户 ！"),

    //用户无Token
    USER_NO_TOKEN(20006,"用户无Token"),

    //用户Token过期
    USER_TOKEN_EXPIRES(20007,"用户Token过期"),

    /* 业务错误：30001-39999 */
    SERVICE_APPEAR_PROBLEM(30001,"业务出现问题"),

    /* 系统错误：40001-49999 */
    SYSTEM_ERROR(40001,"系统繁忙，请稍后重试"),

    /* 数据错误：50001-599999 */

    // 数据未找到
    DATA_NULL(50001,"数据未找到"),

    // 数据有误
    DATA_ERROR(50002,"数据有误"),

    // 数据以存在
    DATA_ALREADY_EXISTS(50003,"数据已存在"),

    // 数据查询出错
    DATA_QUERY_ERROR(50004,"数据查询出错"),

    // 数据类型错误
    DATA_TYPE_ERROR(50005,"数据类型错误"),

    // 数据文件太大
    DATA_FILE_TOO_BIG(50006,"数据文件太大"),

    /* 接口错误：60001-69999 */

    // 内部系统接口错误
    INTERNAL_SYSTEM_INTERFACE_ERROR(60001,"内部系统接口错误"),

    // 外部系统接口错误
    EXTERNAL_SYSTEM_INTERFACE_ERROR(60002,"外部系统接口错误"),

    // 接口禁止访问
    INTERFACE_FORBIDDEN_ACCESS(60003,"接口禁止访问"),

    // 接口地址无效
    INTERFACE_ADDRESS_INVALID(60004,"接口地址无效"),

    // 接口连接超时
    INTERFACE_REQUEST_TIMEOUT(60005,"接口连接超时"),

    // 接口负载过高
    INTERFACE_LOAD_OVERTOP(60006,"接口负载过高"),

    /* 响应错误 70001-79999*/
    RESPONSE_OVERTIME(70001,"响应超时")

    ;

    /* 响应状态码 */
    private final Integer code;

    /* 响应状态信息 */
    private final String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
