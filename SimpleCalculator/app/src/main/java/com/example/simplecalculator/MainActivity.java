package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText fn,sn;
    TextView ans;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn=(EditText)findViewById(R.id.fn);
        sn=(EditText)findViewById(R.id.sn);
        ans=(TextView)findViewById(R.id.result);
    }
    public void addNo(View v){
        int a,b,c;
        a = Integer.parseInt(fn.getText().toString());
        b = Integer.parseInt(sn.getText().toString());
        c = a + b;
        ans.setText("Ans : " + c );
    }
    public void subNo(View v) {
        int a,b,c;
        a = Integer.parseInt(fn.getText().toString());
        b = Integer.parseInt(sn.getText().toString());
        c = a - b;
        ans.setText("Ans : " + c );
    }
    public void mulNo(View v){
        int a,b,c;
        a = Integer.parseInt(fn.getText().toString());
        b = Integer.parseInt(sn.getText().toString());
        c = a * b;
        ans.setText("Ans : " + c );
    }
    public void divNo(View v) {
        int a,b,c;
        a = Integer.parseInt(fn.getText().toString());
        b = Integer.parseInt(sn.getText().toString());
        c = a / b;
        ans.setText("Ans : " + c );
    }
}