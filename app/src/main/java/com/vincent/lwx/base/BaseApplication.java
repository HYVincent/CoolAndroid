package com.vincent.lwx.base;

import android.app.Application;

import com.vincent.lwx.conf.Config;
import com.vincent.lwx.utils.SharePreferencesUtils;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/4 22:58
 *
 * @version 1.0
 */

public class BaseApplication extends Application {

    private static  BaseApplication application;
    private static SharePreferencesUtils shared;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    /**
     * 获取一个可编辑的Sharepreferences.edit对象
     * @return
     */
    public static SharePreferencesUtils getShared(){
        if(shared == null){
            shared = new SharePreferencesUtils(getApplication(), Config.CONFIG_NAME);
        }
        return shared;
    }

    /**
     * 获取全局的Application对象
     * @return
     */
    public static BaseApplication getApplication() {
        return application;
    }
}
