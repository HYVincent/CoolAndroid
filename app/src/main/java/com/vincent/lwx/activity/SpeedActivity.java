package com.vincent.lwx.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;

import com.jaeger.library.StatusBarUtil;
import com.vincent.lwx.R;
import com.vincent.lwx.base.BaseActivity;

/**
 * description ： 此页面是用来解决App启动白屏的
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 0:39
 *
 * @version 1.0
 */

public class SpeedActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WelcomeActivity.actionStart(this);
        finish();
    }
}
