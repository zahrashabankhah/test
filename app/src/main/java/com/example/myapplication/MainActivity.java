package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btn_intent, btn_landScapeState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_intent = findViewById(R.id.btn_intent);
        btn_landScapeState = findViewById(R.id.btn_landScapeState);

        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // intent means decision
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("name","Zahra");
                intent.putExtra("age",27);
                startActivity(intent);
            }
        });

        btn_landScapeState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this,landScapeState.class);
             startActivity(intent);
            }
        });
    }
}