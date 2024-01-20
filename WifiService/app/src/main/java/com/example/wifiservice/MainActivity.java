package com.example.wifiservice;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity
{
    // Reference Variables
    ToggleButton toggleButton;
    ImageView imageView;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind XML References
        toggleButton = findViewById(R.id.myToggleButton);
        wifiManager = (WifiManager)
                getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }
    public void checkState(View view)
    {
        if (toggleButton.isChecked())
        {
            wifiManager.setWifiEnabled(true);
            imageView.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Wifi "+toggleButton.getTextOn(),
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            wifiManager.setWifiEnabled(false);
            imageView.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Wifi "+toggleButton.getTextOff(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}