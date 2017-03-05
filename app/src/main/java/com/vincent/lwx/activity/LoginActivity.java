package com.vincent.lwx.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.vincent.lwx.R;
import com.vincent.lwx.base.BaseActivity;
import com.vincent.lwx.presenter.LoginPresenter;
import com.vincent.lwx.presenter.controller.LoginController;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 0:36
 *
 * @version 1.0
 */

public class LoginActivity extends BaseActivity implements LoginController.IView {

    @BindView(R.id.login_et_phone)
    TextInputEditText loginEtPhone;
    @BindView(R.id.login_et_password)
    TextInputEditText loginEtPassword;
    @BindView(R.id.login_fab_action)
    FloatingActionButton loginFabAction;
    @BindView(R.id.login_text_create_account)
    TextView loginTextCreateAccount;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        StatusBarUtil.setTranslucent(this, 0);
        presenter = new LoginPresenter(this);
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
    public void msg(int code, String msg) {
        showMsg(code, msg);
    }

    @Override
    public void loginSuccess() {
        MainActivity.actionStart(LoginActivity.this);
        overridePendingTransition(R.anim.activity_start_join, R.anim.activity_close_exit);
        finish();
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }


    @OnClick({R.id.login_fab_action,R.id.login_text_create_account})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_fab_action:
                presenter.login(loginEtPhone.getText().toString().trim(), loginEtPassword.getText().toString().trim());
                break;
            case R.id.login_text_create_account:
                RegisterActivity.actionStart(LoginActivity.this);
                overridePendingTransition(R.anim.activity_start_join,R.anim.activity_close_exit);
                break;
        }

    }
}
