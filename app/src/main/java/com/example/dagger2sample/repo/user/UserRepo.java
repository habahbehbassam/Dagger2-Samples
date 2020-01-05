package com.example.dagger2sample.repo.user;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Bassam Habahbeh on 01/05/2020
 * bassam.h@genie-soft.com
 */
@Singleton
public class UserRepo {

    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    @Inject // Add an @Inject annotation to the UserRepo constructor so Dagger knows how to create a UserRepo instance
    public UserRepo(UserLocalDataSource userLocalDataSource,
                    UserRemoteDataSource userRemoteDataSource) {
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }

    public void getUserFromDB(){
        userLocalDataSource.getUser();
    }

    public void getUserFromAPI(){
        userRemoteDataSource.getUser();
    }
}
