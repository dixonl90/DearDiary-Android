package com.baasbox.deardiary;

import android.app.Application;

import com.baasbox.android.BaasBox;

/**
 * Created by Andrea Tortorella on 24/01/14.
 */
public class DearDiary extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //todo 1.2
        BaasBox.builder(this)
                .setAuthentication(BaasBox.Config.AuthType.SESSION_TOKEN)
                .setApiDomain("192.168.1.73")
                .setPort(9000)
                .setAppCode("1234567890")
                .init();
//        BaasBox.Config config = new BaasBox.Config();
//        config.authenticationType= BaasBox.Config.AuthType.SESSION_TOKEN;
//        config.apiDomain = "192.168.56.1"; // the host address
//        config.httpPort=9000;
//        BaasBox.initDefault(this,config);
    }

}
