package com.testbook.daggertutcodepath.example1;

import android.app.Application;

import com.testbook.daggertutcodepath.example1.DaggerAppComponent;

public class MyApp extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();

    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
