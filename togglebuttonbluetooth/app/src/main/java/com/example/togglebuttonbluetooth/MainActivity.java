package com.example.togglebuttonbluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton ToggleButton = (ToggleButton)findViewById(R.id.toggle);
        ToggleButton.setTextOn("ON");
        ToggleButton.setTextOff("OFF");
    }
    public void ON(View view) {

    }
}