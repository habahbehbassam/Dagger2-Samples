package com.example.dagger2sample.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2sample.MyApplication;
import com.example.dagger2sample.R;
import com.example.dagger2sample.di.ApplicationGraph;
import com.example.dagger2sample.di.DaggerApplicationGraph;
import com.example.dagger2sample.di.DaggerCarGraph;
import com.example.dagger2sample.repo.car.Car;
import com.example.dagger2sample.repo.car.turbo.SuperCar;
import com.example.dagger2sample.repo.user.UserLocalDataSource;
import com.example.dagger2sample.repo.user.UserRemoteDataSource;
import com.example.dagger2sample.repo.user.UserRepo;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ApplicationGraph applicationGraph;

    @Inject
    Car car;
    @Inject
    SuperCar superCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUserRepo(); // Manual Dependence injection

        applicationGraph = DaggerApplicationGraph.create();
        setUpUserRepoViaDagger(); // Dagger2 Dependence injection

        // Set up Activity Injection to fill Car filed by activity inject
        DaggerCarGraph.create().inject(this);
        car.drive();
        superCar.drive();

        // Check @Singleton scope
        checkInstanceScope();
    }

    private void checkInstanceScope() {
        Log.i(getClass().getName(), "@Singleton from activity class (activity scope) " +
                " First user repo address =" + applicationGraph.getUserRepo() +
                " Second user repo address =" + applicationGraph.getUserRepo());

        Log.i(getClass().getName(), "@Singleton from MyApplication class (app scope)? " +
                " First user repo address =" + ((MyApplication) getApplication()).getApplicationGraph().getUserRepo()
                + " Second user repo address =" + ((MyApplication) getApplication()).getApplicationGraph().getUserRepo());
    }

    private void setUpUserRepoViaDagger() {
        Log.i(getClass().getName(), "Set Up User Repo With Dagger2 Dependence injection");

        UserRepo userRepo = applicationGraph.getUserRepo();

        userRepo.getUserFromDB();
        userRepo.getUserFromAPI();
    }

    private void setUpUserRepo() {
        Log.i(getClass().getName(), "Set Up User Repo With Manual Dependence injection");

        UserLocalDataSource userLocalDataSource = new UserLocalDataSource();
        UserRemoteDataSource userRemoteDataSource = new UserRemoteDataSource();

        UserRepo userRepo = new UserRepo(userLocalDataSource, userRemoteDataSource);

        userRepo.getUserFromDB();
        userRepo.getUserFromAPI();
    }
}
