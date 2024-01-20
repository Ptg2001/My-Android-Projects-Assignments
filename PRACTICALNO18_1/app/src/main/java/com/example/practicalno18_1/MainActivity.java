package com.example.practicalno18_1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity
{
    // Reference Variables
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind XML Reference
        editText = findViewById(R.id.textBox);
    }
    public void navigate(View view)
    {
        // Convert edit text value to string
        String uriString = editText.getText().toString();
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}