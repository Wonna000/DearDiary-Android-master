package com.baasbox.deardiary;

import android.app.Application;
import android.util.Log;
import com.baasbox.android.*;

import java.util.List;

/**
 * Created by Andrea Tortorella on 24/01/14.
 */
public class DearDiary extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //todo 1.2
        BaasBox.builder(this).setAuthentication(BaasBox.Config.AuthType.SESSION_TOKEN)
                .setApiDomain("178.62.230.137")
                .setPort(9000)
                .setAppCode("3333296999")
                .init();
//        BaasBox.Config config = new BaasBox.Config();
//        config.authenticationType= BaasBox.Config.AuthType.SESSION_TOKEN;
//        config.apiDomain = "192.168.56.1"; // the host address
//        config.httpPort=9000;
//        BaasBox.initDefault(this,config);
    }

}
