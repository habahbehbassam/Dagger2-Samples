package com.example.dagger2sample.di;

import com.example.dagger2sample.repo.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
@Module
public class WheelsModule {

    @Provides
    Wheels getWheels(){
        return new Wheels();
    }
}
