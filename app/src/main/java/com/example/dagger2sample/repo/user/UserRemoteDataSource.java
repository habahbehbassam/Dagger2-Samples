package com.example.dagger2sample.repo.user;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
public class UserRemoteDataSource {

    @Inject // Add an @Inject annotation to the UserRemoteDataSource constructor so Dagger knows how to create a UserRemoteDataSource instance
    public UserRemoteDataSource(){}

    public void getUser() {
        Log.i(getClass().getName(),"Get User From API Successfully.");
    }
}
