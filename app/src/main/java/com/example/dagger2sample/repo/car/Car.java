package com.example.dagger2sample.repo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class Car {

    private final Engine engine;
    private final Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        wheels.move();
        Log.i(getClass().getName() , "Car Driving ...");
    }
}
