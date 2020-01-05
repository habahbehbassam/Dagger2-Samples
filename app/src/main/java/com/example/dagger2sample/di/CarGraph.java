package com.example.dagger2sample.di;

import com.example.dagger2sample.activities.MainActivity;

import dagger.Component;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */

@Component(modules = {WheelsModule.class , DieselEngineModule.class})
public interface CarGraph {

    void inject(MainActivity mainActivity); // used to inject filed
}
