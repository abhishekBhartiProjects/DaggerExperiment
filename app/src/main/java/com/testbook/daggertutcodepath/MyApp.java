package com.testbook.daggertutcodepath;

import android.app.Application;

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
