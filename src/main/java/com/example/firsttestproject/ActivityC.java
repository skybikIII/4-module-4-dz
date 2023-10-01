package com.example.firsttestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Button btActAfromC = findViewById(R.id.btActAfromC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        });
        Button btActDfromC = findViewById(R.id.btActDFromC);
        btActDfromC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        Button btclActC = findViewById(R.id.btCloseActC);
        btclActC.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        });

        Button btclstack = findViewById(R.id.btCloseStack);
        btclstack.setOnClickListener(view -> finishAffinity());
    }
}