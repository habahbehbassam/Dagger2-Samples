package com.example.dagger2sample.repo.car.turbo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class SuperCar {

    private final TurboEngine engine;

    @Inject
    public SuperCar(TurboEngine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        Log.i(getClass().getName() , "Super Car Driving ...");
    }
}
