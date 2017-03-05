package com.vincent.lwx.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.vincent.lwx.R;
import com.vincent.lwx.base.BaseActivity;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 21:39
 *
 * @version 1.0
 */

public class ForgetPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }

    /**
     * 密码
     * @param context
     */
    public static void actionStart(Context context){
        Intent intent = new Intent(context,ForgetPasswordActivity.class);
        context.startActivity(intent);
    }
}
