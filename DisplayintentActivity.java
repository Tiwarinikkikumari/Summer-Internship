package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayintentActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayintent);
        textview=findViewById(R.id.textview);
       // Intent i = getIntent();
       // String name = i.getStringExtra("name");
       // textview.setText("welcome" +name);

        Intent i = getIntent();
        String username = i.getStringExtra("username");
        textview.setText("welcome" +username);



    }
}