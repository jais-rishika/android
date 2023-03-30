package com.example.inventorymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class signupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button button=findViewById(R.id.btn5);
        button.setOnClickListener(v -> {
            Intent iNext= new Intent(signupActivity.this,MainActivity.class);
            startActivity(iNext);
        });
        ImageButton button1=findViewById(R.id.signup);
        button1.setOnClickListener(v -> {
            Intent jNext= new Intent(this,drawerActivity.class);
            startActivity(jNext);
        });
    }
}