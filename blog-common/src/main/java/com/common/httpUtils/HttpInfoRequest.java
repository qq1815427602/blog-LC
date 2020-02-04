package com.common.httpUtils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * 或取 http 请求中的信息
 */
public class HttpInfoRequest {
    /**
     * 此方法可在 service 层中或取 http 请求中的头部信息
     * @param header header 名
     * @return
     */
    public static String getCurrentHeader(String header){
        HttpServletRequest request;
        try {
            request=((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        }catch (NullPointerException e){
            return null;
        }
        return request.getHeader(header);
    }
}
