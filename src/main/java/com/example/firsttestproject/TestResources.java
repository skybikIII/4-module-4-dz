package com.example.firsttestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestResources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_resources);
        setTitle("Профиль пользователя @boris");
    }
}