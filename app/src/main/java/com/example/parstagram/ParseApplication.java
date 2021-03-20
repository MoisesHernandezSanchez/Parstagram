package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PqL1zcYbwyHFy3vUMDaAiqfKnEXkRjzsqr0Cub6p")
                .clientKey("qkIs6er8iWJ5ZKa4VGwrGV7gsMOHqtNW329uvvJT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
