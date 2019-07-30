package com.example.fragmentdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        bottomNavigationView = findViewById(R.id.nav_bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.nav_cat: {
                                CategoryFragment categoryFragment = new CategoryFragment();
                                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                                fragmentTransaction.replace(R.id.container, categoryFragment);
                                fragmentTransaction.commit();
                                break;
                            }
                            case R.id.nav_place: {
                                PlaceFragment placeFragment = new PlaceFragment();
                                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                                fragmentTransaction.replace(R.id.container, placeFragment);
                                break;
                            }
                            case R.id.nav_contact: {
                                break;
                            }
                            case R.id.nav_promotion: {
                                break;
                            }
                        }


                        return false;
                    }
                });
    }

}
