package com.example.email;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText eTo, eSubject, eMsg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTo = findViewById(R.id.txtTo);
        eSubject = findViewById(R.id.txtSub);
        eMsg = findViewById(R.id.txtMsg);
    }
        public void sendEmail(View v){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{eTo.getText().toString()});
        i.putExtra(Intent.EXTRA_SUBJECT,eSubject.getText().toString());
        i.putExtra(Intent.EXTRA_TEXT,eMsg.getText());
        i.setType("plain/text");
        startActivity(Intent.createChooser(i,"Mail sent"));
    }
}
