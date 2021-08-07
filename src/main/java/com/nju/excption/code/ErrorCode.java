package com.nju.excption.code;

/**
 * 业务错误code,错误码6位说明：
 * 第一位是项目类型：1：微服务，2：fe，3：聚合服务，
 * 第二位和第三位是项目序号（聚合服务不写自己的序号，写核心业务的项目序号），
 * 后三位，前100为预留通用错误码
 * 101开始为自定义错误码
 *
 * @author maw-b
 * @date 2021/6/23 10:46
 */
public class ErrorCode {

    private ErrorCode() {
    }

    /**
     * 默认错误.
     */
    public static final int FAILURE = 1;
    /**
     * 参数错误.
     */
    public static final int INVALID_PARAMETER = 2;
}
