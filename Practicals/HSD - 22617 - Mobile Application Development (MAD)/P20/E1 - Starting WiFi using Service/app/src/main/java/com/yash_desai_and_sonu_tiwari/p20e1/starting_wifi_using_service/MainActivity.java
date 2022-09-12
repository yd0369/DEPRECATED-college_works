package com.yash_desai_and_sonu_tiwari.p20e1.starting_wifi_using_service;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            if(((WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE)).isWifiEnabled()) {
                ((TextView) findViewById(R.id.status)).setText("Status : On");
                ((Switch) findViewById(R.id.key)).setChecked(true);
            }
            else {
                ((TextView) findViewById(R.id.status)).setText("Status : Off");
                ((Switch) findViewById(R.id.key)).setChecked(false);
            }
        ((Switch) findViewById(R.id.key)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((((Switch) findViewById(R.id.key)).isChecked()) == true) {
                    ((TextView) findViewById(R.id.status)).setText("Status : On");
                    ((WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE)).setWifiEnabled(true);
                }
                else {
                    ((TextView) findViewById(R.id.status)).setText("Status : Off");
                    ((WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE)).setWifiEnabled(false);
                }
            }
        });
    }
}