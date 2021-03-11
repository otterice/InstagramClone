package com.example.instagramclone;

import android.app.Application;
import android.os.Build;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    public static final String APPLICATION_ID_SECRET = BuildConfig.APPLICATION_ID_SECRET;
    public static final String CLIENT_KEY_SECRET = BuildConfig.CLIENT_KEY_SECRET;
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(APPLICATION_ID_SECRET)
                .clientKey(CLIENT_KEY_SECRET)
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
