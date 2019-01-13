package com.testbook.daggertutcodepath.example1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import com.testbook.daggertutcodepath.R;
import com.testbook.daggertutcodepath.example2.VehicleActivity;

import javax.inject.Inject;
import javax.inject.Named;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Inject @Named("cached") OkHttpClient mOkHttpClient;
    @Inject @Named("non_cached") OkHttpClient mOkHttpClient2;
    @Inject SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getAppComponent().inject(this);

        findViewById(R.id.helloTV).setOnClickListener(this);
        VehicleActivity.start(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.vehicleBT:
                VehicleActivity.start(MainActivity.this);
                break;
        }
    }
}
