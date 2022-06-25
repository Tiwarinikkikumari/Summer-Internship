package com.example.myapplication;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    Button add;
    EditText one, two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 , num2;
                num1 = one.getText().toString();
                 num2 = two.getText().toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                int sum = a + b;
                Toast.makeText(AddActivity.this, "sum is :"+sum, LENGTH_SHORT).show();

            }
        });

    }
}
