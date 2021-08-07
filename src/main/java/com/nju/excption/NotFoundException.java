package com.nju.excption;

import org.springframework.http.HttpStatus;

/**
 * @author maw-b
 * @date 2021/6/21 16:59
 */
public class NotFoundException extends BaseException {

    public NotFoundException(Integer code, String message) {
        super(code, message);
    }

    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND.value(),message);
    }

    /**
     * @return http状态码.
     */
    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
