package com.example.loginformusingtoast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // Variable Declarations
    EditText username, password;
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usernameText);
        password = findViewById(R.id.passwordText);
        resultView = findViewById(R.id.resultView);
    }
    public void checkCredentials(View v)
    {
        if (username.getText().toString().equals("Piyush") &&
                password.getText().toString().equals("123"))
        {
            resultView.setVisibility(View.VISIBLE);
        }
        else
        {
            Toast.makeText(this, "Login Failed !!!", Toast.LENGTH_SHORT).show();
        }
    }
}