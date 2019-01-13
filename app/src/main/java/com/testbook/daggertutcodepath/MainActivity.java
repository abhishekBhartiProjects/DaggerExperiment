package com.testbook.daggertutcodepath;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Inject @Named("cached") OkHttpClient mOkHttpClient;
    @Inject @Named("non_cached") OkHttpClient mOkHttpClient2;
    @Inject SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getAppComponent().inject(this);
    }
}
