package com.example.dagger2sample;

import android.app.Application;

import com.example.dagger2sample.di.ApplicationGraph;
import com.example.dagger2sample.di.DaggerApplicationGraph;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class MyApplication extends Application {

    private ApplicationGraph applicationGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationGraph = DaggerApplicationGraph.create();
    }

    public ApplicationGraph getApplicationGraph() {
        return applicationGraph;
    }
}
