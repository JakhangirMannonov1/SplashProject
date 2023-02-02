package com.example.splashproject.model;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.splashproject.R;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initViews();

    }

    void initViews(){
        TextView tv_detail = findViewById(R.id.tv_detail);
        User user=(User) getIntent().getSerializableExtra("user");
        tv_detail.setText(user.toString());
    }
}
