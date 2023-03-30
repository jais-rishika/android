package com.example.inventorymanagement;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

@SuppressLint("CustomSplashScreen")
public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2*1000);
    }
}