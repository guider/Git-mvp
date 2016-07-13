package com.yanyuanquan.android.automvp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by guider on 16/7/13.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class App extends Application {

    private static Context app;
    private static Handler mHandler;

    public static final boolean isDebug = BuildConfig.DEBUG;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        mHandler = new Handler(getMainLooper());
        init();
    }

    private void init() {
//        SP.init(this);

    }

    public static Context getApp() {
        return app;
    }

    public static Handler getHandler() {
        return mHandler;
    }


    private static Activity currentActivity;

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    public static void setCurrentActivity(Activity act) {
        currentActivity = act;
    }
}
