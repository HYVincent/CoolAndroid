package com.vincent.lwx.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.vincent.lwx.R;
import com.vincent.lwx.base.BaseActivity;
import com.vincent.lwx.presenter.RegisterPresenter;
import com.vincent.lwx.presenter.controller.RegisterController;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 0:37
 *
 * @version 1.0
 */

public class RegisterActivity extends BaseActivity implements RegisterController.IView{

    private RegisterPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        presenter = new RegisterPresenter(this);

    }

    private void register(String phone,String password){
        presenter.register(phone,password);
    }


    @Override
    public void showDialog() {
        super.showDialog();
    }

    @Override
    public void closeDialog() {
        super.closeDialog();
    }

    @Override
    public void msg(int code,String msg) {
        showMsg(code,msg);
    }

    @Override
    public void registerSuccess() {
        LoginActivity.actionStart(RegisterActivity.this);
        overridePendingTransition(R.anim.activity_start_join,R.anim.activity_close_exit);
        finish();
    }

    public static void actionStart(Context context){
        Intent intent = new Intent(context,RegisterActivity.class);
        context.startActivity(intent);
    }
}
