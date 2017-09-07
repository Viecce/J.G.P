package com.p.g.j.lenovo.jgp.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by cartoon on 2017/9/7.
 * 全局获取Context
 */

public class MyApplication extends Application{
    private static Context context;
    @Override
    public void onCreate(){
        context=getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
