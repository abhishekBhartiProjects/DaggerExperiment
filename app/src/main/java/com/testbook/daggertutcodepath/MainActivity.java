package com.testbook.daggertutcodepath;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Inject OkHttpClient mOkHttpClient;
    @Inject SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getAppComponent().inject(this);
    }
}
