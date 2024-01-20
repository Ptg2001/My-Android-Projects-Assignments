package com.example.practicalno_10;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button b1, b2;
    EditText ed1, ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.but1);
        ed1 = findViewById(R.id.user);
        ed2 = findViewById(R.id.pass);

        b2 = (Button) findViewById(R.id.but2);
        tx1 = (TextView) findViewById(R.id.tx11);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("Bhavesh") && ed2.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    hideKeyboard(v);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                    hideKeyboard(v);

                }
            }

            private void hideKeyboard(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
            }

        });

    }
}