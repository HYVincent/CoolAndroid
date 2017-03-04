package com.vincent.julie;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * description ：
 * project name：CoolApp
 * author : Vincent
 * creation date: 2017/3/3 18:11
 *
 * @version 1.0
 */

public class NettyPushService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
