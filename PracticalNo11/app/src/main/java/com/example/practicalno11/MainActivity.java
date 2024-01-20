package com.example.practicalno11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox JCB1,JCB2,JCB3,JCB4,JCB5;
    TextView JTX1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JCB1=findViewById(R.id.CB1);
        JCB2=findViewById(R.id.CB2);
        JCB3=findViewById(R.id.CB3);
        JCB4=findViewById(R.id.CB4);
        JCB5=findViewById(R.id.CB5);
        JTX1=findViewById(R.id.TX1);

        JCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    Toast.makeText(MainActivity.this,"Databse Mangement Has beeen Selected",Toast.LENGTH_LONG).show();
                    JTX1.setText("Your Response Has Been Recorded");
                }
                else {}
            }
        });
        JCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    Toast.makeText(MainActivity.this,"Client Side Scripting Has beeen Selected",Toast.LENGTH_LONG).show();
                    JTX1.setText("Your Response Has Been Recorded.");
                }
                else {}
            }
        });
        JCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    Toast.makeText(MainActivity.this,"Advanced Computer Network Has beeen Selected",Toast.LENGTH_LONG).show();
                    JTX1.setText("Your Response Has Been Recorded.");
                }
                else {}
            }
        });
        JCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    Toast.makeText(MainActivity.this,"Cloud Computing Has beeen Selected",Toast.LENGTH_LONG).show();
                    JTX1.setText("Your Response Has Been Recorded.");
                }
                else {}
            }
        });
        JCB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    Toast.makeText(MainActivity.this,"Emerging trend Has beeen Selected",Toast.LENGTH_LONG).show();
                    JTX1.setText("Your Response Has Been Recorded.");
                }
                else {}
            }
        });



    }
}