package com.iblogstreet.commlib.util;

/**
 * @author junwang
 * @date 2018/7/20 下午12:42
 * @desc 点击控制
 */
public class ClickUtil {
    private static long lastTime = 0;
    private static long INTERVAL = 500;

    /**
     * 防止重复点击
     *
     * @return
     */
    public static boolean isCanClick() {
        long nowTime = System.currentTimeMillis();
        long delay = nowTime - lastTime;

        if (Math.abs(delay) >= INTERVAL) {
            lastTime = nowTime;
            return true;
        } else {
            return false;
        }
    }
}
