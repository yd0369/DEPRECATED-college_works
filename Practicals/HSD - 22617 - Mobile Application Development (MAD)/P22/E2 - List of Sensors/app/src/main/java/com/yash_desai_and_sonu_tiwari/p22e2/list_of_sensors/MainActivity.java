package com.yash_desai_and_sonu_tiwari.p22e2.list_of_sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        String STR = "";
        for( Sensor S : deviceSensors ) {
             STR += "Name : "+S.getName()+
                   "\nType : "+S.getType()+
                     "\n==================================================\n";
        }
        ((TextView) findViewById(R.id.LIST)).setText(STR);
    }
}
