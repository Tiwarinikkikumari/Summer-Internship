package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class CycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onstart called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onstop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_cycle);
        Log.d("Tag","ondestroy called");
    }
}