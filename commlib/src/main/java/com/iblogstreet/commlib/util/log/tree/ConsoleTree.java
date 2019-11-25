package com.iblogstreet.commlib.util.log.tree;

/**
 * @author junwang
 * @date 2019/1/30 下午2:25
 * <p>
 * 系统打印树-输出日志信息到控制台
 */
public class ConsoleTree extends Tree {
    @Override
    protected void log(int type, String tag, String message) {
        System.out.println(tag + "\t" + message);
    }
}
