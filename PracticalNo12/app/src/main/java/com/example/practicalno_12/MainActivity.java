package com.example.practicalno_12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.practicalno_12.R;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton dr2,r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.b1);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg1 = (RadioGroup) findViewById(R.id.rg1);
                int id=rg1.getCheckedRadioButtonId();
                dr2=(RadioButton) findViewById(id);
                Toast.makeText(MainActivity.this,dr2.getText()+" is selected !",Toast.LENGTH_SHORT).show();

                if (r1.isChecked()){
                    Toast.makeText(MainActivity.this,r1.getText()+" is selected !",Toast.LENGTH_SHORT).show();
                }
                if(r2.isChecked()){
                    Toast.makeText(MainActivity.this, r2.getText()+"is selected !", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}