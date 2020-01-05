package com.example.dagger2sample.di;

import com.example.dagger2sample.repo.user.UserRepo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */

@Singleton
@Component  //use @Component to  make Dagger create a graph of the dependencies in your project that
            // it can use to find out where it should get those dependencies when they are needed
public interface ApplicationGraph {

    UserRepo getUserRepo();
}
