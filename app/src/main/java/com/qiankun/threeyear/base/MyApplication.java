package com.qiankun.threeyear.base;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Administrator on 2017/8/28.
 */

public class MyApplication extends Application {
    public static Context AppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();
        Utils.init(this);
    }


}
