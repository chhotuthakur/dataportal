package com.bluewaters.testdataportal.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.bluewaters.testdataportal.R;
import com.bluewaters.testdataportal.fragments.AccountFragment;
import com.bluewaters.testdataportal.fragments.HomeFragment;
import com.bluewaters.testdataportal.fragments.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

BottomNavigationView bottomNavigationView;
Fragment fragment;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView  = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item ) {
                Fragment fragmentload = null;
                switch (item.getItemId()){
                    case R.id.btm_home:
                        fragmentload= new HomeFragment();
                        break;
                    case R.id.btm_acc:
                        fragmentload = new AccountFragment();
                        break;
                    case R.id.btm_list:
                        fragmentload = new ListFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragmentload).commit();
                return true;
            }
        });



    }
}