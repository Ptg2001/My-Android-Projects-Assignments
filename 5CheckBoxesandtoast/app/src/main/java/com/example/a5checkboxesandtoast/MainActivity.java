package com.example.a5checkboxesandtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button b;
    StringBuffer sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = new StringBuffer("You Selected");
        b = findViewById(R.id.btn);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (cb1.isChecked()) sb.append("Android");
                if (cb2.isChecked()) sb.append("Python");
                if (cb3.isChecked()) sb.append("PHP");
                if (cb4.isChecked()) sb.append("Java");
                if (cb5.isChecked()) sb.append("C");
                Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_SHORT).show();
            }
        });
    }
}