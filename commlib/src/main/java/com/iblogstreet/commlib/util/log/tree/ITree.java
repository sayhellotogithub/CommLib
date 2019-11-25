package com.iblogstreet.commlib.util.log.tree;

/**
 * @author junwang
 * @date 2019/1/30 下午2:10
 */
public interface ITree {
    void wtf(String message, Object... args);

    void wtf(Object object);

    void e(String message, Object... args);

    void e(Object object);

    void w(String message, Object... args);

    void w(Object object);

    void d(String message, Object... args);

    void d(Object object);

    void i(String message, Object... args);

    void i(Object object);

    void v(String message, Object... args);

    void v(Object object);

    void json(String json);

    void xml(String xml);
}
