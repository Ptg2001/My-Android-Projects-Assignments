package com.example.sms;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText txtMobile,txtMessage;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMobile = findViewById(R.id.mblTxt);
        txtMessage = findViewById(R.id.msgTxt);
    }
    public void sendSms(View v){
        String s1 = txtMobile.getText().toString();
        String s2 = txtMessage.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(s1,null,s2,null,null);
        Toast.makeText(MainActivity.this,"Sms Sent Successfully",Toast.LENGTH_SHORT).show();
    }
}