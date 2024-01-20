package com.example.practicalno13_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View PrgBar = findViewById(R.id.progressBar);
        Button btn = findViewById(R.id.xmlBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                PrgBar.setVisibility(View.VISIBLE);
            }
        });
    } }