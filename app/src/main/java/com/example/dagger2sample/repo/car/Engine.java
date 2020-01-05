package com.example.dagger2sample.repo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class Engine {

    @Inject
    public Engine() {
    }

    public void start() {
        Log.i(getClass().getName(),"Engine Started");
    }
}
