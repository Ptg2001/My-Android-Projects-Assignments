package com.example.pract_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    // Variable Declarations
    Button turnOn, turnOff, getVisible, listDevices;
    ListView listView;
    ImageView imageView;
    TextView textView;
    ArrayAdapter<String> arrayAdapter;
    public BluetoothAdapter bluetoothAdapter =
            BluetoothAdapter.getDefaultAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind XML Reference
        turnOn = findViewById(R.id.onButton);
        turnOff = findViewById(R.id.offButton);
        getVisible = findViewById(R.id.getVisibleButton);
        listDevices = findViewById(R.id.listButton);
        listView = findViewById(R.id.listView);
        imageView = findViewById(R.id.imageIcon);
        textView = findViewById(R.id.textView);
    }

    public void turnOnBluetooth(View view) {
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth Is Not Supported ... ",
                    Toast.LENGTH_SHORT).show();
        } else {
            if (!bluetoothAdapter.isEnabled()) {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                bluetoothAdapter.enable();
                imageView.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Bluetooth Turned On !",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void getVisibleDevices(View view) {
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth Is Not Supported ... ",
                    Toast.LENGTH_SHORT).show();
        } else {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_SCAN) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            if (!bluetoothAdapter.isDiscovering()) {
                Toast.makeText(this, "Making Device Discoverable ... ", Toast.LENGTH_SHORT).show();
                startActivityForResult(new
                        Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE), 0);
            }
        }
    }

    public void listDevices(View view) {
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth Is Not Supported ... ",
                    Toast.LENGTH_SHORT).show();
        } else {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            Set<BluetoothDevice> obj = bluetoothAdapter.getBondedDevices();
            ArrayList<String> arrayList = new ArrayList<>();
            if (obj.size() > 0) {
                for (BluetoothDevice bluetoothDevice : obj) {
                    String name = bluetoothDevice.getName();
                    String macAddress = bluetoothDevice.getAddress();
                    arrayList.add("Device Name : " + name + "\n" +
                            "Device MAC Address : " + macAddress);
                }
                textView.setVisibility(View.VISIBLE);
                arrayAdapter = new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1, arrayList);
                listView.setAdapter(arrayAdapter);
            }
        }
    }

    public void turnOffBluetooth(View view) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        bluetoothAdapter.disable();
        imageView.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.INVISIBLE);
        Toast.makeText(this, "Bluetooth Turned Off !",
                Toast.LENGTH_SHORT).show();
    }
}
