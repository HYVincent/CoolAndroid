package com.vincent.lwx.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.li.vincent.guideuser.GuideActivity;
import com.vincent.lwx.R;
import com.vincent.lwx.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void actionStart(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }

}
