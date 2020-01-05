package com.example.dagger2sample.di;

import com.example.dagger2sample.repo.car.Engine;
import com.example.dagger2sample.repo.car.turbo.DieselEngine;
import com.example.dagger2sample.repo.car.turbo.TurboEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
@Module
public abstract class DieselEngineModule {

    @Binds
    public abstract TurboEngine bindEngine(DieselEngine dieselEngine);
}
