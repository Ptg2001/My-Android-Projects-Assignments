package com.example.practical14_3;import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
{

    final String numbers[] = new String[]{
            "1", "2", "3",
            "4", "5", "6",
            "7", "8", "9",
            "10", "11", "12",
            "13", "14", "15"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = findViewById(R.id.myGridView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_main, R.id.btn, numbers);
        gridView.setAdapter(arrayAdapter);

    }
}