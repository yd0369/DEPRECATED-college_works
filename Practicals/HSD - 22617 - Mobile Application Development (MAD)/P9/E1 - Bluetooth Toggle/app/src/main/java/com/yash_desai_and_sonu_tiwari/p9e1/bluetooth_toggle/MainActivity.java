package com.yash_desai_and_sonu_tiwari.p9e1.bluetooth_toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(BluetoothAdapter.getDefaultAdapter() == null) {
            ((TextView) findViewById(R.id.status)).setText("Your Device doesn't Support Bluetooth");

        } else {
            if((BluetoothAdapter.getDefaultAdapter()).isEnabled()) {
                ((TextView) findViewById(R.id.status)).setText("Status : On");
            }
            else {
                ((TextView) findViewById(R.id.status)).setText("Status : Off");
            }
        }
        ((Switch) findViewById(R.id.key)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((((Switch) findViewById(R.id.key)).isChecked()) == true) {
                    ((TextView) findViewById(R.id.status)).setText("Status : On");
                    startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),1);
                }
                else {
                    ((TextView) findViewById(R.id.status)).setText("Status : Off");
                    (BluetoothAdapter.getDefaultAdapter()).disable();
                }
            }
        });

    }
}