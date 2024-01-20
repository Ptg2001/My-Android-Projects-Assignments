package com.example.practicalno16_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TimePicker;
public class MainActivity extends AppCompatActivity
{
    TimePicker timePicker1, timePicker2, spinnerTimePicker;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind XML References
        timePicker1 = findViewById(R.id.TwelveHourTimePicker);
        timePicker2 = findViewById(R.id.TwentyFourHourTimePicker);
        spinnerTimePicker = findViewById(R.id.SpinnerTimePicker);
        // Set Hour Views
        timePicker1.setIs24HourView(false);
        timePicker2.setIs24HourView(true);
        spinnerTimePicker.setIs24HourView(true);
        // Set Current Time
        timePicker1.setHour(11);
        timePicker1.setMinute(26);
        timePicker2.setHour(23);
        timePicker2.setMinute(32);
        spinnerTimePicker.setHour(23);
        spinnerTimePicker.setMinute(33);
    }
}