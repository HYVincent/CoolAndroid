package com.vincent.lwx.presenter.controller;

import com.vincent.lwx.base.BaseController;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/5 0:11
 *
 * @version 1.0
 */

public interface LoginController{

    interface IView extends BaseController.IView{
        /**
         * 登录成功
         */
        void loginSuccess();
    }

    interface IPresenter{

        /**
         * 登录的逻辑实现
         * @param phone
         * @param password
         */
        void login(String phone,String password);
    }

}
