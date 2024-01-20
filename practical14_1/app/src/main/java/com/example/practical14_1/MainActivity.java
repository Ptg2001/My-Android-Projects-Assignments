package com.example.practical14_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity
{
    // Variable Declarations
    ListView myList;
    String[] OS = {
            "Android", "Java", "PHP", "Hadoop",
            "SAP", "Python", "AJAX", "C++",
            "Ruby", "Rails", "C", "JavaScript", "SQL"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, OS);
        myList.setAdapter(arrayAdapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String item = arrayAdapter.getItem(position);
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}