package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
   // TextView txt;
   // EditText edt;
    Button btn;
    CheckBox cb1,cb2,cb3;
    RadioButton rd1,rd2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn = findViewById(R.id.btn);
      //  edt=findViewById(R.id.edt1);
      //  txt=findViewById(R.id.txt1);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = "checked";
                if(cb1.isChecked()){
                   ans+= " \n java";
                }
                if(cb2.isChecked()){
                    ans+= " \n php";
                }
                if(cb3.isChecked()){
                    ans+= " \n android";
                }

                Toast.makeText(MainActivity.this, ans, Toast.LENGTH_SHORT).show();


                String result = "checked";
                if(rd1.isChecked()){
                    result+= " \n male";
                }
                if(rd2.isChecked()) {
                    result+= " \n female";
                }


                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();




            }


        });

    }
}
