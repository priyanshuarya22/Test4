package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.a2_tv1);
        Intent intent = this.getIntent();
        String a = intent.getStringExtra("a");
        String b = intent.getStringExtra("b");
        tv1.setText("Welcome " + a + ", your Password is " + b);
    }
}