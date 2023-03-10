package com.example.splashproject.model;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.splashproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button1 = findViewById(R.id.button1);
        User user = new User(29,"Jakhangir");
        button1.setOnClickListener(view -> openDetailActivity(user));
    }

    void openDetailActivity(User user){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}