package com.nju.excption.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author maw-b
 * @date 2021/6/23 10:51
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseVo {

    private Integer code;

    private String msg;

    /**
     * 转换map.
     */
    public Map<String, Object> convertMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", this.code);
        map.put("msg", this.msg);
        return map;
    }
}
