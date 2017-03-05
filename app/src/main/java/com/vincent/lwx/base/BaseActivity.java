package com.vincent.lwx.base;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.vincent.lwx.R;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import es.dmoral.toasty.Toasty;
import io.reactivex.Flowable;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/4 21:19
 *
 * @version 1.0
 */

public abstract class BaseActivity extends AppCompatActivity{

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(BaseActivity.this, ContextCompat.getColor(BaseActivity.this, R.color.color_cyan));
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("提示");
        progressDialog.setMessage("操作中..");
        progressDialog.setCancelable(false);
    }

    public void showDialog(){
        if(progressDialog!=null){
            progressDialog.show();
        }
    }

    public void closeDialog(){
        if(progressDialog!=null){
            progressDialog.dismiss();
        }
    }

    /**
     * 消息提醒
     * @param code
     * @param msg
     */
    public void showMsg(int code,String msg){
        if(code == 0){
            //错误消息
           Toasty.error(this,msg, Toast.LENGTH_LONG).show();
        }else{
            //正确消息
            Toasty.success(BaseApplication.getApplication(),msg,Toast.LENGTH_LONG).show();
        }
    }

    public void getSubscriber(){
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
