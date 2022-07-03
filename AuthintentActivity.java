package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class AuthintentActivity extends AppCompatActivity {
    TextView intext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authintent);
        intext=findViewById(R.id.intext);
        Intent i= getIntent();
        String username = i.getStringExtra("username");
        String password = i.getStringExtra("password");
        intext.setText("Username:"+username + "\nPassword :" + password);

    }
}