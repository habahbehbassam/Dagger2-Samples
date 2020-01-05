package com.example.dagger2sample.di;

import com.example.dagger2sample.repo.car.turbo.PetrolEngine;
import com.example.dagger2sample.repo.car.turbo.TurboEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract TurboEngine bindEngine(PetrolEngine petrolEngine);
}
