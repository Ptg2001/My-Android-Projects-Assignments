package com.example.mad_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    TextView t1,t2,t3,t4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        b1=findViewById(R.id.btn_click);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);

    }
    public void btn_click(View v)
    {
        t1.setText(et1.getText().toString());
        t2.setText(et2.getText().toString());
        t3.setText(et3.getText().toString());
        t4.setText(et4.getText().toString());

    }
}