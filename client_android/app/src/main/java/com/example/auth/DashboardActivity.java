package com.example.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        receiver_msg = findViewById(R.id.val_name);


        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        receiver_msg.setText(str);
    }
}