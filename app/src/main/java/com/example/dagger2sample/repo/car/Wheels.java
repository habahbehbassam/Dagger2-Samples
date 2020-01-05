package com.example.dagger2sample.repo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class Wheels {
    // Assume we don't own this class so we can't access this class constructor

    public void move() {
        Log.i(getClass().getName(),"wheel moving");
    }
}
