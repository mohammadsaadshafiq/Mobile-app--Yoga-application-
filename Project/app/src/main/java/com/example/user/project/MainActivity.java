 package com.example.user.project;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.user.project.accountactivity.signup_activity;

 public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,
                "Welcome", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, signup_activity.class);
                startActivity(i);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
