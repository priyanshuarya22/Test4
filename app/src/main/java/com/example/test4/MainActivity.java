package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //initialising variables
    EditText et1, et2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating objects
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        b1 = findViewById(R.id.b1);
        //setting listener to submit button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //extracting text from edit text
                String a = et1.getText().toString();
                String b = et2.getText().toString();
                //creating a new intent
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //putting id and password string with intent
                intent.putExtra("a", a);
                intent.putExtra("b", b);
                //launching another activity
                startActivity(intent);
            }
        });
    }
}