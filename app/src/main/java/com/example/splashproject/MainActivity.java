package com.example.splashproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view -> openDetailActivity());
    }

    void openDetailActivity(){
        Intent intent = new Intent(this,DetailActivity.class);
        startActivity(intent);
    }
}