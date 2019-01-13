package com.testbook.daggertutcodepath.example2;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    Engine engine;
    Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive(){
        Log.e(TAG, "driving");
    }
}
