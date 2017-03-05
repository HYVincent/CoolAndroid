package com.vincent.lwx.presenter;

import android.text.TextUtils;

import com.vincent.lwx.conf.Result;
import com.vincent.lwx.network.RetrofitUtils;
import com.vincent.lwx.presenter.controller.RegisterController;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 18:55
 *
 * @version 1.0
 */

public class RegisterPresenter implements RegisterController.IPresenter {

    private RegisterController.IView view;

    public RegisterPresenter(RegisterController.IView view) {
        this.view = view;
    }

    @Override
    public void register(String phone, String password) {
        if(TextUtils.isEmpty(phone)){
            view.msg(0,"手机号码不能为空");
            return;
        }
        if(TextUtils.isEmpty(password)){
            view.msg(0,"密码不能为空");
            return;
        }
        view.showDialog();
        Call<Result> call = RetrofitUtils.getApiService().register(phone,password);
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                Result result = response.body();
                if(result.getStatus().equals("1")){
                    view.msg(0,"注册成功");
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
