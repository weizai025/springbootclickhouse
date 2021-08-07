package com.nju.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author maw-b
 * @date 2021/6/6 18:03
 */
public interface BaseTkMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
