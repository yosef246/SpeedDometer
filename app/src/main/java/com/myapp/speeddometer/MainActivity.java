package com.myapp.speeddometer;


import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.anastr.speedviewlib.ProgressiveGauge;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressiveGauge speedometer = findViewById(R.id.speedView);
        speedometer.speedTo(7500000, 2000);
        speedometer.setUnit("מחיר הדירה");
    }
}