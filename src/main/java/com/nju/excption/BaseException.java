package com.nju.excption;

import com.nju.excption.code.ErrorCode;
import com.nju.excption.vo.ErrorResponseVo;
import org.springframework.http.HttpStatus;

/**
 * @author maw-b
 * @date 2021/6/21 16:59
 */
public class BaseException extends RuntimeException {

    /**
     * 序列化版本号.
     */
    private static final long serialVersionUID = 1L;

    private final Integer code;

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(String message){
        super(message);
        code = ErrorCode.FAILURE;
    }

    public BaseException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    /**
     * @return http状态码.
     */
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    /**
     * @return 错误响应vo
     */
    public ErrorResponseVo getErrorResponseVo() {
        return new ErrorResponseVo(code, this.getMessage());
    }

    public Integer getCode() {
        return code;
    }

}
