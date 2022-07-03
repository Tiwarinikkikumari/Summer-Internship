package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentexampleActivity extends AppCompatActivity {
    Button but1;
    EditText editable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentexample);
        but1=findViewById(R.id.but1);
        editable=findViewById(R.id.ediitable);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editable.getText().toString();
                Intent i = new Intent(IntentexampleActivity.this, DisplayintentActivity.class);
                        i.putExtra("name" ,name);
                startActivity(i);
            }
        });
    }
}