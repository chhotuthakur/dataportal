package com.bluewaters.testdataportal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.bluewaters.testdataportal.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startI = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(startI);
                finish();
            }
        },3000);
    }
}