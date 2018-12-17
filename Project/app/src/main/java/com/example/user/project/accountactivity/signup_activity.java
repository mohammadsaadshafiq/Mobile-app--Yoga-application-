package com.example.user.project.accountactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.user.project.R;


public class signup_activity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.numbers,android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
    }
}
