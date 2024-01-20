package com.example.practical7_2;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,div,phone,roll,DOb;
    Button Sub,res;
    TextView Rname,Rphone,Rroll,RDob,Rdiv;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.reset);
        name=findViewById(R.id.namehint);
        div=findViewById(R.id.Divisionhint);
        phone=findViewById(R.id.phonehint);
        roll=findViewById(R.id.Rollhint);
        DOb=findViewById(R.id.Dobhint);
        Sub=findViewById(R.id.Submitbutton);
        Rname=findViewById(R.id.ReviewName);
        Rphone=findViewById(R.id.Reviewphone);
        Rroll=findViewById(R.id.ReviewRoll);
        RDob=findViewById(R.id.ReviewDob);
        Rdiv=findViewById(R.id.ReviewDiv);

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rname.setText(name.getText());
                Rdiv.setText(div.getText());
                Rphone.setText(phone.getText());
                Rroll.setText(roll.getText());
                RDob.setText(DOb.getText());

            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rname.setText("");
                Rdiv.setText("");
                Rphone.setText("");
                Rroll.setText("");
                RDob.setText("");

            }
        });



    }
}