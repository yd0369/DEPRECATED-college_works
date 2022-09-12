package com.yash_desai_and_sonu_tiwari.p24e1.bluetoothconnectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static android.bluetooth.BluetoothAdapter.getDefaultAdapter;

public class MainActivity extends AppCompatActivity {
    boolean visible_flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getDefaultAdapter() == null) {
            ((TextView) findViewById(R.id.status)).setText("Your Device doesn't Support Bluetooth");
            ((Button) findViewById(R.id.list_btn)).setEnabled(false);
            ((Button) findViewById(R.id.get_visible_btn)).setEnabled(false);

        } else {
            if ((getDefaultAdapter()).isEnabled()) {
                ((TextView) findViewById(R.id.status)).setText("Status : On");
                ((Button) findViewById(R.id.list_btn)).setEnabled(true);
                ((Button) findViewById(R.id.get_visible_btn)).setEnabled(true);
            } else {
                ((TextView) findViewById(R.id.status)).setText("Status : Off");
                ((Button) findViewById(R.id.list_btn)).setEnabled(false);
                ((Button) findViewById(R.id.get_visible_btn)).setEnabled(false);
            }
        }
        ((Switch) findViewById(R.id.key)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((((Switch) findViewById(R.id.key)).isChecked()) == true) {
                    ((TextView) findViewById(R.id.status)).setText("Status : On");
                    startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE), 1);
                    ((Button) findViewById(R.id.list_btn)).setEnabled(true);
                    ((Button) findViewById(R.id.get_visible_btn)).setEnabled(true);
                } else {
                    ((TextView) findViewById(R.id.status)).setText("Status : Off");
                    ((Button) findViewById(R.id.list_btn)).setEnabled(false);
                    ((Button) findViewById(R.id.get_visible_btn)).setEnabled(false);
                    (getDefaultAdapter()).disable();
                }
            }
        });
        ((Button) findViewById(R.id.list_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Set<BluetoothDevice> pairedDevices = (getDefaultAdapter()).getBondedDevices();
                ArrayList list = new ArrayList();
                if(pairedDevices.size()>0){
                    for(BluetoothDevice device: pairedDevices){
                        list.add("Name : "+device.getName()+"\nMAC Address : "+device.getAddress());
                    }
                    ((ListView) findViewById(R.id.list)).setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list));
                }
                else {
                    list.add("Empty [No Device Found]");
                    ((ListView) findViewById(R.id.list)).setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list));
                }
            }
        });

        ((Button) findViewById(R.id.get_visible_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE), 0);
                ((Button) findViewById(R.id.get_visible_btn)).setEnabled(false);
            }
        });
    }
}