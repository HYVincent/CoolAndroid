package com.vincent.lwx;

import android.content.Intent;
import android.os.Bundle;

import com.li.vincent.guideuser.GuideActivity;
import com.vincent.lwx.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void goGuide(){
        Intent intent = new Intent(MainActivity.this, GuideActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}
