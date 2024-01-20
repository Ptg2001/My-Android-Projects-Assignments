package com.example.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar PrgBar;
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrgBar = findViewById(R.id.progressBar);
        btn = findViewById(R.id.xmlBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                PrgBar.setVisibility(View.VISIBLE);
            }
        });
    }
}