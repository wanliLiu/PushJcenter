package com.soli.libtwo;

import com.facebook.common.logging.FLog;
import com.facebook.common.logging.LoggingDelegate;
import com.soli.libone.test.DontObfuscateInterface;
import com.soli.libone.test.TestOne;

/**
 * @author Soli
 * @Time 2018/1/11
 */
public class FromLibTwo implements DontObfuscateInterface {

    private TestOne one;

    public FromLibTwo() {
        FLog.setLoggingDelegate(new LoggingDelegate() {
            @Override
            public void setMinimumLoggingLevel(int level) {

            }

            @Override
            public int getMinimumLoggingLevel() {
                return 0;
            }

            @Override
            public boolean isLoggable(int level) {
                return true;
            }

            @Override
            public void v(String tag, String msg) {

            }

            @Override
            public void v(String tag, String msg, Throwable tr) {

            }

            @Override
            public void d(String tag, String msg) {

            }

            @Override
            public void d(String tag, String msg, Throwable tr) {

            }

            @Override
            public void i(String tag, String msg) {

            }

            @Override
            public void i(String tag, String msg, Throwable tr) {

            }

            @Override
            public void w(String tag, String msg) {

            }

            @Override
            public void w(String tag, String msg, Throwable tr) {

            }

            @Override
            public void e(String tag, String msg) {

            }

            @Override
            public void e(String tag, String msg, Throwable tr) {

            }

            @Override
            public void wtf(String tag, String msg) {

            }

            @Override
            public void wtf(String tag, String msg, Throwable tr) {

            }

            @Override
            public void log(int priority, String tag, String msg) {

            }
        });
        FLog.d("FromLibTwo", "FromLibTwo");

        sdklsd_dsdl();
    }

    /**
     * 我是测试环境的登录但是看到了
     */
    private void tesd() {
        new Tes().thislsTest();
    }

    /**
     * 有事一个上刊登了斯柯达了SDK
     */
    private void sdklsd_dsdl() {
        tesd();
    }
}
