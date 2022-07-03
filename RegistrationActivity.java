package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegistrationActivity extends AppCompatActivity {

    EditText regedit;
    EditText regedit1;
    EditText regedit2;
    EditText regedit3;
    EditText regedit4;
    Button regbtn;
    RadioButton regrd1;
    RadioButton regrd2;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regedit = findViewById(R.id.regedit);
        regedit1= findViewById(R.id.regedit1);
        regedit2= findViewById(R.id.regedit2);
        regedit3= findViewById(R.id.regedit3);
        regedit4= findViewById(R.id.regedit4);
        regbtn= findViewById(R.id.regbtn);
        regrd1=findViewById(R.id.regrd1);
        regrd2=findViewById(R.id.regrd2);
        rg=findViewById(R.id.rg);



        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder output = new StringBuilder();

               output.append("username:"+regedit.getText().toString());
                output.append("\npassword:"+ regedit1.getText().toString());
                output.append( "\nemail:" +regedit2.getText().toString());
                output.append( "\nphone:"+regedit3.getText().toString());
                output.append( "\nhobbie:"+regedit4.getText().toString());
                int checked = rg.getCheckedRadioButtonId();
                if(checked== R.id.regrd1)
                {
                    output.append("gender : male \n");
                }
                else
                {
                    output.append("gender : Female \n");
                }



                Intent i = new Intent(RegistrationActivity.this,DataActivity.class);
                i.putExtra("output_data",output.toString());
                startActivity(i);





            }
        });

    }
}