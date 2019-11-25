package com.iblogstreet.commlib.util.log.config;


import com.iblogstreet.commlib.util.log.parser.BundleParse;
import com.iblogstreet.commlib.util.log.parser.CollectionParse;
import com.iblogstreet.commlib.util.log.parser.IntentParse;
import com.iblogstreet.commlib.util.log.parser.MapParse;
import com.iblogstreet.commlib.util.log.parser.Parser;
import com.iblogstreet.commlib.util.log.parser.ReferenceParse;
import com.iblogstreet.commlib.util.log.parser.ThrowableParse;

import java.util.List;

/**
 @author junwang
 @aate 2019-11-25 16:12
 @desc
 **/
public class LogConstant {

    public static final String STRING_OBJECT_NULL = "Object[object is null]";

    /**
     * 每行最大日志长度
     */
    public static final int LINE_MAX = 1024 * 3;

    /**
     * 解析属性最大层级
     */
    public static final int MAX_CHILD_LEVEL = 2;

    public static final int MIN_STACK_OFFSET = 5;

    /**
     * 换行符
     */
    public static final String BR = System.getProperty("line.separator");

    /**
     * 分割线方位
     */
    public static final int DIVIDER_TOP = 1;
    public static final int DIVIDER_BOTTOM = 2;
    public static final int DIVIDER_CENTER = 4;
    public static final int DIVIDER_NORMAL = 3;

    /**
     * 默认支持解析库
     */
    @SuppressWarnings("unchecked")
    public static final Class<? extends Parser>[] DEFAULT_PARSE_CLASS = new Class[]{
            BundleParse.class, IntentParse.class, CollectionParse.class,
            MapParse.class, ThrowableParse.class, ReferenceParse.class
    };

    /**
     * 获取默认解析类
     *
     * @return
     */
    public static List<Parser> getParsers() {
        return LogDefaultConfig.getInstance().getParseList();
    }
}
