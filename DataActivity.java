package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView datatext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        datatext=findViewById(R.id.datatext);
        String data_output = getIntent().getStringExtra("output_data");
        datatext.setText(data_output);




      //  Intent i = getIntent();
       // String name = i.getStringExtra("username");
        //String password = i.getStringExtra("pass");
        //String mobile = i.getStringExtra("phone");
        //String emailid= i.getStringExtra("email");
        //String hobbies = i.getStringExtra("hobbie");

        //datatext.setText("NAme " +name+ "\n Pass" +password+ "\n Phone" +mobile+"\n emial"+emailid+"\n hobbie"+hobbies );





    }
}