package com.nju.excption.handler;

import com.nju.excption.BaseException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

/**
 * @author maw-b
 * @date 2021/6/21 19:25
 */
@ControllerAdvice
public class ExceptionHandler {

    /**
     * 请求绑定：ErrorResponseVo.
     */
    protected static final String REQUEST_ATTR_ERROR_VO = "errorResponseVo";

    /**
     * 重定向/error
     */
    protected static final String FORWARD_ERROR = "forward:/error";

    /**
     * 自定义业务异常处理.
     *
     * @param e 异常
     * @param request 请求
     * @return 异常跳转路径
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(BaseException.class)
    public String handlerBaseException(BaseException e, HttpServletRequest request) {
        // 设置错误状态码，一定要设置，否者就不会进入到自定义页面中
        request.setAttribute(RequestDispatcher.ERROR_STATUS_CODE, e.getHttpStatus().value());
        // 设置错误响应vo
        request.setAttribute(REQUEST_ATTR_ERROR_VO, e.getErrorResponseVo());
        // 转发到/error
        return FORWARD_ERROR;
    }
}
