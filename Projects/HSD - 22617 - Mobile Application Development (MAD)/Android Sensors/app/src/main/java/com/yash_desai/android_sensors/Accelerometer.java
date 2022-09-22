package com.yash_desai.android_sensors;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import java.util.Random;

public class Accelerometer extends AppCompatActivity implements SensorEventListener {
    SensorManager SenseMan;
    Sensor Accelerometer;
    private int X=0,Y=0,Z=0,COLOR=0xFFFFFFFF;
    boolean Flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.accelerometer);
        SenseMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Accelerometer = SenseMan.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        SenseMan.registerListener(this,Accelerometer,SenseMan.SENSOR_DELAY_FASTEST);

        ((FrameLayout) findViewById(R.id.BG_Accelerometer)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Flag) {
                    Flag = false;
                }
                else {
                    Flag = true;
                    ((TextView) findViewById(R.id.INFO_Accelerometer)).setText(((TextView) findViewById(R.id.INFO_Accelerometer)).getText() + "\n\n[PAUSED]");
                }
            }
        });
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        if(!Flag) {
            if (((int)event.values[0] != X) && ((int)event.values[1] != Y) && ((int)event.values[2] != Z)) {
                COLOR = 0xFF000000  +new Random().nextInt(16777215);
                ((FrameLayout) findViewById(R.id.BG_Accelerometer)).setBackgroundColor(COLOR);
            }
            ((TextView) findViewById(R.id.INFO_Accelerometer)).setText("[ X : " + event.values[0] + " ]\n[ Y : " + event.values[1] + " ]\n[ Z : " + event.values[2] + "]\n\n#"+Integer.toHexString(COLOR).toUpperCase());
            X = (int) event.values[0];
            Y = (int) event.values[1];
            Z = (int) event.values[2];
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

}