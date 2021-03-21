package com.example.liberty_instagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register the parse models
        ParseObject.registerSubclass(Post.class);
        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8xB0Kr8mjRlBpVSgs84x6n8O7hyz6hxKPMHkQUs7")
                .clientKey("nGknq3Bf3YfyIB5Z7KmPaR4AJOC7EtiVQPMmk64C")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
