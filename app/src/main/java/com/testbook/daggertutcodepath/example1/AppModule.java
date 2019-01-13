package com.testbook.daggertutcodepath.example1;

import android.app.Application;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Inject
    Application providesApplication(){
        return mApplication;
    }
}
