package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthenticationActivity extends AppCompatActivity {

    Button authbtn;
    EditText authedit;
    EditText authedit1;
    String user = "admin";
    String pass = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        authbtn=findViewById(R.id.authbtn);
        authedit = findViewById(R.id.authedit);
        authedit1=findViewById(R.id.authedit1);


        authbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(authedit.getText().toString())) {
                    TextUtils.isEmpty(authedit1.getText().toString());
                    Toast.makeText(AuthenticationActivity.this, "Please enter username and pass ", Toast.LENGTH_SHORT).show();

                }
                else if(authedit.getText().toString().equals(user)) {
                    if( authedit1.getText().toString().equals(pass))
                    {
                        //Toast.makeText(AuthenticationActivity.this, "Sucessfful Login", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(AuthenticationActivity.this,AuthintentActivity.class );
                        i.putExtra("username", user);
                        i.putExtra("password",pass);
                        startActivity(i);
                }
                    else{

                        Toast.makeText(AuthenticationActivity.this, "Invalid username or Password",Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(AuthenticationActivity.this,DisplayintentActivity.class );
                        i.putExtra("username", user);
                        startActivity(i);

                    }



                }
                else{
                    Toast.makeText(AuthenticationActivity.this, "Invalid username or Password",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}