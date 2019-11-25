package com.iblogstreet.commonlib

import android.app.Application
import com.iblogstreet.commlib.util.AppUtil
import com.iblogstreet.commlib.util.log.Loger
import com.iblogstreet.commlib.util.log.tree.LogcatTree

/**
 * @author junwang
 * @date 2019-11-25 16:21
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (AppUtil.isMainProcess(packageName)) {
            Loger.getLogConfig()
                //是否输出日志
                .configAllowLog(BuildConfig.DEBUG)
                //是否排版显示
                .configShowBorders(false)
            //添加打印日志信息到Logcat的树
            Loger.plant(LogcatTree())
        }

    }

}