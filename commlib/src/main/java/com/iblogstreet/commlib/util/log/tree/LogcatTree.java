package com.iblogstreet.commlib.util.log.tree;

import android.util.Log;

/**
 * @author junwang
 * @date 2019/1/30 下午2:26
 * <p>
 * Logcat树-输出日志信息到Logcat
 */
public class LogcatTree extends Tree {
    @Override
    protected void log(int type, String tag, String message) {
        switch (type) {
            case Log.VERBOSE:
                Log.v(tag, message);
                break;
            case Log.INFO:
                Log.i(tag, message);
                break;
            case Log.DEBUG:
                Log.d(tag, message);
                break;
            case Log.WARN:
                Log.w(tag, message);
                break;
            case Log.ERROR:
                Log.e(tag, message);
                break;
            case Log.ASSERT:
                Log.wtf(tag, message);
                break;
            default:
                break;
        }
    }
}
