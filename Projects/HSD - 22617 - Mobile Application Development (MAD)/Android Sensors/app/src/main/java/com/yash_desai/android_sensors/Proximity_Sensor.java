package com.yash_desai.android_sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Proximity_Sensor extends AppCompatActivity implements SensorEventListener {
    SensorManager SensorMan;
    Sensor Proximity_Sensor;
    boolean Flag = false;
    Float Last_Value = 0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.proximity_sensor);
        SensorMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Proximity_Sensor = SensorMan.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        SensorMan.registerListener(this ,Proximity_Sensor,SensorManager.SENSOR_DELAY_FASTEST);
        ((FrameLayout) findViewById(R.id.BG_Proximity_Sensor)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Flag) {
                    Flag = false;
                    ((TextView) findViewById(R.id.INFO_Proximity_Sensor)).setText(Last_Value + "");
                }
                else {
                    Flag = true;
                    ((TextView) findViewById(R.id.INFO_Proximity_Sensor)).setText(Last_Value + "\n\n\n" + "[PAUSED]");
                }
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(!Flag) {
            ((TextView) findViewById(R.id.INFO_Proximity_Sensor)).setText(Float.toString(event.values[0]));
            if (event.values[0] == 0) {
                ((FrameLayout) findViewById(R.id.BG_Proximity_Sensor)).setBackgroundColor(0xFF000000);
                ((TextView) findViewById(R.id.INFO_Proximity_Sensor)).setTextColor(0xFFFFFFFF);
            } else {
                ((FrameLayout) findViewById(R.id.BG_Proximity_Sensor)).setBackgroundColor(0xFFFFFFFF);
                ((TextView) findViewById(R.id.INFO_Proximity_Sensor)).setTextColor(0xFF000000);
            }
            Last_Value = event.values[0];
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}

