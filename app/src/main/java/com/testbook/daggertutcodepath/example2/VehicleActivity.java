package com.testbook.daggertutcodepath.example2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.testbook.daggertutcodepath.R;

import androidx.appcompat.app.AppCompatActivity;

public class VehicleActivity extends AppCompatActivity {

    private Car car;

    public static void start(Activity activity) {
        Intent intent = new Intent(activity, VehicleActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_vehicle);

        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();
    }
}
