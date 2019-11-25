package com.iblogstreet.commlib.util.log.parser;


import com.iblogstreet.commlib.util.log.config.LogConstant;

/**
 * @author junwang
 * @date 2019/1/30 下午2:13
 * <p>
 * 解析器接口
 */
public interface Parser<T> {
    String LINE_SEPARATOR = LogConstant.BR;

    Class<T> parseClassType();

    String parseString(T t);
}

