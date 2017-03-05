package com.vincent.lwx.presenter;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;

import com.vincent.lwx.base.BaseApplication;
import com.vincent.lwx.conf.Result;
import com.vincent.lwx.network.RetrofitUtils;
import com.vincent.lwx.presenter.controller.LoginController;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.Consumer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 0:35
 *
 * @version 1.0
 */

public class LoginPresenter implements LoginController.IPresenter{

    private LoginController.IView view;

    public LoginPresenter(LoginController.IView view){
        this.view = view;
    }

    @Override
    public void login(final String phone, final String password) {
        if(TextUtils.isEmpty(phone)){
            view.msg(0,"手机号码不能为空");
            return;
        }
        if(TextUtils.isEmpty(password)){
            view.msg(0,"密码不能为空");
            return;
        }
        view.showDialog();
        Call<Result> call = RetrofitUtils.getApiService().login(phone,password);
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();
                if(result.getStatus().equals("1")){
//                    BaseApplication.user = JSON

                    view.msg(1,"登录成功");
                    view.loginSuccess();
                }else {
                    view.msg(0,result.getMsg());
                }
                view.closeDialog();
            }
            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                view.msg(0,"请求错误");
                view.closeDialog();
            }
        });
    }
}
