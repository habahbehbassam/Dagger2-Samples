package com.example.dagger2sample.repo.car.turbo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class DieselEngine implements TurboEngine {

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.i(getClass().getName() , "Diesel Engine Started .");
    }
}
